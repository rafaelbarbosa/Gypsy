package com.gypsy;


import com.gypsy.dialects.sql.HSQLDB;
import org.reflections.Reflections;
import org.reflections.scanners.TypeAnnotationsScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.Entity;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;
import javax.persistence.spi.PersistenceUnitInfo;
import javax.persistence.spi.ProviderUtil;
import java.lang.instrument.Instrumentation;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: NB18058
 * Date: 21-07-2012
 * Time: 15:12
 * To change this template use File | Settings | File Templates.
 */
public class PersistenceProvider implements javax.persistence.spi.PersistenceProvider  {
    private static final Logger logger = LoggerFactory.getLogger(PersistenceProvider.class);

    private static final String DIALECT_KEY ="com.gypsy.dialect";
    private static final String LOGLEVEL_KEY ="com.gypsy.loglevel";


    @Override
    public EntityManagerFactory createEntityManagerFactory(String s, Map map) {
        return new com.gypsy.EntityManagerFactory();
    }

    @Override
    public EntityManagerFactory createContainerEntityManagerFactory(PersistenceUnitInfo persistenceUnitInfo, Map map) {

        com.gypsy.EntityManagerFactory entityManagerFactory = new com.gypsy.EntityManagerFactory();

        if(persistenceUnitInfo.getJtaDataSource() != null){
            entityManagerFactory.setDataSource(persistenceUnitInfo.getJtaDataSource());
        }
        else if (persistenceUnitInfo.getNonJtaDataSource() != null){
            entityManagerFactory.setDataSource(persistenceUnitInfo.getNonJtaDataSource());
        }
        else{
            throw new PersistenceException("A data source must be defined");
        }






        if(!persistenceUnitInfo.getProperties().containsKey(DIALECT_KEY)){
            throw new PersistenceException(DIALECT_KEY +" must be defined in persistence unit properties");
        }

        String dialect =  persistenceUnitInfo.getProperties().getProperty(DIALECT_KEY);

        entityManagerFactory.setDialect(new HSQLDB());



        if(!persistenceUnitInfo.excludeUnlistedClasses()){
            //TODO:IMPLEMENT CLASSPATH SEARCH FOR UNLISTED CLASSES

            Reflections reflections = new Reflections(new ConfigurationBuilder().addUrls(ClasspathHelper.forClassLoader(ClasspathHelper.contextClassLoader())).addClassLoader(persistenceUnitInfo.getClassLoader()).addClassLoader(persistenceUnitInfo.getNewTempClassLoader()));

            Set<Class<?>> entities = reflections.getTypesAnnotatedWith(Entity.class);



            Iterator<Class<?>> entitiesIterator = entities.iterator();
            while(entitiesIterator.hasNext()){
                logger.error(entitiesIterator.next().getCanonicalName());
            }
        }


        return new com.gypsy.EntityManagerFactory();
    }

    @Override
    public ProviderUtil getProviderUtil() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}

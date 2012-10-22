package com.gypsy;

import com.gypsy.dialects.Dialect;

import javax.persistence.*;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.metamodel.Metamodel;
import javax.sql.DataSource;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: NB18058
 * Date: 21-07-2012
 * Time: 15:14
 * To change this template use File | Settings | File Templates.
 */
public class EntityManagerFactory implements javax.persistence.EntityManagerFactory {

    private DataSource dataSource;

    private Dialect dialect;



    @Override
    public EntityManager createEntityManager() {
        return new com.gypsy.EntityManager(dataSource, dialect);
    }

    @Override
    public EntityManager createEntityManager(Map map) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public CriteriaBuilder getCriteriaBuilder() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Metamodel getMetamodel() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isOpen() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void close() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Map<String, Object> getProperties() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Cache getCache() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PersistenceUnitUtil getPersistenceUnitUtil() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Dialect getDialect() {
        return dialect;
    }

    public void setDialect(Dialect dialect) {
        this.dialect = dialect;
    }
}

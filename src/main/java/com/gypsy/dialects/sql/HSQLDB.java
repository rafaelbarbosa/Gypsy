package com.gypsy.dialects.sql;

import com.gypsy.dialects.Dialect;

import javax.persistence.*;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: NB18058
 * Date: 21-07-2012
 * Time: 12:03
 * To change this template use File | Settings | File Templates.
 */
public class HSQLDB implements Dialect {

    private Connection connection;

    @Override
    public Connection getConnection() {
        return connection;
    }

    @Override
    public boolean createTable() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean updateTable() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public <T> List<T> getResultList(Query query, Class<T> clazz) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int executeUpdate(Query query) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getFirstResult(Query query) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getMaxResults(Query query) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public EntityTransaction getTransaction() {
        return new JDBCEntityTransaction();
    }

    @Override
    public void persist(Object o) throws PersistenceException {
        if(o.getClass().getAnnotation(Entity.class) == null){
            throw new PersistenceException("Object is not a JPA Entity");
        }

        for(Field field : o.getClass().getFields()){
            if(field.getAnnotation(Id.class) != null){

            }

        }

    }
}

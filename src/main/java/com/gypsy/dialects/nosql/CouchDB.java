package com.gypsy.dialects.nosql;

import com.gypsy.dialects.Dialect;
import com.gypsy.dialects.nosql.couchdb.CouchDBEntityTransaction;

import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import java.sql.Connection;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: NB18058
 * Date: 21-07-2012
 * Time: 16:09
 * To change this template use File | Settings | File Templates.
 */
public class CouchDB implements Dialect {


    @Override
    public Connection getConnection() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
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
        return new CouchDBEntityTransaction();
    }

    @Override
    public void persist(Object o) throws PersistenceException {

    }
}

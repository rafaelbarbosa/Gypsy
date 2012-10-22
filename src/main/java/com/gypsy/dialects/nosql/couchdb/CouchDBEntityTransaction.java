package com.gypsy.dialects.nosql.couchdb;

import javax.persistence.EntityTransaction;

/**
 * Created with IntelliJ IDEA.
 * User: NB18058
 * Date: 21-07-2012
 * Time: 19:01
 * To change this template use File | Settings | File Templates.
 */
public class CouchDBEntityTransaction implements EntityTransaction {

    @Override
    public void begin() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void commit() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void rollback() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setRollbackOnly() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean getRollbackOnly() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isActive() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}

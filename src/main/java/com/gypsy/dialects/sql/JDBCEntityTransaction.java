package com.gypsy.dialects.sql;

import javax.persistence.EntityTransaction;
import java.sql.Connection;

/**
 * Created with IntelliJ IDEA.
 * User: NB18058
 * Date: 22-07-2012
 * Time: 22:03
 * To change this template use File | Settings | File Templates.
 */
public class JDBCEntityTransaction implements EntityTransaction {
    private Connection connection;

    @Override
    public void begin() {



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

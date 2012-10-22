package com.gypsy.dialects;

import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import java.sql.Connection;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: NB18058
 * Date: 21-07-2012
 * Time: 12:04
 * To change this template use File | Settings | File Templates.
 */
public interface Dialect{
    Connection getConnection();

    boolean createTable();
    boolean updateTable();

    <T> List<T> getResultList(Query query ,Class<T> clazz);
    int executeUpdate(Query query);
    int getFirstResult(Query query);
    int getMaxResults(Query query);

    EntityTransaction getTransaction();


    void persist(Object o) throws PersistenceException;
}

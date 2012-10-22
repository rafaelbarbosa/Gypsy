package org.springframework.orm.jpa.vendor;

import javax.persistence.spi.PersistenceProvider;

/**
 * Created with IntelliJ IDEA.
 * User: NB18058
 * Date: 21-07-2012
 * Time: 15:10
 * To change this template use File | Settings | File Templates.
 */
public class GypsyVendorAdapter extends AbstractJpaVendorAdapter {
    PersistenceProvider persistenceProvider = new com.gypsy.PersistenceProvider();

    @Override
    public PersistenceProvider getPersistenceProvider() {
        return persistenceProvider;
    }

    @Override
    public String getPersistenceProviderRootPackage() {
        return "com.gypsy";
    }



}

package org.adscale.concordion.demo;

import org.adscale.fitnesseRf.fixtures.scenario.CreateAccount;

import org.concordion.integration.junit3.ConcordionTestCase;
import org.junit.Test;

/**
 * Copyright AdScale GmbH, Germany, 2007
 */
public class CreateAccountTest extends ConcordionTestCase {

    @Test
    public void canCreateAnAccount() throws Exception {
    }


    public boolean createAnAccountCalled(String name) {
        return false;
    }


    public boolean findsAccountCalled(String name) {
        return false;
    }

}

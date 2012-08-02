package org.adscale.concordion.demo2;

import org.concordion.integration.junit3.ConcordionTestCase;
import org.junit.Test;

/**
 * Copyright AdScale GmbH, Germany, 2007
 */
public class CreateAccountTest extends ConcordionTestCase {
    public boolean createAnAccountCalled(String name){
        return true;
    }

    public boolean thereIsAnAccountCalled(String name) {
        return true;
    }
}

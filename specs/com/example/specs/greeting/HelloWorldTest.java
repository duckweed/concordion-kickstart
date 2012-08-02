package com.example.specs.greeting;

import org.concordion.integration.junit3.ConcordionTestCase;

import com.example.Greeter;

public class HelloWorldTest extends ConcordionTestCase {
    
    public String greetingFor(String firstName) {
        return new Greeter().greetingFor(firstName);
    }
}

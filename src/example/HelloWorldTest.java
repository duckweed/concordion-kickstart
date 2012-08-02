package example;

import org.concordion.integration.junit3.ConcordionTestCase;

public class HelloWorldTest extends ConcordionTestCase {

    public String getGreeting() {
        return "Hello World!";
    }

    public String greetingFor(String firstName) {
        return "Hello " + firstName + "!";
    }

}

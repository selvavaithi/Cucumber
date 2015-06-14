package org.sayem.cucumber.step.definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by syed.sayem on 6/14/15.
 */
public class Cucumber {

    @Given("^this is my first step$")
    public void thisIsMyFirstStep() throws Throwable {
        System.out.println("first step");
    }

    @When("^this is my second step$")
    public void thisIsMySecondStep() throws Throwable {
        System.out.println("second step");

    }

    @Then("^this is my final step$")
    public void thisIsMyFinalStep() throws Throwable {
        System.out.println("third step");
    }
}

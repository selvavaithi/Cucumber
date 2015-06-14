package org.sayem.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by syed.sayem on 6/14/15.
 */
public class Checkout {

    @Given("^the price of a \"(.*?)\" is (\\d+)c$")
    public void thePriceOfBanana(String arg1, int arg2) throws Throwable {
        System.out.println();
    }

    @When("^I checkout (\\d+) \"(.*?)\"$")
    public void checkoutBanana(int arg1, String arg2) throws Throwable {
        System.out.println();
    }

    @Then("^the total price should be (\\d+)c$")
    public void theTotalPriceShouldBe(int arg1) throws Throwable {
        System.out.println();
    }
}

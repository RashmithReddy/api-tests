package com.api.gumtree.stepdefs;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ApiStepdefs extends BaseStep{

    private int userId;

    @Given("^I have a random user id generated$")
    public void i_have_a_random_user_id_generated() throws Throwable {
        userId = getRandomNumber();
        System.out.println(userId);
    }

    @When("^I make a GET call with the user id$")
    public void i_make_a_GET_call_with_the_user_id() throws Throwable {

    }

    @Then("^I should print the email ID in the console\\.$")
    public void i_should_print_the_email_ID_in_the_console() throws Throwable {

    }

}

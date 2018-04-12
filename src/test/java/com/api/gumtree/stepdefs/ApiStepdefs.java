package com.api.gumtree.stepdefs;


import com.api.gumtree.helpers.RestApiInterface;
import com.jayway.restassured.response.Response;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import javax.inject.Inject;

public class ApiStepdefs extends BaseStep{
    @Inject
    RestApiInterface restApiInterface;
    private static int userId;

    @Given("^I have a random user id generated$")
    public void i_have_a_random_user_id_generated() throws Throwable {
        userId = getRandomNumber();
        System.out.println("User id  "+userId);
    }

    @When("^I make a GET call with the user id$")
    public void i_make_a_GET_call_with_the_user_id() throws Throwable {
        Response response = restApiInterface.GetUser(userId);
        System.out.println("First time");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(200, statusCode);
    }

    @Then("^I should print the email ID in the console$")
    public void i_should_print_the_email_ID_in_the_console() throws Throwable {
        String emailValue = restApiInterface.getUserField("email");
        System.out.println("Email value is : " + emailValue);
    }

}

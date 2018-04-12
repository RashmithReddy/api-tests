package com.api.gumtree.stepdefs;


import com.api.gumtree.helpers.RestApiInterface;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import javax.inject.Inject;

public class ApiStepdefs extends BaseStep{
    @Inject
    RestApiInterface restApiInterface;
    private static int userId;
    private static int statusCode;

    @Given("^I have a random user id generated$")
    public void i_have_a_random_user_id_generated() throws Throwable {
        userId = getRandomNumber();
        System.out.println("User id  "+userId);
    }

    @When("^I make a GET call with the user id$")
    public void i_make_a_GET_call_with_the_user_id() throws Throwable {
        restApiInterface.GetUser(userId);
        System.out.println("First time");
        statusCode = restApiInterface.getStatusCode();
        Assert.assertEquals(200, statusCode);
    }

    @Then("^I should print the email ID in the console$")
    public void i_should_print_the_email_ID_in_the_console() throws Throwable {
        System.out.println("Email value is : " + restApiInterface.getUserField("email"));
    }


    @Then("^I use the userId to get the associated posts and validate the post Id's$")
    public void i_use_the_userId_to_get_the_associated_posts_and_validate_the_post_Id_s() throws Throwable {
        System.out.println("Second time" + userId);
        restApiInterface.getPostsForTheUser(userId);
        statusCode = restApiInterface.getStatusCode();
        Assert.assertEquals(200, statusCode);
        restApiInterface.checkPostIdValid(); // NOTE:- COULD NOT Validate the PoSTID from results because the API is not retuning PostId field.
        //Ex : When i make a get call to this URL : https://jsonplaceholder.typicode.com/users/1/posts . The response does not have any post ID
    }


    @Then("^I use the userId to make a post with title (.*) and body (.*)$")
    public void i_use_the_userId_to_make_a_post_with_a_non_empty_title_and_body_and_verify_the_response(String title, String body) throws Throwable {
        restApiInterface.insertPost(title, body, userId);
    }

    @Then("^I verify the response$")
    public void verify_the_response() throws Throwable {
        statusCode = restApiInterface.getStatusCode();
        Assert.assertEquals(201, statusCode);
    }




}

@wip
Feature: As a user
  I would like to make calls to the Rest API
  So that i can get and post data using the API

  Scenario: Get User ID and print the email address to console
    Given I have a random user id generated
    When I make a GET call with the user id
    Then I should print the email ID in the console
    And I use the userId to get the associated posts and validate the post Id's
    And I use the userId to make a post with title Reddy and body longString
    And I verify the response




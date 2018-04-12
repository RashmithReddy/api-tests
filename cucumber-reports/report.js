$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("getAndPostWithSameUserID.feature");
formatter.feature({
  "line": 2,
  "name": "As a user",
  "description": "I would like to make calls to the Rest API\nSo that i can get and post data using the API",
  "id": "as-a-user",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@wip"
    }
  ]
});
formatter.before({
  "duration": 731918063,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Get User ID and print the email address to console",
  "description": "",
  "id": "as-a-user;get-user-id-and-print-the-email-address-to-console",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I have a random user id generated",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I make a GET call with the user id",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should print the email ID in the console",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I use the userId to get the associated posts and validate the post Id\u0027s",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I use the userId to make a post with title Reddy and body longString",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I verify the response",
  "keyword": "And "
});
formatter.match({
  "location": "ApiStepdefs.i_have_a_random_user_id_generated()"
});
formatter.result({
  "duration": 147170522,
  "status": "passed"
});
formatter.match({
  "location": "ApiStepdefs.i_make_a_GET_call_with_the_user_id()"
});
formatter.result({
  "duration": 1651122149,
  "status": "passed"
});
formatter.match({
  "location": "ApiStepdefs.i_should_print_the_email_ID_in_the_console()"
});
formatter.result({
  "duration": 518427221,
  "status": "passed"
});
formatter.match({
  "location": "ApiStepdefs.i_use_the_userId_to_get_the_associated_posts_and_validate_the_post_Id_s()"
});
formatter.result({
  "duration": 162965160,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Reddy",
      "offset": 43
    },
    {
      "val": "longString",
      "offset": 58
    }
  ],
  "location": "ApiStepdefs.i_use_the_userId_to_make_a_post_with_a_non_empty_title_and_body_and_verify_the_response(String,String)"
});
formatter.result({
  "duration": 539782248,
  "status": "passed"
});
formatter.match({
  "location": "ApiStepdefs.verify_the_response()"
});
formatter.result({
  "duration": 158504,
  "status": "passed"
});
formatter.after({
  "duration": 401220,
  "status": "passed"
});
});
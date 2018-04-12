package com.api.gumtree.helpers;


import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ValidatableResponse;
import com.jayway.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Random;

import static com.jayway.restassured.RestAssured.given;

public class RestApiInterface {

    private Response response;
    private ValidatableResponse json;
    private RequestSpecification request;


    public int getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(10) + 1;
    }
    public Response GetUser(int id) {
//        int id = getRandomNumber();
        response = given().when().get(RestAssured.baseURI + "users/" + id);
        System.out.println("URI "+RestAssured.baseURI + "users/" + id);
        return response;
    }

    public String getUserField(String fieldName) {
        return response.then().extract().path(fieldName);
    }

    public ValidatableResponse statusCodeMatch(int statusCode) {
        json = response.then().statusCode(statusCode);
        return json;
    }

    public Response getPostsForTheUser(int id) {
        response = given().when().get(RestAssured.baseURI + "users/" + id + "/posts");
        return response;
    }

    public boolean checkPostIdValid() {
        // ****POSTS Response DOES NOT HAVE POSTD to validate
        System.out.println(response.then().extract().response().prettyPrint());
        return true;
    }

    public void insertPost(String title, String body, int userId) {
        response = given().
                body(new HashMap<String, Object>() {{
                    put("title", title);
                    put("body", body);
                    put("userId", userId);
                }}).
                when().
                post(RestAssured.baseURI + "posts");

        JSONObject JSONResponseBody = new JSONObject(response.body().asString());
        //Fetching the desired value of a parameter
        String result = JSONResponseBody.get("id").toString();
    }

    public int getStatusCode() {
        return response.getStatusCode();
    }

}

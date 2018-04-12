package com.api.gumtree.helpers;


import com.api.gumtree.config.Environment;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.config.EncoderConfig;
import com.jayway.restassured.config.RestAssuredConfig;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks {

    private String baseURI = Environment.getProperty("baseURI");


    @Before
    public void beforeScenario() throws IOException {
        RestAssured.config = new RestAssuredConfig().encoderConfig(EncoderConfig.encoderConfig().defaultContentCharset("UTF-8"));
        RestAssured.baseURI = baseURI;
    }

    @After
    public void afterScenario() {
    }

}

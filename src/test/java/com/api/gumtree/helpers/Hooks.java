package com.api.gumtree.helpers;


import com.api.gumtree.config.Environment;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks {

    private String baseURI = Environment.getProperty("googleURL");


    @Before
    public void beforeScenario() throws IOException {

    }

    @After
    public void afterScenario() {
    }

}

package com.api.gumtree.stepdefs;

import java.util.Random;

public class BaseStep {

    protected int getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(10) + 1;
    }


}

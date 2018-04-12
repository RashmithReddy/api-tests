package com.api.gumtree.config;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Environment {
    public static Properties getProperties() throws IOException {
        String inJarOffClasspathRootPath = "env.properties";
        InputStream inputStream = Environment.class.getClassLoader().getResourceAsStream(inJarOffClasspathRootPath);
        Properties props = new Properties();
        props.load(inputStream);
        inputStream.close();
        return props;
    }

    public static String getProperty(String key) {
        String value = "";
        try {
            value = getProperties().getProperty(key);
        }
        catch (IOException ex) {
            System.out.println("Oops. Something went wrong");
        }

        return value;
    }
}

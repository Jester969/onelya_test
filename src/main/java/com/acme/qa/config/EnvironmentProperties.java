package com.acme.qa.config;

import java.io.IOException;
import java.util.Properties;

public class EnvironmentProperties extends Properties {

    private static EnvironmentProperties environmentProperties;

    static EnvironmentProperties get(String filePath) {
        if (environmentProperties == null) {
            try {
                environmentProperties = new EnvironmentProperties();
                environmentProperties.load(EnvironmentProperties.class.getResourceAsStream("/properties/environment" + filePath));
            } catch (IOException e) {
                throw new RuntimeException("Can't load properties file by path [/properties/environment" + filePath + "]");
            }
        }
        return environmentProperties;
    }

    public String getCreditCardFormUrl() {
        return getProperty("CREDIT_CARD_FORM_URL");
    }
}

package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {
        String user = "Sukalyan";
        int age = 21;

        logger.info("User {} has logged in", user);
        logger.debug("User {} is {} years old", user, age);
        logger.warn("Disk space low for user: {}", user);
        logger.error("User {} encountered an unknown error at {}", user, System.currentTimeMillis());
    }
}

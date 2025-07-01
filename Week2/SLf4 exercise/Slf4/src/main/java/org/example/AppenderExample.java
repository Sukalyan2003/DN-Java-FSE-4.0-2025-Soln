package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppenderExample {
    private static final Logger logger = LoggerFactory.getLogger(AppenderExample.class);

    public static void main(String[] args) {
        logger.debug("This is a debug message");
        logger.info("This message goes to both console and file");
        logger.warn("This is a warning");
        logger.error("This is an error message");
    }
}

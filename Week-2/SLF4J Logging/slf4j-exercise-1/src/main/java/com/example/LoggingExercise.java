package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExercise {
    private static final Logger logger = LoggerFactory.getLogger(LoggingExercise.class);

    public static void main(String[] args) {
        logger.error("This is an error message");
        logger.warn("This is a warning message");
        logger.info("This is an info message");
        logger.debug("This is a debug message"); 
    }
}

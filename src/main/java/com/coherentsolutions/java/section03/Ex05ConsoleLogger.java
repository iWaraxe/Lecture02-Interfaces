package com.coherentsolutions.java.section03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * This class implements the Logger interface and utilizes the default logging methods.
 * It doesn't need to override the default methods unless specific behavior is required.
 */
public class Ex05ConsoleLogger implements Ex04Logger {

    public static void main(String[] args) {
        Ex05ConsoleLogger logger = new Ex05ConsoleLogger();
        logger.logInfo("This is an info message.");   // Output: INFO: This is an info message.
        logger.logError("This is an error message.");// Output: ERROR: This is an error message.
    }
}

package com.coherentsolutions.java.section04;

/**
 * This class implements the Logger interface and utilizes the default logging methods.
 * It doesn't need to override the default methods unless specific behavior is required.
 */
public class Ex06ConsoleLogger implements Ex05Logger {

    public static void main(String[] args) {
        Ex06ConsoleLogger logger = new Ex06ConsoleLogger();
        logger.logInfo("This is an informational message."); // Output: INFO: This is an informational message.
        logger.logDebug("This is a debug message.");         // Output: DEBUG: This is a debug message.
        logger.logError("This is an error message.");        // Output: ERROR: This is an error message.
    }
}

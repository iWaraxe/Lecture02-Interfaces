package com.coherentsolutions.java.section03;

/**
 * This interface demonstrates the use of private methods in interfaces.
 * Private methods are used to avoid code duplication in default methods.
 */
public interface Ex04Logger {

    /**
     * Default method to log an informational message.
     * It uses a private method to handle the actual logging logic.
     *
     * @param message the message to log
     */
    default void logInfo(String message) {
        log("INFO", message);
    }

    /**
     * Default method to log an error message.
     * It uses the same private method to handle the logging logic.
     *
     * @param message the message to log
     */
    default void logError(String message) {
        log("ERROR", message);
    }

    /**
     * Private method to encapsulate the logging logic.
     * This method is used internally by the default methods.
     *
     * @param level   the log level (INFO, ERROR, etc.)
     * @param message the message to log
     */
    private void log(String level, String message) {
        System.out.println(level + ": " + message);
    }
}

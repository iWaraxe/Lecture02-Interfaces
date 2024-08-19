package com.coherentsolutions.java.section04;

/**
 * This interface demonstrates the use of private methods to avoid code duplication in default methods.
 * It includes default methods for logging messages at different levels.
 */
public interface Ex05Logger {

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
     * Default method to log a debug message.
     * It uses the same private method to handle the logging logic.
     *
     * @param message the message to log
     */
    default void logDebug(String message) {
        log("DEBUG", message);
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
     * This method is used internally by the default methods and is not visible to implementing classes.
     *
     * @param level   the log level (INFO, DEBUG, ERROR, etc.)
     * @param message the message to log
     */
    private void log(String level, String message) {
        System.out.println(level + ": " + message);
    }
}

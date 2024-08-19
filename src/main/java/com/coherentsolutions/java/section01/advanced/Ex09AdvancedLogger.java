package com.coherentsolutions.java.section01.advanced;

/**
 * This interface demonstrates advanced use of private methods in interfaces to avoid code duplication.
 * It defines several default methods for logging at different levels.
 */
public interface Ex09AdvancedLogger {

    /**
     * Default method to log an informational message.
     */
    default void logInfo(String message) {
        log("INFO", message);
    }

    /**
     * Default method to log a debug message.
     */
    default void logDebug(String message) {
        log("DEBUG", message);
    }

    /**
     * Default method to log an error message.
     */
    default void logError(String message) {
        log("ERROR", message);
    }

    /**
     * Private method to encapsulate logging logic.
     * This method is used internally by the default methods.
     */
    private void log(String level, String message) {
        System.out.println(level + ": " + message);
    }
}

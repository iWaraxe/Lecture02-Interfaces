package com.coherentsolutions.java.section01.advanced;

/**
 * This class implements the AdvancedLogger interface and utilizes the default logging methods.
 */
public class Ex10ConsoleLogger implements Ex09AdvancedLogger {

    public static void main(String[] args) {
        Ex10ConsoleLogger logger = new Ex10ConsoleLogger();
        logger.logInfo("This is an informational message.");   // Output: INFO: This is an informational message.
        logger.logDebug("This is a debug message.");           // Output: DEBUG: This is a debug message.
        logger.logError("This is an error message.");          // Output: ERROR: This is an error message.
    }
}

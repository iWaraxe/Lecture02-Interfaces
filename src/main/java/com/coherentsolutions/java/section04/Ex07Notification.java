package com.coherentsolutions.java.section04;

/**
 * This interface represents a notification system that can handle different types of notifications.
 * It uses default, static, and private methods to provide a flexible and maintainable design.
 */
public interface Ex07Notification {

    /**
     * Abstract method to send a notification.
     * Implementing classes must provide their own implementation of this method.
     *
     * @param message the message to send
     */
    void send(String message);

    /**
     * Default method to send a notification with a priority level.
     * It uses a private method to format the message with the priority and logs the notification before sending it.
     *
     * @param message  the message to send
     * @param priority the priority level of the notification
     */
    default void sendWithPriority(String message, int priority) {
        String formattedMessage = formatMessageWithPriority(message, priority);
        logNotification(formattedMessage);
        send(formattedMessage);
    }

    /**
     * Private method to format the message with the priority level.
     * This method is used internally by the sendWithPriority() method.
     *
     * @param message  the message to format
     * @param priority the priority level of the notification
     * @return the formatted message
     */
    private String formatMessageWithPriority(String message, int priority) {
        return "Priority " + priority + ": " + message;
    }

    /**
     * Default method to log the notification.
     * This method can be used by implementing classes or inherited as is.
     *
     * @param message the message to log
     */
    default void logNotification(String message) {
        System.out.println("Logging notification: " + message);
    }

    /**
     * Static utility method to format a message.
     * This method can be called directly using the interface name.
     *
     * @param message the message to format
     * @return the formatted message
     */
    static String formatMessage(String message) {
        return "Formatted Message: " + message;
    }
}

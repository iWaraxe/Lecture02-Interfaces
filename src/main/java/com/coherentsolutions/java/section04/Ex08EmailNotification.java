package com.coherentsolutions.java.section04;

/**
 * This class implements the Notification interface and provides a custom implementation
 * for sending an email notification.
 */
public class Ex08EmailNotification implements Ex07Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }

    public static void main(String[] args) {
        Ex08EmailNotification email = new Ex08EmailNotification();
        email.sendWithPriority("Server down!", 1); // Logs and sends with priority

        // Using the static method from the interface
        String formattedMessage = Ex07Notification.formatMessage("Hello, World!");
        System.out.println(formattedMessage); // Output: Formatted Message: Hello, World!
    }
}

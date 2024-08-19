package com.coherentsolutions.java.section04.advanced;

/**
 * This class implements the AdvancedNotification interface and provides a custom implementation
 * for scheduling an email notification.
 */
public class Ex10ScheduledEmailNotification implements Ex09AdvancedNotification {

    @Override
    public void send(String message) {
        System.out.println("Sending scheduled email: " + message);
    }

    public static void main(String[] args) {
        Ex10ScheduledEmailNotification email = new Ex10ScheduledEmailNotification();
        email.scheduleNotification("Server maintenance", 2000); // Schedules and sends after a delay
    }
}

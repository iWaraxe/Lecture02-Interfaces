package com.coherentsolutions.java.section04.advanced;

/**
 * This interface extends the basic Notification interface with additional advanced features.
 * It includes more sophisticated methods for handling notifications.
 */
public interface Ex09AdvancedNotification extends com.coherentsolutions.java.section04.Ex07Notification {

    /**
     * Default method to schedule a notification to be sent after a delay.
     * It uses a private method to simulate the delay and then sends the notification.
     *
     * @param message the message to send
     * @param delay   the delay in milliseconds
     */
    default void scheduleNotification(String message, int delay) {
        delayNotification(delay);
        send(message);
    }

    /**
     * Private method to simulate a delay in sending the notification.
     * This method is used internally by the scheduleNotification() method.
     *
     * @param delay the delay in milliseconds
     */
    private void delayNotification(int delay) {
        try {
            Thread.sleep(delay);
            System.out.println("Delay of " + delay + " milliseconds completed.");
        } catch (InterruptedException e) {
            System.out.println("Notification scheduling interrupted.");
        }
    }
}

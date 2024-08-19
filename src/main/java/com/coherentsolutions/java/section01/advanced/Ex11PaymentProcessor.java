package com.coherentsolutions.java.section01.advanced;

/**
 * This interface represents a payment processor with the ability to process and refund payments.
 * It demonstrates the use of default methods to provide backward-compatible extensions.
 */
public interface Ex11PaymentProcessor {

    void processPayment(double amount);

    /**
     * Default method to refund a payment.
     * By default, this method throws an UnsupportedOperationException.
     */
    default void refundPayment(double amount) {
        throw new UnsupportedOperationException("Refund not supported");
    }
}

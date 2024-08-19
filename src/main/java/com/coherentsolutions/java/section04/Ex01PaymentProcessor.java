package com.coherentsolutions.java.section04;

/**
 * This interface represents a payment processor with the ability to process payments.
 * It demonstrates the use of default methods to add new functionality without breaking existing implementations.
 */
public interface Ex01PaymentProcessor {
    void processPayment(double amount);  // Abstract method for processing payment

    /**
     * Default method to refund a payment.
     * By default, this method throws an UnsupportedOperationException.
     * Implementing classes can override this method if they support refunds.
     *
     * @param amount the amount to refund
     */
    default void refundPayment(double amount) {
        throw new UnsupportedOperationException("Refund not supported");
    }
}

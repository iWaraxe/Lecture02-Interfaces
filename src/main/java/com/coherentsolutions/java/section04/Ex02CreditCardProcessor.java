package com.coherentsolutions.java.section04;

/**
 * This class implements the PaymentProcessor interface and provides custom implementations
 * for processing and refunding payments.
 */
public class Ex02CreditCardProcessor implements Ex01PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding credit card payment of $" + amount);
    }

    public static void main(String[] args) {
        Ex02CreditCardProcessor processor = new Ex02CreditCardProcessor();
        processor.processPayment(100.00);
        processor.refundPayment(50.00);
    }
}

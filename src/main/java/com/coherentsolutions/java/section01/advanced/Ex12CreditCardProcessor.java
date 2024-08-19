package com.coherentsolutions.java.section01.advanced;

/**
 * This class implements the PaymentProcessor interface and provides custom implementations
 * for processing and refunding payments.
 */
public class Ex12CreditCardProcessor implements Ex11PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding credit card payment of $" + amount);
    }

    public static void main(String[] args) {
        Ex12CreditCardProcessor processor = new Ex12CreditCardProcessor();
        processor.processPayment(100.00);
        processor.refundPayment(50.00);
    }
}

package com.coherentsolutions.java.section03.advanced;

/**
 * This class demonstrates the use of advanced static and private methods in the AdvancedCalculator interface.
 */
public class Ex09AdvancedCalculatorDemo {

    public static void main(String[] args) {
        // Using the static method from the AdvancedCalculator interface
        int difference = Ex08AdvancedCalculator.subtract(10, 3);
        System.out.println("Difference: " + difference);  // Output: Difference: 7

        // Using the default method with a private method from the interface
        //Ex08AdvancedCalculator calc = new Ex08AdvancedCalculator();
    }
}
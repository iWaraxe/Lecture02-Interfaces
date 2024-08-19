package com.coherentsolutions.java.section03;

/**
 * This class demonstrates the use of static and default methods in the Calculator interface.
 */
public class Ex07CalculatorDemo {

    public static void main(String[] args) {
        // Using the static method from the Calculator interface
        int sum = Ex06Calculator.add(5, 10);
        System.out.println("Sum: " + sum);  // Output: Sum: 15

        // Using the default method with a private method from the interface
        Ex06Calculator calc = new Ex06Calculator() {};  // Anonymous class instance
        int product = calc.multiply(4, 3);
        System.out.println("Product: " + product);// Output: Product: 12
    }
}

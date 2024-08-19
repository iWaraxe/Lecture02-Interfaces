package com.coherentsolutions.java.section03;

/**
 * This interface demonstrates the use of static and private methods in combination.
 * The static method is a utility method, and the private method is used within a default method.
 */
public interface Ex06Calculator {

    /**
     * Static method to add two integers.
     * This method can be called directly using the interface name.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    static int add(int a, int b) {
        return a + b;
    }

    /**
     * Default method to multiply two integers.
     * It uses a private method to perform the multiplication by repeated addition.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the product of a and b
     */
    default int multiply(int a, int b) {
        return multiplyInternal(a, b);
    }

    /**
     * Private method to encapsulate the logic for multiplication by repeated addition.
     * This method is not visible outside the interface.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the product of a and b
     */
    private int multiplyInternal(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result = add(result, a);
        }
        return result;
    }
}

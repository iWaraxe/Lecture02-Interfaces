package com.coherentsolutions.java.section03.advanced;

/**
 * This interface demonstrates advanced usage of static and private methods in interfaces.
 * It extends the basic Calculator interface with additional methods.
 */
public interface Ex08AdvancedCalculator extends com.coherentsolutions.java.section03.Ex06Calculator {

    /**
     * Static method to subtract two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the difference of a and b
     */
    static int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Default method to divide two integers.
     * It handles division by zero and uses a private method to validate input.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the quotient of a divided by b
     */
    default int divide(int a, int b) {
        validateDivision(a, b);
        return a / b;
    }

    /**
     * Private method to validate the division operation.
     * Throws an exception if the divisor is zero.
     *
     * @param a the dividend
     * @param b the divisor
     */
    private void validateDivision(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }
}

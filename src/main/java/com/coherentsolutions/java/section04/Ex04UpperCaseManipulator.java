package com.coherentsolutions.java.section04;

/**
 * This class implements the StringManipulator interface and provides a custom implementation
 * for converting a string to uppercase.
 */
public class Ex04UpperCaseManipulator implements Ex03StringManipulator {

    @Override
    public String manipulate(String input) {
        return input.toUpperCase();
    }

    public static void main(String[] args) {
        String input = "madam";

        // Using static methods from the StringManipulator interface
        System.out.println(Ex03StringManipulator.isPalindrome(input)); // Output: true

        // Using an implemented method
        Ex04UpperCaseManipulator manipulator = new Ex04UpperCaseManipulator();
        System.out.println(manipulator.manipulate(input)); // Output: MADAM
    }
}

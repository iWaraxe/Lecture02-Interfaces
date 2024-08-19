package com.coherentsolutions.java.section04;

/**
 * This interface provides utility methods for string manipulation using static methods.
 * It also includes an abstract method for custom string manipulation.
 */
public interface Ex03StringManipulator {

    /**
     * Static method to reverse a given string.
     * This method can be called directly using the interface name.
     *
     * @param input the string to reverse
     * @return the reversed string
     */
    static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    /**
     * Static method to check if a given string is a palindrome.
     * It uses the reverse() method to compare the string with its reverse.
     *
     * @param input the string to check
     * @return true if the input string is a palindrome, false otherwise
     */
    static boolean isPalindrome(String input) {
        return input.equals(reverse(input));
    }

    /**
     * Abstract method for custom string manipulation.
     * Implementing classes must provide their own implementation of this method.
     *
     * @param input the string to manipulate
     * @return the manipulated string
     */
    String manipulate(String input);
}

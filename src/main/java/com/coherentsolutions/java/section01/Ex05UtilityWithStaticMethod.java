package com.coherentsolutions.java.section01;

/**
 * This interface provides a static method that can be used without creating an instance of the interface.
 * Static methods in interfaces are utility methods related to the interface itself.
 */
public interface Ex05UtilityWithStaticMethod {

    /**
     * Static method to print a greeting message.
     * This method can be called directly on the interface without an instance.
     */
    static void printGreeting() {
        System.out.println("Hello from Utility!");
    }
}

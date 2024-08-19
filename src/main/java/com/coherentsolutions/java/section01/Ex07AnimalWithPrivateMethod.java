package com.coherentsolutions.java.section01;

/**
 * This interface demonstrates the use of a private method within an interface.
 * The private method is used to encapsulate common functionality that can be reused in default methods.
 */
public interface Ex07AnimalWithPrivateMethod extends Ex01AnimalInterface {

    /**
     * Default method to describe the animal.
     * This method uses a private method to log the description.
     */
    default void describe() {
        System.out.println("This is an animal.");
        log("Description provided.");
    }

    /**
     * Private method for logging messages.
     * This method is not accessible outside this interface.
     */
    private void log(String message) {
        System.out.println("LOG: " + message);
    }
}

package com.coherentsolutions.java.section01;

/**
 * This interface extends the basic Animal interface by adding a default method.
 * The default method provides a standard implementation for all classes that do not override it.
 */
public interface Ex03AnimalWithDefaultMethod extends Ex01AnimalInterface {

    /**
     * Default method for breathing.
     * All classes implementing this interface inherit this method unless they override it.
     */
    default void breathe() {
        System.out.println("Animal is breathing.");
    }
}

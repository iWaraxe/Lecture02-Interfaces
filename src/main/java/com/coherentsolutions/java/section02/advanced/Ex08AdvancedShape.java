package com.coherentsolutions.java.section02.advanced;

import com.coherentsolutions.java.section02.Ex06Shape;
import com.coherentsolutions.java.section02.Ex07Rectangle;

/**
 * This interface extends the Shape interface with additional advanced default methods.
 * These methods demonstrate more complex logic that can be encapsulated in default methods.
 */
public interface Ex08AdvancedShape extends Ex06Shape {

    /**
     * Default method to calculate the diagonal of a rectangular shape.
     * This method assumes the shape is a rectangle and uses the Pythagorean theorem.
     */
    default double diagonal() {
        if (this instanceof Ex07Rectangle) {
            Ex07Rectangle rectangle = (Ex07Rectangle) this;
            return Math.sqrt(rectangle.area() + rectangle.perimeter());
        }
        throw new UnsupportedOperationException("Diagonal calculation is only supported for rectangles.");
    }

    /**
     * Default method to provide a detailed description of the shape, including its area and perimeter.
     */
    default void describe() {
        System.out.println("Shape Description:");
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
        System.out.println("Drawing Shape:");
        draw();  // Calls the inherited draw method
    }
}

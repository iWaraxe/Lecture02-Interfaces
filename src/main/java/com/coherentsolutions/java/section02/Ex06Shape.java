package com.coherentsolutions.java.section02;

/**
 * This interface represents a basic contract for geometric shapes.
 * It defines methods to calculate area and perimeter and includes a default method to draw the shape.
 */
public interface Ex06Shape {
    double area();  // Abstract method for calculating the area

    double perimeter();  // Abstract method for calculating the perimeter

    /**
     * Default method to draw the shape.
     * Classes implementing this interface can inherit this method or override it to provide custom drawing logic.
     */
    default void draw() {
        System.out.println("Drawing a shape.");
    }
}

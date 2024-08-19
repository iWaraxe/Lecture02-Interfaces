package com.coherentsolutions.java.section03;

/**
 * This interface represents a basic contract for geometric shapes.
 * It includes a static method to compare the areas of two shapes.
 */
public interface Ex01Shape {
    int NUMBER_OF_SIDES = 3;
    double area();  // Abstract method for calculating the area

    /**
     * Static method to compare areas of two shapes.
     * This method can be called directly using the interface name.
     *
     * @param shape1 the first shape
     * @param shape2 the second shape
     * @return true if the area of shape1 is greater than that of shape2
     */
    static boolean compareArea(Ex01Shape shape1, Ex01Shape shape2) {
        return shape1.area() > shape2.area();
    }
}

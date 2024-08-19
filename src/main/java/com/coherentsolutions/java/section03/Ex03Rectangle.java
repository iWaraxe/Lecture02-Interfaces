package com.coherentsolutions.java.section03;

/**
 * This class implements the Shape interface and provides a concrete implementation
 * for calculating the area of a rectangle.
 */
public class Ex03Rectangle implements Ex01Shape {
    private double length;
    private double width;

    public Ex03Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    public static void main(String[] args) {
        Ex01Shape circle = new Ex02Circle(5);
        Ex01Shape rectangle = new Ex03Rectangle(10, 5);

        // Using the static method from the Shape interface
        boolean isCircleLarger = Ex01Shape.compareArea(circle, rectangle);
        System.out.println("Is the circle larger than the rectangle? " + isCircleLarger);
    }
}

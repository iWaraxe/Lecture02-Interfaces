package com.coherentsolutions.java.section02;

import java.util.Comparator;

/**
 * This class implements the Shape interface and provides concrete implementations
 * for calculating area and perimeter. It also uses the default draw method from the interface.
 */
public class Ex07Rectangle implements Ex06Shape {
    private double length;
    private double width;

    public Ex07Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Ex07Rectangle rectangle = new Ex07Rectangle(10, 5);
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
        rectangle.draw();  // Uses the default draw method
    }
}

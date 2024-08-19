package com.coherentsolutions.java.section03;

/**
 * This class implements the Shape interface and provides a concrete implementation
 * for calculating the area of a circle.
 */
public class Ex02Circle implements Ex01Shape {
    private double radius;

    public Ex02Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }


    public static void main(String[] args) {
        Ex02Circle circle = new Ex02Circle(5);
        System.out.println("Circle Area: " + circle.area());

    }
}

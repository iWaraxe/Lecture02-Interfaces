package com.coherentsolutions.java.section02.advanced;

import com.coherentsolutions.java.section02.Ex07Rectangle;

/**
 * This class extends Rectangle and implements AdvancedShape, demonstrating the use of advanced default methods.
 */
public class Ex09AdvancedRectangle extends Ex07Rectangle implements Ex08AdvancedShape {

    public Ex09AdvancedRectangle(double length, double width) {
        super(length, width);
    }

    public static void main(String[] args) {
        Ex09AdvancedRectangle advancedRectangle = new Ex09AdvancedRectangle(10, 5);
        advancedRectangle.describe();  // Uses the default describe method
        System.out.println("Diagonal: " + advancedRectangle.diagonal());  // Uses the default diagonal method
    }
}

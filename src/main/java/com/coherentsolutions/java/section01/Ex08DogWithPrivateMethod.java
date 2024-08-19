package com.coherentsolutions.java.section01;

/**
 * This class demonstrates the use of a default method that internally uses a private method from the interface.
 */
public class Ex08DogWithPrivateMethod implements Ex07AnimalWithPrivateMethod {

    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }

    public static void main(String[] args) {
        Ex08DogWithPrivateMethod dog = new Ex08DogWithPrivateMethod();
        dog.describe();  // Calls the default method that uses a private method
    }
}

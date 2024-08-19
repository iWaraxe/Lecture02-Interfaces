package com.coherentsolutions.java.section02;

/**
 * This class implements the Animal interface with a default method.
 * It uses the default method breathe provided by the interface.
 */
public class Ex04DogWithDefaultMethod implements Ex03AnimalWithDefaultMethod {

    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }

    public static void main(String[] args) {
        Ex04DogWithDefaultMethod dog = new Ex04DogWithDefaultMethod();
        dog.eat();
        dog.sleep();
        dog.breathe();  // Uses the default method from the interface
    }
}

package com.coherentsolutions.java.section01;

/**
 * This class implements the Animal interface and provides concrete implementations
 * for the eat and sleep methods.
 */
public class Ex02Dog implements Ex01AnimalInterface {

    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }

    public static void main(String[] args) {
        Ex02Dog dog = new Ex02Dog();
        dog.eat();
        dog.sleep();
    }
}

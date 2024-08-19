package com.coherentsolutions.java.section02;

/**
 * This class implements the Animal interface with a default method.
 * It overrides the default breathe method to provide custom behavior.
 */
public class Ex05CatWithOverriddenDefaultMethod implements Ex03AnimalWithDefaultMethod {

    @Override
    public void eat() {
        System.out.println("Cat is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping.");
    }

    @Override
    public void breathe() {
        System.out.println("Cat is purring while breathing.");
    }

    public static void main(String[] args) {
        Ex05CatWithOverriddenDefaultMethod cat = new Ex05CatWithOverriddenDefaultMethod();
        cat.eat();
        cat.sleep();
        cat.breathe();  // Uses the overridden breathe method
    }
}

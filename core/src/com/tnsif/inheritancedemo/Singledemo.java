package com.tnsif.inheritancedemo;

public class Singledemo {
	public static void main(String[] args) {
        Dog myDog = new Dog();

        // Calling method from parent class
        myDog.eat();

        // Calling method from child class
        myDog.bark();
    }
}
	// Parent class (Base class)
	class Animal {
	    void eat() {
	        System.out.println("This animal eats food.");
	    }
	}

	// Child class (Derived class)
	class Dog extends Animal {
	    void bark() {
	        System.out.println("The dog barks.");
	    }
	}

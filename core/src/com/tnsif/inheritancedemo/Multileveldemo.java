package com.tnsif.inheritancedemo;

public class Multileveldemo {
	public static void main(String[] args) {
        Cuboid c = new Cuboid();
        c.display();
        c.area();
        c.volume();
    }
}

	class Shape {
	    void display() {
	        System.out.println("This is a shape.");
	    }
	}

	class Rectangle extends Shape {
	    void area() {
	        System.out.println("Area = length × breadth.");
	    }
	}

	class Cuboid extends Rectangle {
	    void volume() {
	        System.out.println("Volume = length × breadth × height.");
	    }
	}

	

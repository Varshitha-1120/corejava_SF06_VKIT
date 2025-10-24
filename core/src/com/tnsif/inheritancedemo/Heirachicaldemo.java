package com.tnsif.inheritancedemo;

public class Heirachicaldemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        Bike myBike = new Bike();

        myCar.display();
        myCar.type();

        myBike.display();
        myBike.type();
    }
}

// Parent class
class Vehicle {
    void display() {
        System.out.println("This is a vehicle.");
    }
}

// Child class 1
class Car extends Vehicle {
    void type() {
        System.out.println("Car: 4 wheels, used for family travel.");
    }
}

// Child class 2
class Bike extends Vehicle {
    void type() {
        System.out.println("Bike: 2 wheels, used for quick travel.");
    }
}

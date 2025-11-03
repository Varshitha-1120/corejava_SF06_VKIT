package com.tnsif.exceptionhandlingprogram;

import java.io.IOException;

//demo for throw keyword

public class Throwdemo {
	
	void validate(int age) {
		if(age<18) {
		throw new ArithmeticException("you are not eligiable");
		}
		else {
			System.out.println("you are eligiable");
		}
	}
	public static void main(String[] args) {
		Throwdemo t=new Throwdemo();
		t.validate(9);
	}
}

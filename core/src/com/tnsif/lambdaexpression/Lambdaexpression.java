package com.tnsif.lambdaexpression;
public class Lambdaexpression {
public static void main(String[] args) {
	int width=10;
	
	//with lambda
	Demo d2=()->{System.out.println("drawing "+width);};
	d2.draw();
}
}
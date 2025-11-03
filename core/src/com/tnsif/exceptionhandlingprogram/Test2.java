package com.tnsif.exceptionhandlingprogram;
//exception with matching catch block
public class Test2 {
	public static void main(String[] args) {
		try {
			System.out.println(100/0);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("hello world");
		}
		System.out.println("java code");
	}
}

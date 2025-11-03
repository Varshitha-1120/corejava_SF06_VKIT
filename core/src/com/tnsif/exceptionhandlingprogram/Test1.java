package com.tnsif.exceptionhandlingprogram;
//no exception
public class Test1 {
	public static void main(String[] args) {
		try {
			System.out.println("welcome");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("java code");
		}
	}
}

package com.tnsif.stringsprogram;
// demo for string class

public class Stringdemo {
	public static void main(String[] args) {
		String str=new String("hello");
		System.out.println(str);
		str=str.concat("  welcome to java");
		System.out.println(str);
		
		System.out.println(str.length());
		System.out.println(str.indexOf("h"));
		System.out.println(str.charAt(4));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
	}
}
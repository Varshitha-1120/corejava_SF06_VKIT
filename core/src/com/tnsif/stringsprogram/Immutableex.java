package com.tnsif.stringsprogram;

public class Immutableex {

	public static void main(String[] args) {
		String str1="sachin";
		String str2=str1;
		String str3=str1;
		
		System.out.println("before modification");
		System.out.println("str1 "+str1);
		System.out.println("str2 "+str2);
		System.out.println("str3 "+str3);
		
		str1="sachin tendulkar";
		
		System.out.println("after modification");
		System.out.println("str1 "+str1);
		System.out.println("str2 "+str2);
		System.out.println("str3 "+str3);
		
	}
}
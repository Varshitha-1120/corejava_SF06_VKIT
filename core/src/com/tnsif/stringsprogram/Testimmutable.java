package com.tnsif.stringsprogram;
// demo for string
public class Testimmutable {
	public static void main(String[] args) {
		String s="sachin";
		s.concat("tendulkar");
		System.out.println(s);
		s=s.concat("tendulakr");
		System.out.println(s);
		
	}

}
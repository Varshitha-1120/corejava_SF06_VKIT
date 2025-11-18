package com.tnsif.stringsprogram;
// demo for equals ()
public class equalsdemo {
	
	public static void main(String[] args) {
		String s1="sachin";
		String s2="sachin";
		String s3=new String("sachin");
		String s4="saurav";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s3));
		
	}
}
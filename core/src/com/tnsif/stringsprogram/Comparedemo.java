package com.tnsif.stringsprogram;
// compare() 
public class Comparedemo {
public static void main(String[] args) {
	String s1="sachin";
	String s2="sachin";
	String s3="ratan";
	
	System.out.println(s1.compareTo(s2));
	System.out.println(s3.compareTo(s1));
	System.out.println(s1.compareTo(s3));
}
}
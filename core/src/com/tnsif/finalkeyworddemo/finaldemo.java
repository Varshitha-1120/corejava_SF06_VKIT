package com.tnsif.finalkeyworddemo;
//demo for final keyword
//variables
//methods
//class
public final class finaldemo {
	
   final static int a=8;
   //u can't change value
   
   static {
	   a=9;
   }
	final void display() { 
		// can't override
		System.out.println("welcome to java");
	}
	
	

}

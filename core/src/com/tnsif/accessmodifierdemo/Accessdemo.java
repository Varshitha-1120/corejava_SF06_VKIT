package com.tnsif.accessmodifierdemo;
//demo for access modifier
public class Accessdemo {
          
	    //public
	
	public int a=9;
	public String s="guru";
	
	public void display() {
		System.out.println("Welcome to java");
	}
	
	public static void main(String[] args)  {
		Accessdemo obj=new Accessdemo();
		System.out.println(obj.a);
		System.out.println(obj.s);
		
		obj.display();
	}
}

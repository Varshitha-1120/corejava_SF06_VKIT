package com.tnsif.inheritancedemo;

	public class Son extends Father{
		
		 String bike="java";
		 
		 void study() {
			 System.out.println("java");
		 }
		 
		 public static void main(String[] args) {
			Son s=new Son();
			
			System.out.println(s.car);
			System.out.println(s.money);
			System.out.println(s.bike);
			
			s.drinking();
			s.study();
		}
}

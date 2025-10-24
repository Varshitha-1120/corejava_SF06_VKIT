package com.tnsif.superkeyworddemo;
//child class
public class Demo extends Superdemo {
      int a=50;
	
	void drinking() {
		System.out.println("hi java");
	}
	
	void show() {
		System.out.println(a);
		System.out.println(super.a);
		drinking();
		super.drinking();
	}
	
	Demo(){
		super();
		System.out.println("child class");
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		//System.out.println(d.a);
		d.show();
		
	}
}

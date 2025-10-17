package com.tnsif.publicdemo;

import com.tnsif.accessmodifierdemo.Accessdemo;

public class Demo1 {
	public static void main(String[] args) {
		Accessdemo obj=new Accessdemo();
		System.out.println(obj.a);
		System.out.println(obj.s);
		
		obj.display();
	}
}

package com.tnsif.polymorphismdemo;

public class PNB extends RBI {
     
	@Override
	float rateofinterest() {
		return 4.9f;
	}
	
	public static void main(String[] args) {
		PNB p=new PNB();
		System.out.println(p.rateofinterest());
	}
} 

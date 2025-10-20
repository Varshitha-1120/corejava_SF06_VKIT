package com.tnsif.scannerclassprogram;

import java.util.Scanner;

public class Personexce {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the person name");
		String name=sc.nextLine();
		System.out.println("enter the person income");
		int income=sc.nextInt();
		
		Person pp=new Person();  // object
		pp.setName(name);
		pp.setIncome(income);
		
		Taxcaluculation t=new Taxcaluculation();
		t.Caluculatetax(pp);
		
		System.out.println("after tax calucation ");
		System.out.println(pp);
	}

}


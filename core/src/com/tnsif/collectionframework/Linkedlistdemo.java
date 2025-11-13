package com.tnsif.collectionframework;
import java.util.LinkedList;
import java.util.List;

// demo for linked list

public class Linkedlistdemo {
	public static void main(String[] args) {
		List<String> frt=new LinkedList<>();
		frt.add("apple");  // add element
		frt.add("mango");
		frt.add("dragon fruit");
		
		System.out.println("first element"+ frt.get(0));// access element
		
		frt.set(2, "cherry");//modify data
		frt.remove(2);  // remove element
		System.out.println(frt);
		
		if(frt.contains("apple")) {
			System.out.println("apple is in the frt");
		}
		for(String fruit :frt) {
			System.out.println(fruit);
		}
	
	}

}
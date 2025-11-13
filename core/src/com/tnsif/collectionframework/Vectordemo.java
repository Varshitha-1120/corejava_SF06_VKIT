package com.tnsif.collectionframework;
import java.util.List;
import java.util.Vector;

// demo for vector 

public class Vectordemo {
	public static void main(String[] args) {
		List<Integer> n=new Vector<>();
		// add element 
		n.add(20);
		n.add(39);
		n.add(28);
		n.add(10);
		n.add(80);
		System.out.println(n);
		
		// access an element
		System.out.println(n.get(4));
		// modify an element
		n.set(1, 50);
		System.out.println(n);
		
		//remove an element
		n.remove(Integer.valueOf(10));
		
		//print all the element
		for(Integer nu:n) {
			System.out.println(nu);
		}
	}
	
}

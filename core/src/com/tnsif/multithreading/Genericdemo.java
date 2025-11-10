package com.tnsif.multithreading;

import java.util.ArrayList;
import java.util.Iterator;

//demo for generic concepts
public class Genericdemo {
	public static void main(String[] args) {
		ArrayList<String> lis=new ArrayList<String>();
		//lis.add(4);
		lis.add("rashmi");
		lis.add("kusuma");
		lis.add("sushma");
		lis.add("apple");
		lis.add("banana");
		System.out.println(lis);
		
		// iterable interface
		
		// traversing list through Iterator
		
		Iterator itr=lis.iterator();
		while(itr.hasNext()) {//check if iterator has a element
			System.out.println(itr.next());// printing the element and move next
		}
		
	}
}

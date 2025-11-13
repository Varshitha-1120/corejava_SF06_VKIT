package com.tnsif.collectionframework;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

// demo for linked list set
public class Linkedlistsetdemo {
	public static void main(String[] args) {
	LinkedHashSet<String> s=new LinkedHashSet<>();
	
	s.add("cherry");
	s.add("banana");
	s.add("orange");
	s.add("cherry");
	s.add("papaya");
	s.add("cherry");
	s.add(null);
	s.add(null);
	
	System.out.println("linked hashset "+s);

}
}
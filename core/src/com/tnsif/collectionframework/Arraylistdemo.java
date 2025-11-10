package com.tnsif.collectionframework;

import java.util.ArrayList;

//demo for array list
//add
public class Arraylistdemo {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		System.out.println("size of the array "+al.size());
		al.add(2);
		al.add(3.6f);
		al.add("ramya");
		al.add('g');
		System.out.println(al);
		System.out.println("size of the array "+al.size());
		System.out.println(al.contains(6));
		System.out.println(al.isEmpty());
		System.out.println(al.indexOf(3));
		System.out.println(al.get(0));
		System.out.println(al.remove(3));
		System.out.println(al);
		System.out.println(al.add(7));
		System.out.println(al.getFirst());
	}
}

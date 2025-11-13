package com.tnsif.collectionframework;
import java.util.ArrayList;
import java.util.Collections;

public class Comparabledemo {
	public static void main(String[] args) {
		ArrayList<Person> p=new ArrayList<>();
		p.add(new Person("jhon" ,30));
		p.add(new Person("rohan" ,20));
		p.add(new Person("reshma" ,80));
		p.add(new Person("raghu" ,34));
		p.add(new Person("achuyh" ,10));
		
		Collections.sort(p);
		for(Person pr:p) {
			pr.displayinfo();
		}
	}

}
package com.tnsif.collectionframework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Maindemo {
public static void main(String[] args) {
	List<Person1> p=new ArrayList<>();
	
	p.add(new Person1("jhon" ,30));
	p.add(new Person1("rohan" ,20));
	p.add(new Person1("reshma" ,80));
	p.add(new Person1("raghu" ,34));
	p.add(new Person1("achuyh" ,10));
	
	// sort by name
	
	Collections.sort(p, new Sortbyname());
	System.out.println("sorted by name");
	for(Person1 p2:p) {
		p2.display();
	}
	
	// sort by age
	Collections.sort(p, new Sortbyage());
	System.out.println("sorted by age");
	for(Person1 p2:p) {
		p2.display();
	}
	

}
}

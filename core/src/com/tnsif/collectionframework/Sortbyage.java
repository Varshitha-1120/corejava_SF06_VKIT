package com.tnsif.collectionframework;
import java.util.Comparator;

public class Sortbyage implements Comparator<Person1> {

	@Override
	public int compare(Person1 o1, Person1 o2) {
		
		return Integer.compare(o1.age, o2.age);
	}

}
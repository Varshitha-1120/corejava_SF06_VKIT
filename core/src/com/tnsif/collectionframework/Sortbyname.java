package com.tnsif.collectionframework;
import java.util.Comparator;

public class Sortbyname implements Comparator<Person1>{

	@Override
	public int compare(Person1 o1, Person1 o2) {
		
		return o1.name.compareTo(o2.name);
	
	}
}
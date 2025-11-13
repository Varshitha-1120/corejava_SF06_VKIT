package com.tnsif.collectionframework;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// demo for set interface
public class Setoperation {
	public static void operation() {
		Set<Integer> nu=new HashSet<Integer>();
		nu.add(12);
		nu.add(13);
		// list of elements
		nu.addAll(Arrays.asList(new Integer[] {1,4,3,2,6}));
		
		Set<Integer> oddset=new HashSet<Integer>();
		oddset.addAll(Arrays.asList(new Integer[] {1,5,8,3,9}));
		// intersection :
		
		Set<Integer> set_intersection =new HashSet<Integer>(nu);
		set_intersection.retainAll(oddset);
		System.out.println(set_intersection);
	}
	public static void main(String[] args) {
		Setoperation.operation();
	}

}


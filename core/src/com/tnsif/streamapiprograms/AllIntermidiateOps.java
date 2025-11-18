package com.tnsif.streamapiprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// demo for all intermediate operations

public class AllIntermidiateOps {
	public static void main(String[] args) {
		// list of numbers
		
		List<Integer> number=Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		// map(): Multiple each number by 2
		List<Integer> doubled=number.stream().map(n->n*2).collect(Collectors.toList());
		System.out.println(doubled);
		
		// distinct(): remove the duplicates
		
		List<Integer> uninu =number.stream().distinct().collect(Collectors.toList());
		System.out.println(uninu);
		
		// limit() : take only first 5 elements
		

		List<Integer> limitnumber =number.stream().limit(5).collect(Collectors.toList());
		System.out.println(limitnumber);
		
		// skip() : skip the first 3 elements
		List<Integer> skipnumber =number.stream().skip(3).collect(Collectors.toList());
		System.out.println(skipnumber);
	}
}
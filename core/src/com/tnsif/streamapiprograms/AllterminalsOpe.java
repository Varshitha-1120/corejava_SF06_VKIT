package com.tnsif.streamapiprograms;
// demo for terminal operations

import java.util.Arrays;
import java.util.List;

public class AllterminalsOpe {
	public static void main(String[] args) {
		// list of numbers
		
				List<Integer> number=Arrays.asList(1,23,6,8,99,8,3,4,5,6,7,8,9);
				// foreach - print each number
				System.out.println("numbers printed using for each");
				number.stream().forEach(n->System.out.println(n+" "));
				System.out.println();
				
				// toarray - convert stream to array
				Integer[] array=number.stream().toArray(Integer[]::new);
				System.out.println("array "+Arrays.toString(array));
				
				//reduce - sum of all number
				
				int sum1=number.stream().reduce(0, Integer::sum);
				System.out.println(sum1);
				
				
	}
}
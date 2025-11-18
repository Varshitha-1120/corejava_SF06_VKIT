package com.tnsif.streamapiprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// demo for without stream api
public class Withoutstreamapi {
	public static void main(String[] args) {
		// original list of numbers
		
		List<Integer> n=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		// list to hold the results
		List<Integer> result=new ArrayList<Integer>();
		// Iterate over each no in the original list
		for(Integer number : n) {
			// check if the no is even
			if(number%2==0) {
				//multiply the even number with 2
int doubled =number*2;	

// add the doubled number to the result list
result.add(doubled);
}
		}
		System.out.println("doubled even numbers : "+ result);
	}

}

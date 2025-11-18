package com.tnsif.streamapiprograms;
// demo with stream api

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.tnsif.collectionframework.Maindemo;
import com.tnsif.lambdaexpression.Mainmethod;

public class Withstreamapi {
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);//stream of data
		List<Integer> result=numbers.stream() //create a stream from the list
				             .filter(n->n%2==0)//keep the even numbers
				             .map(n->n*2)// doubled that number
				             .sorted()// sort the number
				             .collect(Collectors.toList()); //terminal: collect reulsts into a list
		System.out.println(result);// output
//	}

}
}
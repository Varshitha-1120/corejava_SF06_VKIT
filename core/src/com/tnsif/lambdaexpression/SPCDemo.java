package com.tnsif.lambdaexpression;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SPCDemo {
public static void main(String[] args) {
	// supplier : No input , return value
	Supplier<String> s=()->"hello from suppiler";
	String svalue=s.get();
	System.out.println(svalue);
	
	// predicate : Takes one input , return boolean value
	Predicate<Integer> iseven=number->number%2==0;
	int testnumber=10;
	if(iseven.test(testnumber)) {
		System.out.println(testnumber +"is even");
	}
	else {
		System.out.println(testnumber +"is odd");
	}
	
	//consumer : takes one input , return nothing
	
	Consumer<String> c=message->System.out.println("consumer recieve "+message);
	c.accept("this is tets mesage");
	System.out.println(c);
}
}

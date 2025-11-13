package com.tnsif.collectionframework;
import java.util.Stack;

//demo for stack 
public class Stackdemo {
	public static void main(String[] args) {
	
	Stack<Integer> s=new Stack<>();
	// add an element
	s.push(7);
	s.push(11);
	s.push(6);
	s.push(79);
	s.push(72);
	s.push(89);
	System.out.println("after push operation "+s);
	
	// remove the element
	
	System.out.println(s.pop());
	System.out.println(s);
	//top element
	System.out.println(s.peek());
	System.out.println(s);
	// stack is empty or not
	System.out.println(s.isEmpty());
	
	// Searching of an element
	
	int position =s.search(20);
	if(position!=-1) {
		System.out.println("element 2 found at the position "+position);
	}
	else {
		System.out.println("element 2 not found in the stack "+position);
	}
	
	
	}
}

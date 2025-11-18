package com.tnsif.stringsprogram;
// demo for string buffer class

public class Stringbufferdemo {
	public static void main(String[] args) {
		
	StringBuffer s=new StringBuffer("welcome");
	s.append(" to my home");
	System.out.println(s);
	
	System.out.println(s.insert(2, " good to see "));
	
	System.out.println(s.delete(4, 8));
	
	System.out.println(s.reverse());
	
	System.out.println(s.replace(1, 3, "python"));
	
	System.out.println(s.charAt(7));
	
	System.out.println(s.subSequence(2, 5));

}
}
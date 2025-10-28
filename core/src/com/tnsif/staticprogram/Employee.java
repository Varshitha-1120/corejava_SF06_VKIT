package com.tnsif.staticprogram;
//demo for static variable
public class Employee {
	int eid;
	String name;
	static String companyname="TNS";
	
	// constructor 
	Employee(int e,String n){
		eid=e;
		name=n;
	}
	void display() {
		System.out.println(eid+" "+name+" "+companyname);
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee(1,"ruth");
		Employee e2=new Employee(2,"rohan");
		
		e1.display();
		e2.display();
	}
}

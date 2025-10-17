package com.tnsif.encapsulation;
//demo for encapsulation
public class Encapsulationdemo {
 
	     int serialnumber;     //data members
	     String name;
	     int age;
	     
	     void show() {// member function
	     System.out.println(serialnumber +" "+name+" "+age);
	     }
	     
	     public static void main(String[] args)  {
	    	 Encapsulationdemo d =new Encapsulationdemo ();
	         d.serialnumber=1;
	    	 d.name="varshitha";
	    	 d.age=25;
	    	 
	    	 d.show();
	     }
}


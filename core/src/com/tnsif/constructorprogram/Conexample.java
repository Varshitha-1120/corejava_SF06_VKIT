package com.tnsif.constructorprogram;
// demo for constructor
public class Conexample {
          Conexample(int i) {
        	  System.out.println("constructor with one parameter");
          }
          Conexample(int i , int j) {
        	  System.out.println("constructor with two parameter");
          }
          Conexample(int i, String g , int w ) {
        	  System.out.println("constructor with three parameter");
          }
          public static void main(String[] args) {
      		//Conexample c=new Conexample(9,"gfhg");
      		Conexample c1=new Conexample(7,9);
      		Conexample c2=new Conexample(5);
      		Conexample c3=new Conexample(7,"varshitha",9);
      	 }

}


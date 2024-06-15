package com.geetapracticedemo;

import java.util.Arrays;

public class ArrayProgram {
	
	static void arrayProgram() {
	int [] a=new int[5];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50; 
	  System.out.println("Array ="+a);   //print memory address
	  System.out.println("Array ="+a[3]);  //print only one element
	  System.out.println("Array ="+Arrays.toString(a));  //Print All element using toString()
	  
	  a=Arrays.copyOf(a, 10);   //extend the size of array using copy of method.
	  System.out.println("Array ="+Arrays.toString(a));
	    
  }
	public static void main(String[] args) {
		arrayProgram();
	}
	
	
	
}

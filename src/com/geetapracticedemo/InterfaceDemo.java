package com.geetapracticedemo;

import java.util.Scanner;

public class InterfaceDemo {
	
	public static void main(String[] args) {
		
	Vote v =new Vote();
	v.age();
   }
 }
	
interface age{
	
	public void age();
}
	
class Vote implements age{
	
	@Override
	public void age() {
	
		Scanner sc =new Scanner(System.in);
	    System.out.println("Enter Your age:");
	    
	int age =sc.nextInt();
	if(age>=18) {
	
	System.out.println("You are eligible for Voting");
	}

	else {
		System.out.println("You are not eligible for Voting");
		
	}
		
  }
		
}

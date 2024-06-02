package com.geetapracticedemo;
import java.util.Scanner;

public class IfStudent {
	
	public static void main(String[] args) {
		int marks;
		Scanner r=new Scanner(System.in);
		System.out.println("Enter your marks:");
		 marks=r.nextInt();
		
		 if(marks>=35) {
			 System.out.println("Congrats..You are pass");
		 }
		 else {
			 System.out.println("Sorry..You are Fail");
		 }
		
	}
	

}

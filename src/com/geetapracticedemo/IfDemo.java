package com.geetapracticedemo;
import java.util.Scanner;

public class IfDemo {
	
	public static void main(String[] args) {
		int number;
		Scanner r=new Scanner(System.in);
		System.out.println("Enter the Number:");
		number = r.nextInt();
		
		if(number %2==0) {
			System.out.println("Number is Even ");
		}
		else {
		System.out.println("Number is odd");
		}
	}
	
	

}

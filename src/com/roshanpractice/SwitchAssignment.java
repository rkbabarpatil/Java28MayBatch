package com.roshanpractice;

import java.util.Scanner;

public class SwitchAssignment {
	public static void main(String[] args) {
		switchDemo();
	}
	static void switchDemo() {
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number =");
		int num = sc.nextInt();
		do {
		System.out.println("Your choices are Given Below");
		System.out.println("To check given number is Even or odd press 1");
		System.out.println("To check given number is Negative or Positive press 2");
		System.out.println("To check given number is Divisible by three or not press 3");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			if(num%2==0) {
				System.out.println("Given number is Even");
			}else {
				System.out.println("Given number is odd");
			}
			break;
		case 2:
			if(num<0) {
				System.out.println("Given number is Negative");
			}else {
				System.out.println("Given number is Positive");
			}
			break;
		case 3:
			if(num%3==0) {
				System.out.println("Given number is Divisible by Three");
			}else {
				System.out.println("Given number is not divisible by three");
			}
			break;
		default:
			System.out.println("Wrong choice");
			break;
		}
		System.out.println("Do you want to continue then press y");
		String ch = sc.next();
		if(ch.equalsIgnoreCase("y")) {
			flag = true;
		}else {
			flag = false;
			System.out.println("Program End");
		}
		}while(flag);
	}
}

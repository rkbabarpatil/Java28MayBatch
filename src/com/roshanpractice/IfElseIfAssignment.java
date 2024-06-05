package com.roshanpractice;

import java.util.Scanner;

public class IfElseIfAssignment {
	static void ifElseIf() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number = ");
		int num = sc.nextInt();
		System.out.println("Your Oppsions = ");
		System.out.println("To check Given Number is Odd or Even press 1");
		System.out.println("To check Given Number is Positive or Negative press 2");
		System.out.println("To check Given Number is Divisible by Three press 3");
		int choice = sc.nextInt();
		if(choice==1) {
			if(num%2==0) {
				System.out.println("Given number is Even");
			}else {
				System.out.println("Given number is odd");
			}
		}else if (choice==2) {
			if(num<0) {
				System.out.println("Given number is Negative");
			}else {
				System.out.println("Given number is Positive");
			}
		}else if(choice==3) {
			if(num%3==0) {
				System.out.println("Given number is Divisible by Three");
			}else {
				System.out.println("Given number is not divisible by three");
			}
		}else {
			System.out.println("please choose correct oppsion");
		}
	}
	static void switchDemo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number = ");
		int num = sc.nextInt();
		System.out.println("Your Oppsions = ");
		System.out.println("To check Given Number is Odd or Even press 1");
		System.out.println("To check Given Number is Positive or Negative press 2");
		System.out.println("To check Given Number is Divisible by Three press 3");
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
			System.out.println("You enter wrong choice");
		}
	}
	public static void main(String[] args) {
		//ifElseIf();
		switchDemo();
	}
}

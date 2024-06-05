package com.roshanpractice;

import java.util.Scanner;

public class StatementDemo {
	static void ifDemo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age = ");
		int age = sc.nextInt();
		if(age>=18) 
			System.out.println("You are Eligible For voting");
			System.out.println("You are not Eligible For voting");
	}
	static void ifElseDemo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age = ");
		int age = sc.nextInt();
		if(age>=18) { 
			System.out.println("You are Eligible For voting");
			System.out.println("Thank you for voting");
		}
		else {
			System.out.println("You are not Eligible For voting");
		}
	}
	static void ifelseifDemo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number = ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number = ");
		int b = sc.nextInt();
		System.out.println("Enter 3rd number = ");
		int c = sc.nextInt();
		if(a>b && a>c) {
			System.out.println("A is greater");
		}else if (b>a && b>c) {
			System.out.println("b is greater");
		}else if(c>a && c>a){
			System.out.println("c is greater");
		}else {
			System.out.println("all numbers are equal");
		}
	}
	public static void main(String[] args) {
		//ifDemo();
		//ifElseDemo();
		ifelseifDemo();
	}
}

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
	public static void main(String[] args) {
		//ifDemo();
		ifElseDemo();
		
	}
}

package com.roshanpractice;

import java.util.Scanner;

public class LoopingStatementDemo {
	static void forLoopDemo() {
		for(int i=1;i<=20;i++) {
			if(i%2==0) 
				System.out.println("Even Number - "+i);			
		}
	}
	static void forLoopDemoTwo() {
		for(int i=1;i<=10;i++) {
				System.out.println("5th table - "+(i*5));			
		}
	}
	void whileDemo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting point = ");
		int start = sc.nextInt();
		System.out.println("Enter ending point = ");
		int end = sc.nextInt();
		int i=start;
		while (i<=end) {
			if(i==1||i==2||i==3||i==5||i==7) {
				System.out.println("prime  = ");
			}else if(i%2>0 && i%3>0 && i%5>0 && i%7>0) {
				System.out.println("Prime Numbers = "+i);
			}else {
				System.out.println("not prime number");
			}
			i++;
		}
	}
	static void doWhileDemo() {
		int i=1;
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
	}
	static void switchCaseDemo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number =  ");
		int start = sc.nextInt();
		System.out.println("Enter 2nd Number =  ");
		int end = sc.nextInt();
		boolean flag = false;
		do {
		System.out.println("Your choices");
		System.out.println("For addition press 1");
		System.out.println("For Substraction press 2");
		System.out.println("For multiplication press 3");
		System.out.println("For division press 4");
		System.out.println("Enter your choice = ");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Addition = "+(start+end));
			break;
		case 2:
			System.out.println("Substraction = "+(start-end));
			break;
		case 3:
			System.out.println("Multiplication = "+(start*end));
			break;
		case 4:
			System.out.println("Division = "+(start/end));
			break;
		default:
			System.out.println("Wrong choice");	
		}
		System.out.println("Do you want continue = ");
		String ch = sc.next();
		if(ch.equalsIgnoreCase("y")) {
			flag = true;
		}else {
			flag = false;
		}
		}while(flag);
		System.out.println("End of Program...");
	}
	public static void main(String[] args) {
		forLoopDemo();
		forLoopDemoTwo();
		doWhileDemo();
//		switchCaseDemo();
	}
}

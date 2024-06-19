package com.roshanpractice;

import java.util.Scanner;

public class AssignmentOfFactorial {
	int num, total=0,num2=1;
	Scanner sc = new Scanner(System.in);
	void factNumber() {
		System.out.println("Enter the Number - ");
		num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			num2=num2*i;
		}
		System.out.println("Factorial of Given number = "+num2);
		for(int j=1;j<=num2;j++) {
			if(j%2==0) {
				total= total+j;
			}
		}
		System.out.println("Addition of total even numbers = "+total);
	}
	public static void main(String[] args) {
		AssignmentOfFactorial a1 = new AssignmentOfFactorial();
		a1.factNumber();
	}
}

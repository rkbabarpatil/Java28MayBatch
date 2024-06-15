package com.roshanpractice;

import java.util.Scanner;

public class AdditionOfDivisibleByThreeAndFive {
	int Sum=0;
	void DivisibleByThreeAndFive() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Number = ");
		int start = sc.nextInt();
		System.out.println("Enter Starting Number = ");
		int end = sc.nextInt();
		for(int i=start;i<=end;i++) {
			if(i%3==0 && i%5==0) {
				Sum=Sum+i;
			}
		}
		System.out.println("Addition of Divisible by 3 Numbers = "+Sum);
	}
	public static void main(String[] args) {
		AdditionOfDivisibleByThreeAndFive a1 = new AdditionOfDivisibleByThreeAndFive();
		a1.DivisibleByThreeAndFive();
	}
}

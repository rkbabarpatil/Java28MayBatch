package com.roshanpractice;

import java.util.Scanner;

public class AdditionOfDivisibleByThreeAndFive {
	int tSum=0,fSum=0;
	void DivisibleByThreeAndFive() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Number = ");
		int start = sc.nextInt();
		System.out.println("Enter Starting Number = ");
		int end = sc.nextInt();
		for(int i=start;i<=end;i++) {
			if(i%3==0) {
				tSum=tSum+i;
			}else if(i%5==0){
				fSum=fSum+i;
			}
		}
		System.out.println("Addition of Divisible by 3 Numbers = "+tSum);
		System.out.println("Addition of Divisible by 5 Numbers = "+fSum);
	}
	public static void main(String[] args) {
		AdditionOfDivisibleByThreeAndFive a1 = new AdditionOfDivisibleByThreeAndFive();
		a1.DivisibleByThreeAndFive();
	}
}

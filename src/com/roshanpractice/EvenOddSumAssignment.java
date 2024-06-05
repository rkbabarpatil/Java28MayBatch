package com.roshanpractice;

import java.util.Scanner;

public class EvenOddSumAssignment {
	int sumEven=0,sumOdd=0;
	void evenOddSum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Number = ");
		int start = sc.nextInt();
		System.out.println("Enter Starting Number = ");
		int end = sc.nextInt();
		for(int i=start;i<=end;i++) {
			if(i%2==0) {
				sumEven=sumEven+i;
			}else {
				sumOdd = sumOdd+i;
			}
		}
		System.out.println("Addition of Even Numbers = "+sumEven);
		System.out.println("Addition of odd Numbers = "+sumOdd);
	}
	public static void main(String[] args) {
		EvenOddSumAssignment e1 = new EvenOddSumAssignment();
		e1.evenOddSum();
	}
}

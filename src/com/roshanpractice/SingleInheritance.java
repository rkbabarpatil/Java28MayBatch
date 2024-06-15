package com.roshanpractice;

import java.util.Scanner;

public class SingleInheritance {
	public static void main(String[] args) {
		ThreeNumAdd a1 = new ThreeNumAdd();
	}
}

class TakeValues{
	int firstNumber, secondNumber;
	Scanner sc = new Scanner(System.in);
	public TakeValues() {
		System.out.println("Enter 1st number = ");
		firstNumber = sc.nextInt();
		System.out.println("Enter 2nd number = ");
		secondNumber = sc.nextInt();
		
	}
	
}
class Addition extends TakeValues{
	int thirdNumber;
	public Addition() {
		super();
		int addition = firstNumber + secondNumber; 
		System.out.println("Addition = "+addition);
		System.out.println("Enter third Number - ");
		thirdNumber = sc.nextInt();
	}
	
}
class ThreeNumAdd extends Addition{
	public ThreeNumAdd() {
		super();
		System.out.println("Three number addition = "+(thirdNumber+firstNumber+secondNumber));
	}
	
}
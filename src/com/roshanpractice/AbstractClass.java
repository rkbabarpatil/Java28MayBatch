package com.roshanpractice;

import java.util.Arrays;
import java.util.Scanner;

public class AbstractClass {
	public static void main(String[] args) {
		AbstractDemo a1 = new AbstractDemo();
		a1.duplicateElement();
		a1.primeDemo();
	}
}
interface Duplicate{
	void duplicateElement();
}
abstract class AbstractPractice{
	Scanner sc = new Scanner (System.in);
	abstract public void duplicateElement();
	void primeDemo() {
		System.out.println("Enter the number = ");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
		if(num%i==0) {
			System.out.println("Number is prime = "+num);
		}else {
			System.out.println("Number is not prime = "+num);
		}
	}
}
}
class AbstractDemo extends AbstractPractice implements Duplicate{
	public void duplicateElement() {
		System.out.println("Enter the size of Array = ");
		int size = sc.nextInt();
		int a[]= new int[size];
		System.out.println("Enter the array Element = ");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		for(int j=0;j<a.length;j++) {
			for(int k=j+1;j<a.length;j++) {
				if(a[j]==a[k]) {
					System.out.println("Duplicate Element = "+a[k]);
				}
			}
		}
		System.out.println("Array Element ="+Arrays.toString(a));
	}
}
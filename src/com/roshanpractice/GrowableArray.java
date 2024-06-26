package com.roshanpractice;

import java.util.Arrays;
import java.util.Scanner;

public class GrowableArray {
	int size;
	Scanner sc = new Scanner(System.in);
	void ArrayDemo() {
		System.out.println("Enter the size of array = ");
		size = sc.nextInt();
		int a[] = new int [size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter array element = ");
			a[i]=sc.nextInt();
			if(a[i]==size) {
				System.out.println("Enter new size of Array = ");
				int newSize=sc.nextInt();
				Arrays.copyOf(a, newSize);
				for(int j=0;j<newSize;j++) {
					System.out.println("Enter extra array element");
					a[j]=sc.nextInt();
				}
			}
		}
		System.out.println("Array Element = "+Arrays.toString(a));
	}
	public static void main(String[] args) {
		GrowableArray g1 = new GrowableArray();
		g1.ArrayDemo();
	}
}

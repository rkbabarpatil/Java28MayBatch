package com.roshanpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraylistDemo {
	int i;
	void listDemo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of list = ");
		int size = sc.nextInt();
		List<Integer>l1=new ArrayList<Integer>(size);
		do {
			System.out.println("Enter the Numeric value = ");
			int num = sc.nextInt();
			if(l1.contains(num)) {
				System.out.println("Duplicate object not allowed");
			}else {
			l1.add(num);
			i++;
			}
		}while(i<size);
		System.out.println("List elements = "+l1);
	}
	public static void main(String[] args) {
		ArraylistDemo a1 = new ArraylistDemo();
		a1.listDemo();
	}
}

package com.roshanpractice;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		VectorList();
	}
	static void VectorList() {
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		v1.addElement(50);//Vectors own methods
		System.out.println("Vector List = "+v1);
		System.out.println(v1.elementAt(1));//Vectors own methods
	}
}

package com.roshanpractice;

public class ConstrutChaining {
	public ConstrutChaining() {
		this(10);
		System.out.println("No argument");
	}
	public ConstrutChaining(int a) {
		this(10.25f);
		System.out.println("int - "+a);
	}
	public ConstrutChaining(float a) {
		System.out.println("float - "+a);
	}
	public static void main(String[] args) {
		ConstrutChaining c1 = new ConstrutChaining();
	}
}

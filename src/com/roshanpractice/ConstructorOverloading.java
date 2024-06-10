package com.roshanpractice;

public class ConstructorOverloading {
    ConstructorOverloading() {
		System.out.println("No argument");
	}
	ConstructorOverloading(int a){
		System.out.println("Single parameter ="+a);
	}
	ConstructorOverloading(float a){
		System.out.println("Single parameter - "+a);
	}
	ConstructorOverloading(int a, int b){
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		ConstructorOverloading c1 = new ConstructorOverloading();
		ConstructorOverloading c2 = new ConstructorOverloading(10);
		ConstructorOverloading c3 = new ConstructorOverloading(10.52f);
		ConstructorOverloading c4 = new ConstructorOverloading(10,20);
	}
}

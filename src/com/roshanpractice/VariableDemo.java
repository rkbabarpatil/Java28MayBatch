package com.roshanpractice;


public class VariableDemo {
	int a = 10;
	static int b = 20;
	static {
		System.out.println("static block");
		//System.out.println(a); we can't directly access without object
		VariableDemo v1 = new VariableDemo();
		System.out.println(v1.a);//we can access throgh object
		System.out.println(b);//we can access static field directly in static area
	}
	{
		System.out.println("instance block");
	}
	void firstMethod() {
		secondMethod();
		System.out.println("instance Method");
		System.out.println(a);//we can access instance variables in instance area
		System.out.println(b);//we can access static fields in instance area because static field get memory at class loading
	}
	static void secondMethod() {
		VariableDemo v2 = new VariableDemo();
		v2.firstMethod();
		System.out.println("static Method");
	}
	}


	class VariableDemoTwo{
		void firstMethodTwo() {
			VariableDemo v1 = new VariableDemo();
			System.out.println(v1.a+"  "+VariableDemo.b);
		}
		static void secondMethodTwo() {
			VariableDemo v2 = new VariableDemo();
			//VariableDemoTwo v1 = new VariableDemoTwo();
			System.out.println(VariableDemo.b+"  "+v2.a);
		}
	}
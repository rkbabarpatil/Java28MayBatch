package com.roshanpractice;


public class StaticAndInstanceDemo {
	int a = 10;//globle variable
	String s;//system define data type
	StaticAndInstanceDemo f;//user define data type
	static int c= 30;//static variable
	void methodOne() {//instance method
		System.out.println("instance method");
		int b = 20;// local variable
		int d=50;
		System.out.println(b +"  "+d);
	}
	static void methodSecond() {//static method
		System.out.println("static method");
		//System.out.println(a);we can't access instance field directly in static area we need create object
		c= 31;
	}
	{
		System.out.println("instance method");
		System.out.println(c);
	}
	static {
		System.out.println("static block") ;
	}
	public static void main(String[] args) {
		StaticAndInstanceDemo f2 = new StaticAndInstanceDemo();
		System.out.println("main method");
		StaticAndInstanceDemo f1 = new StaticAndInstanceDemo();
	}
}

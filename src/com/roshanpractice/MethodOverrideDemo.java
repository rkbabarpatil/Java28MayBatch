package com.roshanpractice;

public class MethodOverrideDemo {
	public static void main(String[] args) {
		MethodDemo m1 = new MethodDemo();
		OverrideDemo o1 = new OverrideDemo();
		MethodDemo m2 = new OverrideDemo();
		m2.m1();//
		m2.m5();
		AA a1 = new CC();
		a1.m2();

	}
}
class MethodDemo{
	void m1() {
		System.out.println("Method m1 in MethodDemo");
	}
	int m2() {
		System.out.println("Int method m2 in MethodDemo");
		return 0;

	}
	protected void m3() {
		System.out.println("protected method m3 in MethodDemo");
	}
	MethodDemo m4(){
		return null;

	}
	void m5() {
		System.out.println("Method m5 in MethodDemo");
	}
	void m6() {
		System.out.println("Method m6");
	}
}
class OverrideDemo extends MethodDemo{
	void m1() {
		System.out.println("Method m1 in OverrideDemo");
	}
	int m2() {
		System.out.println("Int method m2 in OverrideDemo");
		return 0;

	}
	protected void m3() {
		System.out.println("protected method m3 in OverrideDemo");
	}
	OverrideDemo m4(){
		System.out.println();
		return null;

	}
	void m7() {
		System.out.println("Method m7");
	}
	void m8() {
		System.out.println("Method m8");
	}
}
class AA{
	void m1() {
		System.out.println("m1 in A");
	}
	void m2() {
		System.out.println("m2 in A");
	}
}
class BB extends AA{
	void m1() {
		System.out.println("m1 in B");
	}
	void m2() {
		System.out.println("m2 in B");
	}
	void m3() {
		System.out.println("m3 in B");
	}
	void m4() {
		System.out.println("m4 in B");
	}
}
class CC extends BB{
	void m5() {
		System.out.println("m5 in C");
	}
	void m6() {
		System.out.println("m6 in C");
	}
}
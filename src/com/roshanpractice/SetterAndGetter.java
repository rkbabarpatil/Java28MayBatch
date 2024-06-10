package com.roshanpractice;

import java.util.Scanner;

public class SetterAndGetter {
	int age;
	String Sname;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public static void main(String[] args) {
		SetterAndGetter s1 = new SetterAndGetter();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age = ");
		int age = sc.nextInt();
		System.out.println("Enter the Name = ");
		String sName = sc.next();
		s1.setAge(age);
		s1.setSname(sName);
		System.out.println("Age = "+s1.age);
		System.out.println("Name = "+s1.Sname);
	}
}

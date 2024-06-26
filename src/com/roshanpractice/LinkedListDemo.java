package com.roshanpractice;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Roshan", "Patil");
		Student s2 = new Student(2, "Sonali", "Patil");
		Student s3 = new Student(3, "Abhi", "Game");
		Student s4 = new Student(4, "sunny", "Waghmode");
		Student s5 = new Student(5, "Akash", "pawar");
		LinkedList<Student>l1 = new LinkedList<Student>();
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		l1.add(s4);
		l1.add(s5);
		System.out.println("Student information = "+l1);
	}
}
class Student{
	int roll;
	String name;
	String address;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Student(int roll, String name, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
	
}

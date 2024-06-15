package com.geetapracticedemo;
//Constructor Overloading
public class ConstractorDemo {
	
	public ConstractorDemo() {     //No Argument constructor 
		
		System.out.println("Student Data;");
	}
	public ConstractorDemo(int rollno,String name) {   //parameter constructor
		
		this();             //call the current class constructor
		System.out.println("Roll No :"+rollno);
		System.out.println("Name:"+name);
	} 
	public ConstractorDemo(int age) {   
		
		this(22,"Aditi");
		System.out.println("Age:"+age);	
	} 
	public ConstractorDemo(float marks) {
		
		this(17);
		System.out.println("Marks:"+marks);
	}
	public ConstractorDemo(long mobileno) {
		
		this(96.08f);
		System.out.println("Mobile No:"+mobileno);
	} 

	public static void main(String[] args) {
		ConstractorDemo d=new ConstractorDemo(9988776655L);
		
		
	}

}



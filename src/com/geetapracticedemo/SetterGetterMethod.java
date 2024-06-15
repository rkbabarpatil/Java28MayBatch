package com.geetapracticedemo;

import java.util.Scanner;

public class SetterGetterMethod {
	
	int rollno;
	String name;
	
   public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

  public static void main(String[] args) {
	 
	 SetterGetterMethod sg = new SetterGetterMethod(); 
	  
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the RollNo");
	int rollno=s.nextInt();
	
	System.out.println("Enter the Name");
	String name=s.next();
    sg.setRollno(rollno);
	sg.setName(name);
	
	System.out.println("Roll No="+sg.rollno);
	System.out.println("Name="+sg.name);
		
}
}







package com.geetapracticedemo;

import java.util.Scanner;

public class AbstractClassDemo {

		public static void main(String[] args) {
		
			Exam e=new Exam();
			e.m1();
			e.studInfo();
			e.marks();
		}
		
	}
	abstract  class Student1{
		String name;
		int rollno;
		 
		Scanner s=new Scanner(System.in);
		
		  abstract void studInfo();   //Abstract method
		  
		  void m1() {      //non Abstract method
			  
			  System.out.println("Enter Student Name:");
			  name=s.next();
			  System.out.println("Enter Student Rollno:");
			  rollno=s.nextInt();
			  
		  }
		  
		  abstract void marks();
	}

	class Exam extends Student1{
		
		float s1,s2,s3;

		@Override
		void studInfo() {
			// TODO Auto-generated method stub
			
			System.out.println("Enter 1st subject Marks:");
			s1=s.nextFloat();
			
			if(s1>40) {
				System.out.println("you are pass in 1st Subject");
			}else {
				System.out.println("you are fail in 1st Subject");
			}
			
			System.out.println("Enter 2nd subject Marks:");
			s2=s.nextFloat();
			
			 if(s2>40) {
				System.out.println("you are pass in 2nd Subject ");
			}else {
				System.out.println("you are fail  in 2nd Subject");
			}
		
			System.out.println("Enter 3rd subject Marks:");
			s3=s.nextFloat();
			
			 if(s3>40) {
				System.out.println("you are pass in 3rd Subject");
			}
			else {
				System.out.println("you are fail in 3rd Subject");
			}
		}

		@Override
		void marks() {
			// TODO Auto-generated method stub
			
			boolean flag=false; 
			   do {
				 
	         float marks=s1+s2+s3;
		    
	         System.out.println("\nStudent Information:");
	         System.out.println("Name:"+name+"  "+"Roll No:"+rollno );
		     System.out.println("Total Marks="+marks);
		    
		    if(s1>40 && s2>40 && s3>40) {
		    	
		    	System.out.println("Congratulation! you are pass in All subjects");
		    	 	
		    }else {
		    	System.out.println("Sorry you Are fail");
		    	
		    }
		    	
			   System.out.println("\nIf you want to continue press Y :");
			    System.out.println("If you want to End press N :");
			     
			    String r=s.next();
			      
			     if(r.equalsIgnoreCase("Y")){
			       flag=true;
			       m1();
			       studInfo(); 
			     }else{
			         flag=false;
			         System.out.println("Program End");
			       }

			 }while(flag);

			 }
			
	} 


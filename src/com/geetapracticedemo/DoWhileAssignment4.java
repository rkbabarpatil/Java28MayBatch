package com.geetapracticedemo;

import java.util.Scanner; 

public class DoWhileAssignment4 {

	public static void main(String args[]){
		int n;

	Scanner r=new Scanner(System.in);

	System.out.println("Enter the Number :");
	 n=r.nextInt();
	 
	 boolean flag=false; 
   do {
	 
	System.out.println("Choose options :");
	System.out.println("Check the given no is Even or Odd press 1");
	System.out.println("Check the given no is +ve or -ve press 2");
	System.out.println("Check the given no is Divided by 3 or Not press 3");
	System.out.println("Select given one option= ");
	
	int choice=r.nextInt();

	switch(choice){
	case 1:
	  if(n%2==0){
	     System.out.println("Given Number is Even");
	   }else{
	     System.out.println("Given Number is Odd");
	    }
	  break;
	case 2:
	  if(n>0){
	     System.out.println("Given Number is +ve");
	   }else{
	     System.out.println("Given Number is -ve");
	     }
	   break;
	case 3:
	  if(n%3==0){
	     System.out.println("Given Number is Divided by 3");
	   }else{
	     System.out.println("Given Number is NOT Divided by 3");
	     }
	  break;
	default:
	     System.out.println("You Enter Wrong choice");
	     break;
	    }
	    System.out.println("If you want to continue press Y :");
	    System.out.println("If you want to End press N :");
	     
	    String s=r.next();
	      
	     if(s.equalsIgnoreCase("Y")){
	       flag=true;
	     }else{
	         flag=false;
	         System.out.println("Program End");
	       }

	 }while(flag);

	 }
	}

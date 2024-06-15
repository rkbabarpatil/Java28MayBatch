package com.geetapracticedemo;

import java.util.Scanner;

public class MultilevelInheDemo {
		
		public static void main(String[] args) {
		
		Odd o=new Odd();
		}
		
	}

	class Number{
		 
			int i,fno,tno;
			int SumE=0,SumO=0,SumT=0;
			Scanner r=new Scanner(System.in);
			
			public Number() {
			System.out.println("Enter from Number:");
			fno = r.nextInt();
			
			System.out.println("Enter To Number:");
			tno = r.nextInt();
			
			}
			
	}

	 class Even extends Number {
		
		public Even() {
			super();
		
		for(i=fno;i<=tno;i++) {

			if(i%2==0) {
				SumE=SumE+i;
			}
			else{
				SumO=SumO+i;
				}
		  }
		System.out.println("Sum of Even No="+SumE);
	    System.out.println("Sum of Odd No="+SumO);
		
	   }	
	}
	 
	class Odd extends Even{
		
		   public Odd() {
			   super();
			 
           for( i=fno;i<=tno;i++) {
				
				if(i%3==0 && i%5==0 ){
					SumT=SumT+i;	
				
				}
           }	
        System.out.println("Sum of Divided by 3 and 5 No="+SumT);
		
	
		   }	
		
	
	}

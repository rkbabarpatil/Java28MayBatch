package com.geetapracticedemo;

import java.util.Scanner;

public class ForLoopProgram2 {

		public static void main(String[] args) {
			int i,sumT=0;
			Scanner r=new Scanner(System.in);
			System.out.println("Enter from Number:");
			int f_no = r.nextInt();
			
			System.out.println("Enter To Number:");
			int t_no = r.nextInt();
			
			for( i=f_no;i<=t_no;i++) {
				
				if(i%3==0 && i%5==0 ){
					sumT=sumT+i;	
				
				}
			}	
			System.out.println("Sum of Divided by 3 and 5 No="+sumT);
		}
}

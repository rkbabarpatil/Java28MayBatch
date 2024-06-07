package com.geetapracticedemo;

import java.util.Scanner;

public class ForLoopProgram {
	
	public static void main(String[] args) {
		int i,SumE=0,SumO=0;
		Scanner r=new Scanner(System.in);
		System.out.println("Enter from Number:");
		int f_no = r.nextInt();
		
		System.out.println("Enter To Number:");
		int t_no = r.nextInt();
		
		for( i=f_no;i<=t_no;i++) {
			
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

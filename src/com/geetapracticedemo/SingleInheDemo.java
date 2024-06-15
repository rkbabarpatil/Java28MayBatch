package com.geetapracticedemo;

import java.util.Scanner;

public class SingleInheDemo{
	
	public static void main(String[] args) {
	
	SingleDemo s=new SingleDemo();
	}
	
}

class Single{
	 
		int i,fno,tno;
		int SumE=0,SumO=0;
		Scanner r=new Scanner(System.in);
		
		public Single() {
		System.out.println("Enter from Number:");
		fno = r.nextInt();
		
		System.out.println("Enter To Number:");
		tno = r.nextInt();
		
		}
		
}

 class SingleDemo extends Single {
	
	public SingleDemo() {
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



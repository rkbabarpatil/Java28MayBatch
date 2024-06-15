package com.geetapracticedemo;

public class FlowControlStatement {

	public static void main(String[] args) {
		
		FlowControlStatement f=new FlowControlStatement();
		f.m1();
		f.m2();	
		
	}
	int i;
		public void m1() {
			
		   System.out.println("Continue Statement:");
			
		for(i=0;i<=10;i++) {
			
			if(i==5) {
				continue;  
			}
			System.out.println(i);
		}
	}
		void m2() {
			
			System.out.println("Break Statement:");
   		
        for(i=0;i<=10;i++) {
			
			if(i==5) {
				break;
			}
			System.out.println(i);
		
        }
        }
		
	
}



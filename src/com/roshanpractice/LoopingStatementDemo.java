package com.roshanpractice;

public class LoopingStatementDemo {
	static void forLoopDemo() {
		for(int i=1;i<=20;i++) {
			if(i%2==0) 
				System.out.println("Even Number - "+i);			
		}
	}
	static void forLoopDemoTwo() {
		for(int i=1;i<=10;i++) {
				System.out.println("5th table - "+(i*5));			
		}
	}
	public static void main(String[] args) {
		//forLoopDemo();
		forLoopDemoTwo();
	}
}

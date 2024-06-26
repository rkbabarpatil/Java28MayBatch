package com.roshanpractice;

import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
	stackList();
}
static void stackList() {
	Stack<Integer> s1 = new Stack<Integer>();
	s1.push(10);
	s1.add(20);
	s1.add(30);
	s1.add(40);
	System.out.println("Stack list = "+s1);
	s1.pop();
	System.out.println("Stack list = "+s1);
	System.out.println(s1.peek());
	
}
}

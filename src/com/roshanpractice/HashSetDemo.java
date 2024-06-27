package com.roshanpractice;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		hashDemo();
	}
	static void hashDemo() {
		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(10);
		h1.add(10);
		h1.add(20);
		h1.add(30);
		h1.add(40);
		System.out.println("Hashset = "+h1);
	}
}

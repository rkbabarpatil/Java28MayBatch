package com.roshanpractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo {
	static void m1() throws FileNotFoundException {
		m2();
		System.out.println("Inside m1");
	}
	static void m2() throws FileNotFoundException {
		m3();
		System.out.println("Inside m2");
	}
	static void m3() throws FileNotFoundException {
		File f1 = new File("abc.txt");
		FileInputStream fi  = new FileInputStream(f1);
		System.out.println("Inside m3");
	}
	public static void main(String[] args) throws FileNotFoundException {
		m1();
	}
}

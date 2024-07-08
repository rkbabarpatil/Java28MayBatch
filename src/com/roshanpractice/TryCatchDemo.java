package com.roshanpractice;

import java.io.File;
import java.io.FileInputStream;

public class TryCatchDemo {
	static void m1() {
		m2();
		System.out.println("Inside m1");
	}
	static void m2() {
		m3();
		System.out.println("Inside m2");
	}
	static void m3() {
		System.out.println("1====m3");
		System.out.println("2====m3");
		System.out.println("3====m3");
		try {
		File f1 = new File("abc.txt");
		FileInputStream fi = new FileInputStream(f1);
		}catch (Exception e) {
			//e.printStackTrace();
		}finally {
			System.out.println("Inside finally block");
		}
		System.out.println("Inside m3");
	}
	public static void main(String[] args) {
		m1();
	}
}

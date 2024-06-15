package com.roshanpractice;

import java.util.Scanner;

public class MultiIntefeces {
	public static void main(String[] args) {
		Calculation c1 = new Calculation();
		c1.add();
		c1.sub();
		c1.multi();
	}
}
interface Arithmatic{
	void add();
	void sub();
}
interface ArithmaticSecond{
	void add();
	void multi();
}
class Calculation implements Arithmatic,ArithmaticSecond{
	int fnum, lnum;
	Scanner sc = new Scanner(System.in);
	@Override
	public void multi() {
		System.out.println("Enter the First Number = ");
		fnum = sc.nextInt();
		System.out.println("Enter the Second Number = ");
		lnum = sc.nextInt();
		System.out.println("Result = "+(fnum*lnum));
		
	}

	@Override
	public void add() {
		System.out.println("Enter the First Number = ");
		fnum = sc.nextInt();
		System.out.println("Enter the Second Number = ");
		lnum = sc.nextInt();
		System.out.println("Result = "+(fnum+lnum));
		
	}

	@Override
	public void sub() {
		System.out.println("Enter the First Number = ");
		fnum = sc.nextInt();
		System.out.println("Enter the Second Number = ");
		lnum = sc.nextInt();
		System.out.println("Result = "+(fnum-lnum));
	}
	
}
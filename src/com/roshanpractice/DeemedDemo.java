package com.roshanpractice;

public class DeemedDemo {
	public static void main(String[] args) {
		int ad=m1();
		System.out.println("values - "+ad);
	}
	static int m1(){
		System.out.println("line1 - ");
		System.out.println("line2 - ");
		System.out.println("line3- ");
		try{
			int a=10/0;
			return 1;
		}catch(Exception e){
			e.printStackTrace();
			return 2;
		}
		finally{
			return 3;
		}
	}
}

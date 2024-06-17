package com.roshanpractice;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismDemo {
 public static void main(String[] args) {
	byte a=10;
	int b= a;// Implicit casting
	double c= 10.20;
	float d = (float) c;//explicit casting
	CompileTimeDemo c1= new CompileTimeDemo();
	c1.m1(a);
	//byte--> short--> int--> long--> float--> double-->
}
}
class CompileTimeDemo{
	void m1(){
		System.out.println("No parameter");
	}
//	void m1(int a){
//		System.out.println("Single Parameter int= "+a);
//	}
//	void m1(float a){
//		System.out.println("Single parameter float = "+a);
//	}
	void m1(int a, float b){
		System.out.println("Double parameter int , float= "+a +" "+b);
	}
	void m1(float a ,int b){
		System.out.println("Double parameter float , int = "+a+" "+b);
	}
	void m1(Float a){
		System.out.println("Single parameter Float Rapper class = "+a);
	}
//	void m1(Number a) {
//		System.out.println("Single parameter Number class ="+a);
//	}
	void m1(Object a){
		System.out.println("Single parameter Object class ="+a);
	}

}

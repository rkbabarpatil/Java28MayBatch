package com.geetapracticedemo;

public class HerarchicalDemo {
	
	public static void main(String[] args) {
		
		
		A a=new A(1,"abc");
		B b=new B(3,"pqr","pune");
		C c=new C(3,"xyz",9988776665L);
		
		System.out.println("Student A;"+a);
		System.out.println("Student B;"+b);
		System.out.println("Student C;"+c);
		
	}

}

class A{
	
	int rollno;
	String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "A [rollno=" + rollno + ", name=" + name + "]";
	}
	public A(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
}


class B extends  A{
	
	String Address;

	public B(int rollno, String name, String address) {
		super(rollno, name);
		Address = address;
	}

	@Override
	public String toString() {
		return "B [Address=" + Address + ", rollno=" + rollno + ", name=" + name + "]";
	}
	
   
		
}


class C extends A{
	
	long mobilrNo;

	public C(int rollno, String name, long mobilrNo) {
		super(rollno, name);
		this.mobilrNo = mobilrNo;
	}

	@Override
	public String toString() {
		return "C [mobilrNo=" + mobilrNo + ", rollno=" + rollno + ", name=" + name + "]";
	}

	
}









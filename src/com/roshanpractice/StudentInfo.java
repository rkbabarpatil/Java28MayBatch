package com.roshanpractice;

import java.util.HashMap;
import java.util.Map;

public class StudentInfo {
	public static void main(String[] args) {
		StudentIn s1 = new StudentIn(1, "AA", "Pqr");
		StudentIn s2 = new StudentIn(1, "AA", "Pqr");
		StudentIn s3 = new StudentIn(2, "BB", "xyz");
		StudentIn s4 = new StudentIn(3, "CC", "MNO");
		StudentIn s5 = new StudentIn(4, "DD", "ABC");
		Map <StudentIn,String> m1 = new HashMap<StudentIn,String>();
		m1.put(s1, "aaa");
		m1.put(s2, "bbb");
		m1.put(s3, "ccc");
		m1.put(s4, "ddd");
		m1.put(s5, "eee");
	}
}
class StudentIn{
	int roll;
	String sname;
	String address;
	public StudentIn(int roll, String sname, String address) {
		super();
		this.roll = roll;
		this.sname = sname;
		this.address = address;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", sname=" + sname + ", address=" + address + "]";
	}
	
}
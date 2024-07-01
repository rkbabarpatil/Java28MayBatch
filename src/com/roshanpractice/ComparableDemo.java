package com.roshanpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
	public static void main(String[] args) {
		StudInfo s1 = new StudInfo(1, "AA", 65);
		StudInfo s2 = new StudInfo(2, "bb", 75);
		StudInfo s3 = new StudInfo(3, "cc", 85);
		StudInfo s4 = new StudInfo(4, "dd", 95);
		StudInfo s5 = new StudInfo(5, "ee", 45);
		List<StudInfo> l1 = new ArrayList<StudInfo>();
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		l1.add(s4);
		l1.add(s5);
		System.out.println("before Student info - "+l1);
		Collections.sort(l1);
		System.out.println("After sorting - "+l1);
	}
}
class StudInfo implements Comparable<StudInfo>{
	int sid;
	String sname;
	int marks;
	public StudInfo(int sid, String sname, int marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudInfo [sid=" + sid + ", sname=" + sname + ", marks=" + marks + "]\n";
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public int compareTo(StudInfo o) {
		//return -(this.getMarks()-o.getMarks());
		return -(this.getSname().compareTo(o.getSname()));
	}
	
}

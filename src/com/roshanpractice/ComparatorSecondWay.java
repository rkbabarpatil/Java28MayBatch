package com.roshanpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSecondWay {
public static void main(String[] args) {
	PartyProd p1 = new PartyProd(01, "Table", 2050);
	PartyProd p2 = new PartyProd(02, "Chair", 2030);
	PartyProd p3 = new PartyProd(03, "Lights", 2065);
	List<PartyProd> l1 = new ArrayList<PartyProd>();
	l1.add(p1);
	l1.add(p2);
	l1.add(p3);
	System.out.println("Before Sorting - "+l1);
	SortingClass s1 = new SortingClass();
	Collections.sort(l1, s1);
	System.out.println("After Sorting - "+l1);
}
}
class PartyProd{
	int pid;
	String pname;
	int expiry;
	public PartyProd(int pid, String pname, int expiry) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.expiry = expiry;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getExpiry() {
		return expiry;
	}
	public void setExpiry(int expiry) {
		this.expiry = expiry;
	}
	@Override
	public String toString() {
		return "PartyProd [pid=" + pid + ", pname=" + pname + ", expiry=" + expiry + "]\n";
	}
}
class SortingClass implements Comparator<PartyProd>{

	@Override
	public int compare(PartyProd o1, PartyProd o2) {
		// TODO Auto-generated method stub
		return -(o1.getPname().compareTo(o2.getPname()));
	}
	
}
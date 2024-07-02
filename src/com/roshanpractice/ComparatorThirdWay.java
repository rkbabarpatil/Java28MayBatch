package com.roshanpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorThirdWay {
	public static void main(String[] args) {
		PartyProdII p1 = new PartyProdII(01, "Table", 2050);
		PartyProdII p2 = new PartyProdII(02, "Chair", 2030);
		PartyProdII p3 = new PartyProdII(03, "Lights", 2065);
		List<PartyProdII> l1 = new ArrayList<PartyProdII>();
		l1.add(p1);
		l1.add(p2);
		l1.add(p3);
		System.out.println("Before Sorting - "+l1);
		Comparator<PartyProdII> c1 = new Comparator<PartyProdII>() {

			@Override
			public int compare(PartyProdII o1, PartyProdII o2) {
				return -(o1.getExpiry()-o2.getExpiry());
			}
		};
		Collections.sort(l1, c1);
		System.out.println("After Sorting - "+l1);
	}
}
class PartyProdII{
	int pid;
	String pname;
	int expiry;
	public PartyProdII(int pid, String pname, int expiry) {
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
		return "PartyProdII [pid=" + pid + ", pname=" + pname + ", expiry=" + expiry + "]\n";
	}
	
}
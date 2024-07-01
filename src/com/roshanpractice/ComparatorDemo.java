package com.roshanpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
	public static void main(String[] args) {
		BankInfo b1 = new BankInfo(1, "bob", 25000);
		BankInfo b2 = new BankInfo(2, "hdfc", 35000);
		BankInfo b3 = new BankInfo(3, "sbi", 85000);
		BankInfo b4 = new BankInfo(4, "pnb", 5000);
		List<BankInfo> l1 =new ArrayList<BankInfo>();
		l1.add(b1);
		l1.add(b2);
		l1.add(b3);
		l1.add(b4);
		System.out.println("List before Sorting - "+l1);
		//Collections.sort(l1, new BankInfo());
		Collections.sort(l1, new SortByBankName());
		System.out.println("After sorting - "+l1);
		Comparator<BankInfo> ind = new Comparator<BankInfo>() {
			@Override
			public int compare(BankInfo o1, BankInfo o2) {
				return -((o1.getBid()-o2.getBid()));
			}
		}; 
		Collections.sort(l1, ind);
		System.out.println("After sorting By id decending- "+l1);
	}
}
class BankInfo implements Comparator<BankInfo>{
	int bid;
	String bname;
	int bal;
	public BankInfo(int bid, String bname, int bal) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bal = bal;
	}
	@Override
	public String toString() {
		return "BankInfo [bid=" + bid + ", bname=" + bname + ", bal=" + bal + "]\n";
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	
	public BankInfo() {
		super();
	}
	@Override
	public int compare(BankInfo o1, BankInfo o2) {
		return -(o1.getBal()-o2.getBal());
	}
}
class SortByBankName implements Comparator<BankInfo>{

	@Override
	public int compare(BankInfo o1, BankInfo o2) {
		return -(o1.getBname().compareTo(o2.getBname()));
	}
	
}
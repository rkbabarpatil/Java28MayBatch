package com.roshanpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorFirstWay {
	public static void main(String[] args) {
		ProductInfo p1 = new ProductInfo(1, "Pen", 32);
		ProductInfo p2 = new ProductInfo(2, "Pencil", 35);
		ProductInfo p3 = new ProductInfo(3, "Box", 3);
		ProductInfo p4 = new ProductInfo(4, "Notes", 332);
		ProductInfo p5 = new ProductInfo();
		List<ProductInfo> l1 = new ArrayList<ProductInfo>();
		l1.add(p1);
		l1.add(p2);
		l1.add(p3);
		l1.add(p4);
		System.out.println("Before Sorting - "+l1);
		Collections.sort(l1, p5);
		System.out.println("After Sorting - "+l1);
	}
}
class ProductInfo implements Comparator<ProductInfo>{
	int pId;
	String pName;
	int pNumber;
	public ProductInfo(int pId, String pName, int pNumber) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pNumber = pNumber;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpNumber() {
		return pNumber;
	}
	public void setpNumber(int pNumber) {
		this.pNumber = pNumber;
	}
	@Override
	public String toString() {
		return "ProductInfo [pId=" + pId + ", pName=" + pName + ", pNumber=" + pNumber + "]\n";
	}
	
	public ProductInfo() {
		super();
	}
	@Override
	public int compare(ProductInfo o1, ProductInfo o2) {
		// TODO Auto-generated method stub
		return -(o1.getpId()-o2.getpId());
	}

}

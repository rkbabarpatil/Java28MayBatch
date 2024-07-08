package com.roshanpractice;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Map;

public class FifthContract {
public static void main(String[] args) {
	BankDemo b1 = new BankDemo(1, "bob", 450000);
	BankDemo b2 = new BankDemo(1, "hdfc", 450000);
	BankDemo b3 = new BankDemo(2, "hdfc", 850000);
	BankDemo b4 = new BankDemo(3, "SBI", 50000);
	Map<BankDemo, String> m1 = new HashMap<BankDemo, String>();
	m1.put(b1, "AA");
	m1.put(b2, "BB");
	//m1.put(null, "as");
	m1.put(b3, "CC");
	m1.put(b4, "DD");
	System.out.println("HashMap Bank Details - "+m1);
	Map<BankDemo, String> m2 = new IdentityHashMap<BankDemo, String>();
	m2.put(b1, "AA");
	m2.put(b2, "BB");
	m2.put(b3, "CC");
	m2.put(b4, "DD");
	System.out.println("IdentityHashMap Bank Details - "+m2);
	Map<Integer, String> m3 = new Hashtable<Integer, String>();
	m3.put(1, "ss");
	System.out.println(m3);
}
}
class BankDemo{
	int id;
	String name;
	int money;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public BankDemo(int id, String name, int money) {
		super();
		this.id = id;
		this.name = name;
		this.money = money;
	}
	@Override
	public String toString() {
		return "BankDemo [id=" + id + ", name=" + name + ", money=" + money + "]\n";
	}
	@Override
	public int hashCode() {
		System.out.println("Hello");
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankDemo other = (BankDemo) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
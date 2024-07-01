package com.roshanpractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ForthContract {
	public static void main(String[] args) {
		EmployeeInfoIII e1 = new EmployeeInfoIII(1,"AA","BB");
		System.out.println("Hashcode e1 - "+e1.hashCode());
		EmployeeInfoIII e2 = new EmployeeInfoIII(1,"AA","BB");
		System.out.println("Hashcode e2 - "+e2.hashCode());
		EmployeeInfoIII e3 = new EmployeeInfoIII(1,"AA","BB");
		System.out.println("Hashcode e3 - "+e3.hashCode());
		EmployeeInfoIII e4 = new EmployeeInfoIII(1,"AA","BB");
		System.out.println("Hashcode e4 - "+e4.hashCode());
		Set<EmployeeInfoIII> ss = new HashSet<EmployeeInfoIII>();
		ss.add(e1);
		ss.add(e2);
		ss.add(e3);
		ss.add(e4);
		//System.out.println("Emp = "+ss);
		Map<EmployeeInfoIII,String> m1= new HashMap<EmployeeInfoIII,String>();
		m1.put(e1,"abc");
		m1.put(e2, "abc1");
		m1.put(e3, "pqr");
		System.out.println("Map - "+m1);
	}
}
class EmployeeInfoIII{
	int id;
	String name;
	String Add;
	public EmployeeInfoIII(int id, String name, String add) {
		super();
		this.id = id;
		this.name = name;
		Add = add;
	}
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
	public String getAdd() {
		return Add;
	}
	public void setAdd(String add) {
		Add = add;
	}
	@Override
	public String toString() {
		return "EmployeeInfoIII [id=" + id + ", name=" + name + ", Add=" + Add + "]\n";
	}
	@Override
	public int hashCode() {
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
		EmployeeInfoIII other = (EmployeeInfoIII) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
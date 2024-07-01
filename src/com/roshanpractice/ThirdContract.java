package com.roshanpractice;

import java.util.HashSet;
import java.util.Set;

public class ThirdContract {
	public static void main(String[] args) {
		EmployeeInfoII e1 = new EmployeeInfoII(1,"AA","BB");
		System.out.println("Hashcode e1 - "+e1.hashCode());
		EmployeeInfoII e2 = new EmployeeInfoII(1,"AA","BB");
		System.out.println("Hashcode e2 - "+e2.hashCode());
		EmployeeInfoII e3 = new EmployeeInfoII(2,"CC","DD");
		System.out.println("Hashcode e3 - "+e3.hashCode());
		EmployeeInfoII e4 = new EmployeeInfoII(3,"EE","FF");
		System.out.println("Hashcode e4 - "+e4.hashCode());
		Set<EmployeeInfoII> ss = new HashSet<EmployeeInfoII>();
		ss.add(e1);
		ss.add(e2);
		ss.add(e3);
		ss.add(e4);
		System.out.println("Emp = "+ss);
	}
}
class EmployeeInfoII{
	int id;
	String name;
	String Add;
	public EmployeeInfoII(int id, String name, String add) {
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
		return "EmployeeInfoII [id=" + id + ", name=" + name + ", Add=" + Add + "]\n";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
}
package com.roshanpractice;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ForFirstTwoContracts {
	public static void main(String[] args) {
		EmployeeInfo e1 = new EmployeeInfo(1,"AA","BB");
		System.out.println("Hashcode e1 - "+e1.hashCode());
		EmployeeInfo e2 = new EmployeeInfo(1,"AA","BB");
		System.out.println("Hashcode e2 - "+e2.hashCode());
		EmployeeInfo e3 = new EmployeeInfo(2,"CC","DD");
		System.out.println("Hashcode e3 - "+e3.hashCode());
		EmployeeInfo e4 = new EmployeeInfo(3,"EE","FF");
		System.out.println("Hashcode e4 - "+e4.hashCode());
		Set<EmployeeInfo> ss = new HashSet<EmployeeInfo>();
		ss.add(e1);
		ss.add(e2);
		ss.add(e3);
		ss.add(e4);
		System.out.println("Emp = "+ss);
	}
}
class EmployeeInfo{
	int id;
	String name;
	String Add;
	public EmployeeInfo(int id, String name, String add) {
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
		return "EmployeeInfo [id=" + id + ", name=" + name + ", Add=" + Add + "]\n";
	}
	
}
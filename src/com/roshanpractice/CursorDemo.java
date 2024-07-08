package com.roshanpractice;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class CursorDemo {
	static void emunerationDemo() {
		Vector<Integer> l1 = new Vector();
		l1.add(10);
		l1.add(30);
		l1.add(70);
		l1.add(50);
		Enumeration<Integer> rs = l1.elements();
		while (rs.hasMoreElements()) {
			Integer integer = (Integer) rs.nextElement();
			System.out.println(integer);
		}
	}
	static void listIteratorDemo() {
		Vector <Integer> l1 = new Vector<Integer>();
		l1.add(80);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		ListIterator<Integer> rs = l1.listIterator();
		while (rs.hasNext()) {
			Integer integer = (Integer) rs.next();
			System.out.println("Integer - "+integer);
			l1.add(50);
		}
		System.out.println(l1);
	}
	static void iteratorDemo() {
		List <Integer> l1 = new ArrayList<Integer>();
		l1.add(80);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		Iterator<Integer> rs = l1.iterator();
		while (rs.hasNext()) {
			Integer integer = (Integer) rs.next();
			System.out.println(integer);
			rs.remove();
		}
		System.out.println("List"+l1);
	}
	static void iterateUsingForLoop() {
		List <Integer> l1 = new ArrayList<Integer>();
		l1.add(80);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
			System.out.println(l1.remove(l1.get(i)));
		}
		System.out.println(l1);
	}
	public static void main(String[] args) {
		//emunerationDemo();
		//iteratorDemo();
		//iterateUsingForLoop();
		listIteratorDemo();
	}
}

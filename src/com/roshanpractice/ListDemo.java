package com.roshanpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
	static void arraylistDemo() {
		List l1 = new ArrayList();//Normal Declaration, We store Hetrogenious data
		l1.add(12);
		l1.add("abc");
		l1.add('A');
		l1.add(10.25);
		l1.add(20.45f);//Here we get class cast exception. 
		List<Integer> l2 = new ArrayList<Integer>();//Generic Declaration, We store homogenious data
		l2.add(12);
		l2.add(13);
		l2.add(14);
		l2.add(15);
		//Methods of Collection
		List<Integer> l3 = new ArrayList<Integer>();
		l3.addAll(l2);//Copy Element
		System.out.println("List 3"+l3);
		System.out.println("Size = "+l3.size());
		System.out.println("Remove = "+l3.remove(1));
		System.out.println("List 3"+l3);
		System.out.println("Contains = "+l3.contains(13));
		
		List<Integer> l4 = new ArrayList<Integer>();
		l4.add(10);
		l4.add(20);
		l4.add(30);
		l4.add(40);
		
		List<Integer> l5 = new ArrayList<Integer>();
		l5.add(30);
		l5.add(40);
		l5.add(50);
		l5.add(60);
//		System.out.println("Before Remove all");
//		System.out.println("List L4 ="+l4);
//		System.out.println("List L5 ="+l5);
//		//l4.removeAll(l5);
//		System.out.println("After Remove all");
//		System.out.println("List L4 ="+l4);
//		System.out.println("List L5 ="+l5);
		
		System.out.println("Before retain all");
		System.out.println("List L4 ="+l4);
		System.out.println("List L5 ="+l5);
		l4.retainAll(l5);
		System.out.println("After retain all");
		System.out.println("List L4 ="+l4);
		System.out.println("List L5 ="+l5);
		
		l4.clear();
		
		System.out.println("L4 = "+l4.isEmpty());
		System.out.println("L5 = "+l5.isEmpty());
		
		System.out.println("");
		System.out.println("After Clear = "+l4);
		Collections.synchronizedList(l4);//utility class
	}
	public static void main(String[] args) {
		arraylistDemo();
	}
}

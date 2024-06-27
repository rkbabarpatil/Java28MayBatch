package com.roshanpractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapMethods {
	public static void main(String[] args) {
		hashDemo();
	}
	static void hashDemo() {
		HashMap<Integer,String> h1 = new HashMap<Integer,String>();
		h1.put(1, "AA");
		h1.put(2, "BB");
		h1.put(3, "cc");
		h1.put(4, "BB");
		h1.put(5, "DD");
		System.out.println("Map Element = "+h1);
		HashMap<Integer,String> h2 = new HashMap<Integer,String>();
		h2.putAll(h1);
		h2.put(6, "EE");
		System.out.println("Contains Key = "+h2.containsKey(1));
		System.out.println("Contains value = "+h2.containsValue("EE"));
		Set<Integer> kset=h2.keySet();
		Collection Vset=h2.values();
		System.out.println("KeySet = "+kset);
		System.out.println("Value set = "+Vset);
		System.out.println("Size of map"+h2.size());
		Collection entries=h2.entrySet();
		System.out.println("All Enteries = "+entries);
		h2.clear();
		System.out.println("H2 map = "+h2);
		
	}
}

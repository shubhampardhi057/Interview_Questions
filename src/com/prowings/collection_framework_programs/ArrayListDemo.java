package com.prowings.collection_framework_programs;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("hello");
		a1.add("hii");
		
		ArrayList<String> a2 = new ArrayList<>();
		a2.add("java");
		a2.add("python");
		a2.add("php");
		a2.add("kotlin");
		
		
		ArrayList<String> a3 = new ArrayList<>();
		a3.addAll(a1);
		a3.addAll(a2);
		
		
		System.out.println(a3.remove(0));
		System.out.println(a3.removeAll(a1));
		
		System.out.println(a3.contains("java"));
		System.out.println(a3.containsAll(a2));
		
		System.out.println(a3.retainAll(a1));
		
		System.out.println(a3.isEmpty());
		System.out.println(a3.size());
		
		a2.clear();
		
		System.out.println(a2.hashCode());
		System.out.println(a2.equals(a3));
		
		System.out.println(a3);
	}

}

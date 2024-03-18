package com.prowings.collection_framework_programs;

import java.util.ArrayList;

public class ArrayListMethodDemo {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		al.add("hello");
		al.add(20);
		al.add("hello");
		al.add("hii");
		al.add(10);
		al.add(30);
		
		al.ensureCapacity(20);
		System.out.println(al);
		
		System.out.println("Size : "+al.size());
	}

}

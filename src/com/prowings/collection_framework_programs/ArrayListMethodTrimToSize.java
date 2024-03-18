package com.prowings.collection_framework_programs;

import java.util.ArrayList;

public class ArrayListMethodTrimToSize {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		al.add("hello");
		al.add(20);
		al.add("hii");
		
		System.out.println("Size : "+ al.size());
		
		System.out.println(al);
		
		al.trimToSize();
		
		System.out.println("Size : "+ al.size());
	}

}

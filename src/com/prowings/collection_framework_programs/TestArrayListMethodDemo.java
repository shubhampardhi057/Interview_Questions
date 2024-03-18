package com.prowings.collection_framework_programs;

import java.util.ArrayList;

public class TestArrayListMethodDemo extends ArrayList {
	
	public static void main(String[] args) {
		
		TestArrayListMethodDemo lst = new TestArrayListMethodDemo();
		lst.add("A");
		lst.add("B");
		lst.add("C");
		lst.add("E");
		lst.add("F");
		
		System.out.println(lst);

		System.out.println("Removing elements with range :");
		
		lst.removeRange(0,3);
		
		System.out.println(lst);
	}

}

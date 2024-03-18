package com.prowings.collection_framework_programs;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListMethodOnArrayList {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		al.add("hello");
		al.add(20);
		al.add("hii");
		
		System.out.println(al);
		
		System.out.println(al.get(1));
		
		al.set(1,"world");
		
		System.out.println(al);
		
		System.out.println(al.indexOf("hello"));
		System.out.println(al.lastIndexOf("hii"));
		
		ListIterator ltr = al.listIterator(3);
		
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
//			al.add("aa");
		}
		
		ArrayList a2 = new ArrayList<>();
		a2.add("hello");
		a2.add(20);
		a2.add("hii");
		
		List  l1 = a2.subList(0, 3);
		System.out.println(l1);
		
		
		List  l2 = new ArrayList<>(a2.subList(0,3));
		System.out.println(l2);
	}

}

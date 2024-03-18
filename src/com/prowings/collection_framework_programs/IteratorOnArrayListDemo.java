package com.prowings.collection_framework_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorOnArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList<>();
		a1.add("hii");
		a1.add("hello");
		a1.add("hiii");
		a1.add(10);
		
		Iterator itr = a1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
			if(itr.next().equals(50))
			{
				a1.set(2,"helloo");
				a1.remove(1);
				a1.add("world");
			}
			
			if(itr.next().equals(10))
			{
				itr.remove();
			}
		}
		
		System.out.println(a1);
		
		ArrayList al = new ArrayList<>();
		al.add("hello");
		al.add(20);
		al.add("hii");
		al.add(40);
		al.add("hii");
		al.add("hello");
		
		Object [] myArray = al.toArray();
		
		System.out.println(Arrays.toString(myArray));
	}

}

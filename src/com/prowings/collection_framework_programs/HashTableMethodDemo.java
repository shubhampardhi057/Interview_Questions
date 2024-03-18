package com.prowings.collection_framework_programs;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableMethodDemo {
	
	public static void main(String[] args) {
		
		Hashtable<String,Integer> ht = new Hashtable<>();
		System.out.println(ht.put("AAA",123));
		System.out.println(ht.put("BBB",456));
		System.out.println(ht.put("CCC",789));
		System.out.println(ht.put("DDD",102));
		
		System.out.println(ht.size());
		System.out.println(ht.isEmpty());
		
		System.out.println(ht.get("BBB"));
		System.out.println(ht.remove("CCC"));
		
		Enumeration emr = ht.elements();
		
		while(emr.hasMoreElements())
		{
			System.out.println(emr.nextElement());
		}
		
		Enumeration emr1 = ht.keys();
		
		while(emr1.hasMoreElements())
		{
			System.out.println(emr1.nextElement());
		}
		
		System.out.println(ht);
	}

}

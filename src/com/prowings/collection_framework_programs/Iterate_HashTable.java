package com.prowings.collection_framework_programs;

import java.util.Enumeration;
import java.util.Hashtable;

public class Iterate_HashTable {
	
	public static void main(String[] args) {
		
		Hashtable<String,String> hashTable = new Hashtable<>();
		
		hashTable.put("1","Monday");
		hashTable.put("2","Tuesday");
		hashTable.put("3","Wednesday");
		hashTable.put("4","Thurday");
		hashTable.put("5","Friday");
		hashTable.put("6","Saturday");
		hashTable.put("7","Sunday");
		
		
		Enumeration<String> enumerationHashTable = hashTable.elements();
		
		while(enumerationHashTable.hasMoreElements())
		{
			System.out.println(enumerationHashTable.nextElement());
		}
	}

}

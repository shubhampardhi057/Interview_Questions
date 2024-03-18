package com.prowings.collection_framework_programs;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapMethodDemo {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> myMap = new HashMap<>();
		System.out.println(myMap.put("AAA",123));
		System.out.println(myMap.put("BBB",456));
		System.out.println(myMap.put("CCC",789));
		System.out.println(myMap.put("DDD",321));
		System.out.println(myMap.put("EEE",654));
		System.out.println(myMap.put("FFF",987));
		
		
		System.out.println(myMap.size());
		System.out.println(myMap.isEmpty());
		
		System.out.println(myMap.get("BBB"));
		System.out.println(myMap.get("EEE"));
		
		System.out.println(myMap.containsKey("DDD"));
		System.out.println(myMap.containsValue(789));
		
		Map<String,Integer> myMap1 = new HashMap<>();
		myMap1.putAll(myMap);
		System.out.println(myMap1);
		myMap1.clear();
		System.out.println(myMap1);
		
		myMap.remove("CCC");
		
		System.out.println(myMap.hashCode());
		System.out.println(myMap.equals(myMap1));
		
//		KEY SET
		
		Set<String> mySet = myMap.keySet();
		
		Iterator<String> itr = mySet.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
//		Values
		
		Collection<Integer> myValues = myMap.values();
		
		Iterator<Integer> itr1 = myValues.iterator();
		
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
//		ENTRY SET
		
		Set<Map.Entry<String,Integer>> mySet1 = myMap.entrySet();
		
		Iterator<Map.Entry<String,Integer>> itr2 = mySet1.iterator();
		
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
	}

}

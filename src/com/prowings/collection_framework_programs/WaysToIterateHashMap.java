package com.prowings.collection_framework_programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class WaysToIterateHashMap {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> map = new HashMap<>();
		map.put("AAA",123);
		map.put("BBB",456);
		map.put("CCC",789);
		map.put("DDD",321);
		
		System.out.println("Iterating by Keyset() with Iterator : ");
		
		Set<String> mySet = map.keySet();
		Iterator<String> itr = mySet.iterator();
		while(itr.hasNext())
		{
			String key = itr.next();
			System.out.println(key+" "+ map.get(key));
		}
		
		System.out.println("Iterating by Entryset() with Iterator : ");
		
		Set<Map.Entry<String,Integer>> mySet1 = map.entrySet();
		Iterator<Map.Entry<String,Integer>> itr1 = mySet1.iterator();
		while(itr1.hasNext())
		{
			Map.Entry<String,Integer> mapE = itr1.next();
			System.out.println(mapE.getKey()+ " "+ mapE.getValue());
		}
		
		System.out.println("Iterating by Keyset()  with for-Each loop : ");
		
		Set<String> setMy = map.keySet();
		for(String k : setMy)
		{
			System.out.println(k+" "+map.get(k));
		}
		
		System.out.println("Iterating by Entryset() with for-Each loop");
		
		Set<Map.Entry<String,Integer>> setE = map.entrySet();
		for(Map.Entry<String,Integer> e : setE)
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
	}
}



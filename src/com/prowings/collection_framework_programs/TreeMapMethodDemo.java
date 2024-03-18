package com.prowings.collection_framework_programs;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapMethodDemo {
	
	public static void main(String[] args) {
		
		TreeMap<Integer,String> tMap = new TreeMap<>();
		tMap.put(10,"AAA");
		tMap.put(40,"DDD");
		tMap.put(20,"BBB");
		tMap.put(50,"EEE");
		tMap.put(30,"CCC");
		
		System.out.println(tMap);
		
		Comparator cmp = tMap.comparator();
		System.out.println(cmp);
		
		System.out.println(tMap.firstKey());
		System.out.println(tMap.lastKey());
		
		Map<Integer,String> headMap = tMap.headMap(50);
		System.out.println(headMap);
		
		Map<Integer,String> tailMap = tMap.tailMap(30);
		System.out.println(tailMap);
		
		Map<Integer,String> subMap = tMap.subMap(20,50);
		System.out.println(subMap);
		
	}

}

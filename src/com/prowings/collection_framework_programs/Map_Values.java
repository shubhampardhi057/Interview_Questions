package com.prowings.collection_framework_programs;

import java.util.HashMap;

public class Map_Values {
	
	public static void main(String[] args) {
		
		   HashMap<String,String> hashMap = new HashMap<String,String>();//creating an empty hash map
		   hashMap.put("1","Monday");
		   hashMap.put("2","Tuesday");
		   hashMap.put("3","Wednesday");
		   hashMap.put("4","Thursday");
		   hashMap.put("5","Friday");
		   hashMap.put("6","Saturday");
		   hashMap.put("7","Sunday");
		
		   
		   System.out.println("The original hashmap is as follows : "+ hashMap);
		   
		   System.out.println("The collection view is as follows : "+ hashMap.values());
		   
	}

}

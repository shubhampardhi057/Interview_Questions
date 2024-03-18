package com.prowings.collection_framework_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle_Collection {
	
	public static void main(String[] args) {
		
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Monday");
		arrayList.add("Tuesday");
		arrayList.add("Wednesday");
		arrayList.add("Thursday");
		arrayList.add("Friday");
		arrayList.add("Saturday");
		arrayList.add("Sunday");
		
		
		Collections.shuffle(arrayList);
		
		System.out.println("The Shuffled arraylist is as follows :"+arrayList);
	}

}

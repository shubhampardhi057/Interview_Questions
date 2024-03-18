package com.prowings.collection_framework_programs;

import java.util.ArrayList;

public class Joined_ArrayLists {
	
	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Monday");
		list1.add("Tuesday");
		list1.add("Wednesday");
		list1.add("Thurday");
		
		System.out.println("The elements of the first array list is as follows : "+list1);
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Friday");
		list2.add("Saturday");
		list2.add("Sunday");
		
		System.out.println("The elements of the second array list is as follows : "+list1);
		
		ArrayList<String> joinedList = new ArrayList<>();
		joinedList.addAll(list1);
		joinedList.addAll(list2);
		
		System.out.println("The elements of the joined array list is as follows : "+joinedList);
		
	}

}

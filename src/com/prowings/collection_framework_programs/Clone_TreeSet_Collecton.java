package com.prowings.collection_framework_programs;

import java.util.TreeSet;

public class Clone_TreeSet_Collecton {
	
	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("Monday");
	    treeSet.add("Tuesday");
	    treeSet.add("Wednesday");
	    treeSet.add("Thursday");
	    treeSet.add("Friday");
	    treeSet.add("Saturday");
	    treeSet.add("Sunday");
	 
	    System.out.println("The original tree set is as follow : "+ treeSet);
	    
	    TreeSet<String> clonedTreeSet = (TreeSet<String>) treeSet.clone();
	    
	    System.out.println("The cloned tree set is as follow : "+ clonedTreeSet);
	    
	}

}

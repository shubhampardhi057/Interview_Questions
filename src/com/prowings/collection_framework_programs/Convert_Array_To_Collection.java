package com.prowings.collection_framework_programs;

import java.util.Arrays;
import java.util.List;

public class Convert_Array_To_Collection {
	
	public static void main(String[] args) {
		
		String [] sampleArray = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		int lengthArray  = sampleArray.length;
	
		System.out.println("The input elements are as follows :");
		
		for(int i=0;i<lengthArray;i++)
		{
			System.out.print(sampleArray[i]+" ");
		}
		System.out.println();
		
		List<String> convertedList = Arrays.asList(sampleArray);
		
		System.out.println("The converted list is as follows :"+convertedList);
	
	}

}

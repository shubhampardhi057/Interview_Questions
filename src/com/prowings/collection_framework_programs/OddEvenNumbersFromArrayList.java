package com.prowings.collection_framework_programs;

import java.util.ArrayList;
import java.util.List;

public class OddEvenNumbersFromArrayList {
	
	public static void main(String[] args) {
		
		List<Integer> inputList = new ArrayList<>();
		inputList.add(1);
		inputList.add(2);
		inputList.add(3);
		inputList.add(4);
		inputList.add(5);
		inputList.add(6);
		
		List<Integer> result = filterEvenNumbers(inputList);
		
		System.out.println("Original List : "+ inputList);
		
		System.out.println("Even Numbers : "+ result);
	}

	private static List<Integer> filterEvenNumbers(List<Integer> inputList) {
		
		List<Integer> evenNumbers = new ArrayList<>();
		
		for(Integer number : inputList)
		{
			if(number % 2 == 0)
			{
				evenNumbers.add(number);
			}
		}
		return evenNumbers;
	}

}

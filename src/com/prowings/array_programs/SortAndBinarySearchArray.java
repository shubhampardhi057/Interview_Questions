package com.prowings.array_programs;

import java.util.Arrays;

public class SortAndBinarySearchArray {
	
	public static void main(String[] args) {
		
		int [] numbers = {20,30,40,100,10,50,60};
		
		Arrays.sort(numbers);
		
		System.out.println("Sorted Array is : "+Arrays.toString(numbers));
		
		char [] char1 = {'a','b','c','d','f','e'};
		
		System.out.println("Binary Searched Element is : "+Arrays.binarySearch(char1,0,5,'b'));
	}

}

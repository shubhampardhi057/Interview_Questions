package com.prowings.array_programs;

import java.util.Arrays;

public class AddElementInArrayUsingLoop {
	
	public static void main(String[] args) {
		
		int [] numbers1 = {25,14,56,15,36,56,77,18,29,49};
		
		int index = 2;
		
		int add = 40;
		
		System.out.println("Before Adding Element : "+ Arrays.toString(numbers1));
		
		for(int i=numbers1.length-1;i>index;i--)
		{
			numbers1[i] = numbers1[i-1];
		}
		numbers1[index] = add;
		
		System.out.println("After Adding Element : "+Arrays.toString(numbers1));
	}

}

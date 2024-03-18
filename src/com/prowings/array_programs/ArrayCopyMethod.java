package com.prowings.array_programs;

import java.util.Arrays;

public class ArrayCopyMethod {
	
	public static void main(String[] args) {
		
		int [] numbers = new int[4];
		
		Arrays.fill(numbers, 1);
		
		System.out.println(Arrays.toString(numbers));
		
		char [] chars = {'a','v','s','e','r'};
		char [] chars1 = {'a','v','s','e','r'};
		
		System.out.println(Arrays.equals(chars,chars1));
		
		
		long [] long1 = {10,20,30,40,50};
		long [] long2 = Arrays.copyOf(long1,long1.length);
		
		System.out.println(Arrays.toString(long2));
		
		System.out.println(Arrays.equals(long1,long2));
		
		System.out.println(long1 == long2);
	}

}

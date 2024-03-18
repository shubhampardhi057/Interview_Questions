package com.prowings.array_programs;

import java.util.Arrays;

public class ArraysCopyOfRangeMethod {

	public static void main(String[] args) {
		
		int [] num = {10,20,30,40,50,60,70,80,90,100};
		
		int [] num1 = Arrays.copyOfRange(num,0,10);
		
		System.out.println(Arrays.toString(num1));
		
		System.out.println(num == num1);
		
		System.out.println("============================================================");
		
		
		int [] numbers = {10,20,30,40,50};
		long [] numbers1 = {10,20,30,40,50};
		float [] numbers2 = {10,20,30,40,50};
		double [] numbers3 = {10,20,30,40,50};
		Integer [] numbers4 = {10,20,30,40,50};
		String [] numbers5 = {"hello","hii","Aa"};
		
		System.out.println(numbers.getClass().getName());
		System.out.println(numbers1.getClass().getName());
		System.out.println(numbers2.getClass().getName());
		System.out.println(numbers3.getClass().getName());
		System.out.println(numbers4.getClass().getName());
		System.out.println(numbers5.getClass().getName());
		
	}
}

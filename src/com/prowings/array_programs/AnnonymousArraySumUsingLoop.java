package com.prowings.array_programs;

public class AnnonymousArraySumUsingLoop {
	
	public static void main(String[] args) {
		
		sumArray(new int [] {1,2,3,4,5});
	}

	private static void sumArray(int[] num) {
		
		int total = 0;
		
		for(int i : num)
		{
			total = total+i;
		}
		
		System.out.println("Sum is : "+ total);
		
	}

}

package com.prowings.string_programs;

public class FindMissingNumber {

	public static void main(String[] args) {
		
		int [] inputArray = {1,2,3,4,6,7,8,9,10};
		
		boolean [] tempArray = new boolean[10];
		
		for(int i=0;i<inputArray.length;i++)
		{
			tempArray[inputArray[i]-1]=true;
		
		}
		for(int i=0;i<tempArray.length;i++)
		{
			if(!tempArray[i])
			{
				System.out.println("Missing Number := "+ (i+1));
			}
		}
	}
}

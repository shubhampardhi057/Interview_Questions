package com.prowings.array_programs;

public class LargestNumberInArray {
	
	public static void main(String[] args) {
		
		int [] a = {25,30,50,75,100};
		
		int max = a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
		}
		
		System.out.println(max);
	}

}

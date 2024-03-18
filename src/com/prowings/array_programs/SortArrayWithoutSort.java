package com.prowings.array_programs;

import java.util.Arrays;

public class SortArrayWithoutSort {
	
	public static void main(String[] args) {
		
		int [] num = {10,2,3,9,1,7,4};
		
		int [] sortedArray = sortArray(num);
		
		System.out.println(Arrays.toString(sortedArray));
	}

	private static int[] sortArray(int[] num) {
		
		int temp = 0;
		
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i] > num[j])
				{
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		return num;
	}

}

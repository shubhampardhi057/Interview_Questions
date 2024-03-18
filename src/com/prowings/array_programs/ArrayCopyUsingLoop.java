package com.prowings.array_programs;

import java.util.Arrays;

public class ArrayCopyUsingLoop {
	
	public static void main(String[] args) {
		
		int [] num1 = {10,20,30,40,50,60};
		
		int [] result = copyGivenArray(num1);
		
		System.out.println(Arrays.toString(result));
	}

	private static int[] copyGivenArray(int[] num1) {
		
		int [] inputCopy = new int[num1.length] ;
		
		for(int i=0;i<num1.length;i++)
		{
			inputCopy[i] = num1[i];
		}
		return inputCopy;
		
	}

}

package com.prowings.array_programs;

import java.util.Arrays;

public class ConcatTwoArray {
	
	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5,6,7,8,9,10};
		int [] b = {5,4,3,2,1};
		
		
		int array1 = a.length;
		int array2 = b.length;
		
		int [] result = new int[array1 + array2];
	
		System.arraycopy(a, 0, result, 0, array1);
		System.arraycopy(b, 0, result, array1, array2);
		
		System.out.println(Arrays.toString(result));
	}

}

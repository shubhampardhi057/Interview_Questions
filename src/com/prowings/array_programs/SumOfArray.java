package com.prowings.array_programs;

public class SumOfArray {
	
	public static void main(String[] args) {
		
		int [] number = {90,20,10,45,21,57,33,4,634,24,13,49};
		
		int sum = 0;
		
		for(int n : number)
		{
			sum += n;
		}
		
		System.out.println("Sum:= "+ sum);
	}

}

package com.prowings.array_programs;

public class EqualityOfTwoArray {
	
	public static void main(String[] args) {
		
		int [] number1 = {10,20,30,40,50};
		int [] number2 = {10,30,20,40,50};
		int [] number3 = {10,20,30,40,50};
		
//		checkEquality(number1,number2);
		checkEquality(number1,number3);
	}

	private static void checkEquality(int[] number1, int[] number2) {
		
		boolean equalOrNot = true;
		
		if(number1.length == number2.length)
		{
			for(int i=0;i<number1.length;i++)
			{
				if(number1[i] != number2[i])
				{
					equalOrNot = false;
				}
			}
		}
		else
		{
			equalOrNot = false;
		}
		
		if(equalOrNot)
		{
			System.out.println("Two Array are Equals!");
		}
		else
		{
			System.out.println("Two Array are Not Equals!");
		}
		
	}

}

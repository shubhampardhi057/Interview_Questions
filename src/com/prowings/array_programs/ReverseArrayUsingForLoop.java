package com.prowings.array_programs;

public class ReverseArrayUsingForLoop {
	
	public static void main(String[] args) {
		
		int [] num = {10,20,30,40,50};
		
		for(int i=num.length-1;i>=0;i--)
		{
			System.out.print(num[i]+" ");
		}
	}

}

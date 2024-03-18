package com.prowings.string_programs;

public class StringReverseUsingForLoop {
	
	public static void main(String[] args) {
		
		String input = "shubhampardhi";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			System.out.print(input.charAt(i)+" ");
		}
		
		System.out.println("======================================");
		
		char[] chars = input.toCharArray();
		char[] result = new char[chars.length];
		
		int j=0;
		
		for(int i=chars.length-1;i>=0;i--)
		{
			result[j] = chars[i];
			j++;
		}
		System.out.println(new String(result));
	}

}

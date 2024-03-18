package com.prowings.string_programs;

public class StringReverseUsingMethod {

	public static void main(String[] args) {
		
		String input ="shubhampardhi";
		
		StringBuffer sb = new StringBuffer(input);
		
		StringBuffer reversedString = sb.reverse();
		
		String result = new String(reversedString);
		
		System.out.println(result);
	}
}

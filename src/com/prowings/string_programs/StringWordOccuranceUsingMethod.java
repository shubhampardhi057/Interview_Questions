package com.prowings.string_programs;

import java.util.Arrays;

public class StringWordOccuranceUsingMethod {
	
	public static void main(String[] args) {
		
		String line = "india is my country india have 27 states";
		
		String [] words = line.split(" ");
		
		System.out.println("Total number of chars :"+ words.length);
		
		String  lineWithoutSpace = line.replace(" ","");
		
		System.out.println("Total number of chars :"+ lineWithoutSpace.length());
		
		char [] characters = line.toCharArray();
		
		System.out.println(Arrays.toString(characters));
	}

}

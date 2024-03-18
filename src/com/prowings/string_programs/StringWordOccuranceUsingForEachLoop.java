package com.prowings.string_programs;

import java.util.Arrays;

public class StringWordOccuranceUsingForEachLoop {
	
	public static void main(String[] args) {
		
		String line = "India is my country,india have 27 states";
		
		String lineWithoutSpace = line.replace(" ","");
		
		String [] words = line.split(" ");
		
		char [] character = new char[lineWithoutSpace.length()];
		
		int i = 0;
		
		for(String word : words)
		{
			System.arraycopy(word.toCharArray(),0, character, i,word.length());
			
			i+=word.length();
			
		}
		System.out.println(Arrays.toString(character));
	}

}

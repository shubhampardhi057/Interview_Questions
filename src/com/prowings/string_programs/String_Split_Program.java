package com.prowings.string_programs;

public class String_Split_Program {
	
	public static void main(String[] args) {
		
		String s = "hello java developer welcome to java world";
		
		String [] words = s.split(" ");
		
		for(String word:words)
		{
			System.out.println(word);
		}
		
		String s1 = "Hello";
		
		char[] characters = s1.toCharArray();
		
		for(char character : characters)
		{
			System.out.println(character);
		}
	}

}

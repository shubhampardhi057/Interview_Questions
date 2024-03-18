package com.prowings.string_programs;

import java.util.Arrays;

public class StringAnagram2 {
	
	public static void main(String[] args) {
		
		String s1 = "Listen";
		String s2 = "Silent";
		
		String res = isAnagram(s1,s2)?"Given string are Anagram":"Not Anagram";
		
		System.out.println(res);
	}

	private static boolean isAnagram(String s1, String s2) {
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1 != null && s2 != null)
		{
			if(s1.length() == s2.length())
			{
				char[] s1Chars = s1.toCharArray();
				char[] s2Chars = s2.toCharArray();
				
				Arrays.sort(s1Chars);
				Arrays.sort(s2Chars);
				
				if(Arrays.equals(s1Chars,s2Chars))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
		}
		return false;
	}

}

package com.prowings.string_programs;

import java.util.Arrays;

public class StringAnagram {
	
	public static void main(String[] args) {
		
		String s1 = "Race";
		String s2 = "Care";
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length() == s2.length())
		{
			char [] charArray1 = s1.toCharArray();
			char [] charArray2 = s2.toCharArray();
			
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			boolean result = Arrays.equals(charArray1,charArray2);
			
			if(result)
			{
				System.out.println(s1+" and "+s2+" are Anagram .");
			}
			else
			{
				System.out.println(s1+" and "+s2+" are not Anagram .");	
			}
		}
	}

}

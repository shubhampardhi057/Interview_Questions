package com.prowings.string_programs;

public class StringPallindrome {
	
	public static void main(String[] args) {
		
		Integer num = 1221;
		
		String s1 = String.valueOf(num);
		
		System.out.println(s1);
		
		System.out.println(s1.equals("1221"));
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.print(s1.charAt(i));
		}
		
		
		String input = "RADAR";
		
		StringBuffer sb = new StringBuffer(input);
		
		sb.reverse();
		
		String reversedString = new String(sb);
		
		boolean result=input.equalsIgnoreCase(reversedString)?true:false;
		
		System.out.println(result);
		
	}

}

package com.prowings.string_programs;

public class StringWordOccuranceUsingForLoop {
	
	public static void main(String[] args) {
		
		String line = "india is my country india have 27 states";
		
		String [] words = line.split(" ");
		
		int wordCount = 0;
		
		for(int i=0;i<words.length;i++)
		{
			for(int j=0;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					if(i==4)
					{
						continue;
					}
					wordCount++;
				}
			}
			
			System.out.println("# := "+ words[i]+"  - Occured := "+ wordCount+" times");
			wordCount=0;
		}
	}

}

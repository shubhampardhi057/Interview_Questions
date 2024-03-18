package com.prowings.string_programs;

public class PrintAlphabet {
	
	public static void main(String[] args) {
		
		char c;
		
		for(c='A';c<='Z';c++)
		{
			System.out.print(c + " ");
		}
		
		System.out.println("===================================================");
		
		char c1;
		
		for(c1='Z';c1>='A';--c1)
		{
			System.out.print(c1 + " ");
		}
	}

}

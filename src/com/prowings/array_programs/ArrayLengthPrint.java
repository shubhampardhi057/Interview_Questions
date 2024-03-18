package com.prowings.array_programs;

public class ArrayLengthPrint {
	
	public static void main(String[] args) {
		
		Object [] obj = {10,"hello",10.0f,'a',true,"hii"};
		
		System.out.println("Length of Array : "+obj.length);
		
		
		System.out.println(obj[0].getClass().getName());
		System.out.println(obj[1].getClass().getName());
		System.out.println(obj[2].getClass().getName());
		System.out.println(obj[3].getClass().getName());
		System.out.println(obj[4].getClass().getName());
		System.out.println(obj[5].getClass().getName());
		
		System.out.println("Elemnts Of String : ");
		
		
		for(int i=0;i<obj.length;i++)
		{
			if(obj[i] instanceof String)
			{
				System.out.println(obj[i]);
			}
		}
	}

}

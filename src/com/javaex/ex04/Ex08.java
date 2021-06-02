package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
		
		int iNum = 1;
		
		while ( true ) 
		{
			if (iNum % 6 == 0 && iNum % 14 == 0 ) 
			{
				System.out.println(iNum);
				break;
			}
			iNum ++;
		}
		

	}

}

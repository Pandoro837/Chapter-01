package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자 : ");
		int iNum = sc.nextInt();
		
		if (iNum > 0) 
		{
			if (iNum %2 == 0) 
			{
				System.out.println("짝수 입니다.");
			}
			
			else 
			{
				System.out.println("홀수 입니다.");
			}
			
		}
		
		else if (iNum == 0) 
		{
			System.out.println("0 입니다.");
		}
		
		else 
		{
			System.out.println("음수 입니다.");
		}
		
		sc.close();
		 
	}
}

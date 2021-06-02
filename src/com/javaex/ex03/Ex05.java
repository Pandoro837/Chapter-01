package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시간을 입력하세요.");
		System.out.print("시간 : ");
		
		int iTime = sc.nextInt();
		int iPay = iTime * 10000;
		
		if (iTime >= 0) 
		{
			
			if (iTime > 8) 
			{
				iPay = 80000 + (int) ((iTime - 8) * 10000 * 1.5);
	            System.out.println("임금은 " + iPay + "원 입니다.");
			} 
			
			else
			{
				System.out.println("임금은 " + iPay + "원 입니다.");		
			}
		
		}
		
		sc.close();

	}
}
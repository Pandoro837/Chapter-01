package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int iPoint = sc.nextInt();
		
		if (iPoint >= 60) 
		{
			if (iPoint < 70) 
			{
				System.out.println("D등급");
			}
			
			else if (iPoint < 80) 
			{
				System.out.println("C등급");
			}
			
			else if (iPoint < 90) 
			{
				System.out.println("B등급");
			}
			
			else 
			{
				System.out.println("A등급");
			}
			
		}
		
		else 
		{
			System.out.println("F등급");
		}
		
//		논리연산자를 활용한 해법
//		if(iPoint>=90) {		 
//			System.out.println("A등급");
//		} else if( 90> iPoint && iPoint >= 80) {
//			System.out.println("B등급");
//		} else if( 80> iPoint && iPoint >= 70) {
//			System.out.println("C등급");
//		} else if( 70> iPoint && iPoint >= 60) {
//			System.out.println("D등급");
//		} else {
//			System.out.println("F등급");
//		}
		
		sc.close();
		
	}
	
}

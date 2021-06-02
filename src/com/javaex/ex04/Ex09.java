package com.javaex.ex04;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("숫자를 입력하세요.");
			int iNum = sc.nextInt();
			
			if (iNum == 0) {
				
				System.out.println("종료합니다.");
				break;
				
			} else {
				 
				if (iNum % 3 == 0) {
		
					System.out.println(iNum + "은 3의 배수입니다.");
					
				} else {
					
					System.out.println(iNum + "은 3의 배수가 아닙니다.");
				
				}
			}
			
		}
		
		
		sc.close();
		
	}
	
}

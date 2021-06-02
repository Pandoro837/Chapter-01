package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		int iNum, iSum = 0 ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.[0이면 종료]");
		
		do {
			iNum  = sc.nextInt();
			iSum = iSum + iNum;
			System.out.println("합계 : " + iSum);
		
		} while(iNum != 0);
		
		System.out.println("종료");
		
		sc.close();

	}

}

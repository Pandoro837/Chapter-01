package com.javaex.ex04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		int iNum;
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("단을 입력해주세요.");
		System.out.print("단 : ");
		iNum = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			
			System.out.println(iNum + " * " + i + " = " + (iNum * i));
			
		}
			
		
		
		sc.close();
		
	}

}

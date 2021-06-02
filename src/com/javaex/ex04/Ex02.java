package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
	
		int i = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해주세요.");
		
		System.out.print("단 : ");
		int iNum = sc.nextInt();
		
		while(i < 10) {
			System.out.println(iNum + " * " + i + " = " + (iNum * i));
			i++;
		}
			
		
		sc.close();
		
	}
	
}

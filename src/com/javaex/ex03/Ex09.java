package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목을 선택하세요");
		System.out.println("(1. 자바 2.C 3.C++ 4.파이썬)");
		System.out.print("과목 번호 : ");
		int iNum = sc.nextInt();
		
	
		
		
//		String code = sc.nextLine(); 
//		== 비교연산자는 기본자료형 8가지에만 사용이 가능하다
//		String ==은 안된다
//		
//		if( code == "A" ) {
//			System.out.println("R101호");
//		}else if( code == "B" ){
//			System.out.println("R202호");
//		}else if( code == "C" ){
//			System.out.println("R303호");
//		}else if( code == "D" ){
//			System.out.println("R404호");
//		}else {
//			System.out.println("상담원에게 문의하세요");
//		}
		
		if (iNum == 1) {
			System.out.println("R101호");
		}
		else if (iNum == 2) {
			System.out.println("R202호");
		}
		else if (iNum == 3) {
			System.out.println("R303호");
		}
		else if (iNum == 4) {
			System.out.println("R404호");
		} else {
			System.out.println("상담원에게 문의하세요");
		}
		
		sc.close();
	
	}
	
}

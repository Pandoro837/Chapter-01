package com.javaex.ex02;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름:");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이:");
		int age = sc.nextInt();
		
		System.out.println("키를 입력해주세요");
		System.out.print("키:");
		float height = sc.nextFloat();
//		float height = sc.nextDouble();	
//		더블 값을 플롯에 담을 수 없으므로 오류가 난다 
//		(메모리의 크기가 다름)
//		double height = sc.nextFloat(); 
//		플롯 값은 더블에 담을 수 있으므로 상관은 없다
//		하지만 굳이 양쪽의 자료형을 다르게 표기할 이유가 없으므로
//		같은 자료형을 사용하는 것이 좋다
		
		System.out.println 
		(
			"당신의 이름은" + name +
			", 나이는" + age + "살 이고, 키는" + height + 
			"cm 입니다"
		);
		
		sc.close();
	}
	
}

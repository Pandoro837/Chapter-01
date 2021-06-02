package com.javaex.ex01;

public class Ex05 {

	public static void main(String[]args) {
		
//		일반적인 방식
		
		double pi = 3.14;
		double result01 = 5*5*pi;
		
		System.out.println(result01);
		
//		pi는 항상 3.14로 사용해야 한다 -->변경되었음
		
		pi = 3.1415926;
		double result02 = 5*5*pi;
		System.out.println(result02);
		
//		상수로 정의할 경우
		
		final double PI = 3.14;
		double result03 = 5*5*PI;
		
		System.out.println(result03);
		
//		PI = 3.1415926 ; final이 지정된 값을 바꾸려고 하면 실행이 안된다
		double result05 = 5*5*PI;
		System.out.println(result05);
		
		
	}
}

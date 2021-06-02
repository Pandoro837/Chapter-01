package com.javaex.ex01;

public class Ex08 
{
	public static void main(String[] args) 
	{
//		대입 연산자
		
		int a = 7;
		int b= 2;
		
		System.out.println(a);
		System.out.println(b);
		
//		산술 연산자
		
		System.out.println("산술 연산자 ------------------");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		
		System.out.println(a/b); //몫
		System.out.println(a%b); //나머지
		
//		산술 연산자 / % 
		
		System.out.println("산술연산자 /% 자세히 ---------------");
		System.out.println(7.0 / 2.0);
		System.out.println(7.0 % 2.0);
		
//		부호 연산자 +, -
		
		System.out.println("부호연산자 /% 자세히 ---------------");
		int var = -3;
		int pVar = +var;
		int mVar = -var;
		var = -var;
		
		System.out.println(var);
		System.out.println(pVar);
		System.out.println(mVar);
		
//		증감 연산자
		
		System.out.println("증감연산자 -------------------------앞");
		System.out.println(a); // a=7
		System.out.println(++a);
		System.out.println(a); // a=8 증감 연산자 이후의 값은 변화하여 저장된다
		
		System.out.println(b); //b=2
		System.out.println(--b); 
		System.out.println(b); //b=1
		
		System.out.println("증감연산자 -------------------------뒤");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a++);
		System.out.println(b--);
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("---------------------------------");
		
		int num = 5;
		System.out.println(num); // num = 5
		
		System.out.println(++num); //num = 6, 출력
		System.out.println(num++); // 출력 , ++ , num = 7 이지만 확인이 안됨
		System.out.println(num); // num=7이 출력
		
		System.out.println(num++*10-7); // 7 * 10 - 7 이후 7>8
	}
}

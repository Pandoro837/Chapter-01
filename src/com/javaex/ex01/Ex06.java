package com.javaex.ex01;

public class Ex06 {

	public static void main(String[] args) {
		
		
		//자동형변환 규칙을 알아야 자료형을 결정할 수 있다
		
		System.out.println(2+3.5);
		double var01 = 2 + 3.5; //자료형을 알아야한다
		System.out.println(var01);
	
//		자동 형변환 2 (long + float)
		long var02 = 1234567L;
		float var03 = 1.1F;
		
		System.out.println(var02+var03); //test--> 실수 값이 나온다
		
		float result = var02 + var03; //long->float 자동변환
		System.out.println(result);
	
		System.out.println("------------------------------");
		
//		강제 형변환
		
		int var04 = (int)3.14;
		System.out.println(var04);
	
//		확대변환
		
		byte var05 = 10;
		int result02 = (int) var05; //강제변환 byte->int
		System.out.println(result02);
		
//		축소변환
		int var06 = 10;
		int result03 = (byte)var06;
		System.out.println(result03);
		
//		축소변환 비교
		int var07 = 1030222;
		byte result04 = (byte)var07;
		System.out.println(result04); 	//출력되는 값, 이유 확인
//		bit가 줄면서 앞에서부터 날려버리고 남은 부분만 표기하다보니 값이 틀어진다
		
//		실수 ->정수 강제 형변환 실수의 소숫점을 강제로 날림
		double var08 = 1425.57234;
		int result05 = (int)var08;
		
		System.out.println(result05);
	
//		정수 > 실수 강제 형변환 정수를 실수형으로 저장 ~.0으로 표현
		
		int var09 = 1234567;
		double result06 = (double)var09;
		
		System.out.println(result06);
		
	}

}

package com.javaex.ex05;
//javac --> Ex10.java > Ex10.class
//java --> Ex10.class

//java -version
public class Ex10 {

	public static void main(String[] args) {
		
		char[] arrayC = new char[3];
		arrayC[0] = '정';
		arrayC[1] = '이';
		arrayC[2] = '유';
		
		for(int i = 0; i < arrayC.length; i++) {
			System.out.println(arrayC[i]);
		}
		
		String[] arrayS = new String[3];
		arrayS[0] = "정우성";
		arrayS[1] = "이효리";
		arrayS[2] = "유재석";

		for(int i = 0; i < arrayS.length; i++) {
			System.out.println(arrayS[i]);
		}
	}

}

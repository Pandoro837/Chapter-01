package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {

		int iNumlst [] = new int[3]; 
		
		iNumlst[0] = 1;
		iNumlst[1] = 2;
//		iNumlst[2] = 3; - 값이 존재하지 않는 방의 경우, 정수형은 0으로 초기화됨
		
		System.out.println("===================");
		System.out.println(iNumlst.length);
		System.out.println("===================");

		for(int i = 0; i < iNumlst.length; i++) {
			System.out.println(iNumlst[i]);
		}
		System.out.println("===================");

		// 존재하지 않는 방을 사용하려고 할 때
		for(int i = 0; i <= iNumlst.length; i++) {
			System.out.println(iNumlst[i]);
		}
	}

}

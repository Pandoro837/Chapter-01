package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		// 세부 문법
		
//		int iNumlst[] = new int[3];
//
//		iNumlst[0] = 1;
//		iNumlst[1] = 2;
//		iNumlst[2] = 3;
//		int iNumlst [] = new int[] {1, 2, 3}; //배열의 크기를 정해주지 않아야 함
											//값이 추가될 때마다, 배열의 크기가 커짐
//		int iNumlst [] = new int[3]{1, 2, 3}; - 안됨
		
		int[] iNumlst = {1, 2, 3}; //가능은 하나 익숙해지기 전에는 추천하진 않음
		
		for(int i = 0; i < iNumlst.length; i++) {
			System.out.println(iNumlst[i]);
		}
	}

}

package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {
		
		int[] iNumlst = new int[6]; //배열의 대괄호 안의 값은 방의 갯수
		
		/*
		iNumlst[0] = (int)(Math.random()*45)+1;
		iNumlst[1] = (int)(Math.random()*45)+1;
		iNumlst[2] = (int)(Math.random()*45)+1;
		iNumlst[3] = (int)(Math.random()*45)+1;
		iNumlst[4] = (int)(Math.random()*45)+1;
		iNumlst[5] = (int)(Math.random()*45)+1;
		*/
		
		/*
		System.out.println(iNumlst[0]);
		System.out.println(iNumlst[1]);
		System.out.println(iNumlst[2]);
		System.out.println(iNumlst[3]);
		System.out.println(iNumlst[4]);
		System.out.println(iNumlst[5]);
		*/
		
		for(int i = 0; i <=5; i++) {
			iNumlst[i] = (int)(Math.random()*45)+1;
			System.out.println(iNumlst[i]);
		}
		
		System.out.println(iNumlst[6]); 
		//문법상의 오류는 없지만, 배열의 범위를 벗어난 값을 출력하려고 할 경우
		//없는 값을 출력할 수 없기에 실행되지 않는다
		
	}

}

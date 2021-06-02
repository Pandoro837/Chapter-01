package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {

		int[] iNumlst = new int[6]; //갯수 6 - > 8

		
		
		for(int i = 0; i < iNumlst.length; i++) {
			iNumlst[i] = (int)(Math.random()*45)+1;
		}
		
		for(int i = 0; i < iNumlst.length; i++) {
			System.out.println(iNumlst[i]);	
		}
		
		System.out.println(iNumlst.length);
	}

}

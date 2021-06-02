package com.javaex.ex05;

public class Ex07 {

	public static void main(String[] args) {

		int[] iArraya = new int[3];
		iArraya[0] = 3; 
		iArraya[1] = 6; 
		iArraya[2] = 9; 
		
		for(int i = 0; i < iArraya.length; i++) {
			System.out.println(iArraya[i]);
		}
		
		System.out.println("=================");
		
		int[] iArrayb = iArraya;
		
		for(int i = 0; i < iArrayb.length; i++) {
			System.out.println(iArrayb[i]);
		}

		System.out.println("=================");

		iArraya[1] = 100;
		
		for(int i = 0; i < iArraya.length; i++) {
			System.out.println(iArraya[i]);
		}
		
		System.out.println("=================");
		
		for(int i = 0; i < iArrayb.length; i++) {
			System.out.println(iArrayb[i]);
		}
		
	}

}

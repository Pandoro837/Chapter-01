package com.javaex.ex05;

public class Ex08 {

	public static void main(String[] args) {
		
		int[] iarrA = new int[3];
		iarrA[0] = 3;
		iarrA[1] = 6;
		iarrA[2] = 9;
		
		for(int i = 0; i < iarrA.length; i++) {
			System.out.println(iarrA[i]);
		}

		System.out.println("====================");
		
		int[] iarrB = new int[3];
		
		for(int i = 0; i < iarrA.length; i++) {
			iarrB[i] = iarrA[i];
		}
		
		for(int i = 0; i < iarrA.length; i++) {
		System.out.println(iarrA[i]);
		}
		
		System.out.println("====================");
		
		for(int i = 0; i < iarrB.length; i++) {
			System.out.println(iarrB[i]);
		}
		
		System.out.println("====================");
		
		iarrA[1] = 100;
		
		for(int i = 0; i < iarrA.length; i++) {
			System.out.println(iarrA[i]);
		}
		
		System.out.println("====================");
		
		for(int i = 0; i < iarrB.length; i++) {
			System.out.println(iarrB[i]);
		}
		
	}

}

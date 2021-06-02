package com.javaex.ex05;

public class Ex09 {

	public static void main(String[] args) {
		// 배열 같음 판단
		
		int[] arrA = new int[3];
		arrA[0] = 50;
		arrA[1] = 20;
		arrA[2] = 30;
		
		int[] arrB = new int[3];
		arrB[0] = 20;
		arrB[1] = 30;
		arrB[2] = 10;
		
		//배열 A와 배열 B가 같은지 판단 
		//-> 배열의 개수가 같고, 값과 순서가 같아야 한다
		
		//개수 비교
		if(arrA.length == arrB.length) {
			for(int i = 0; i < arrA.length; i++) {
				if(arrA[i] != arrB[i]) {
					System.out.println(i + "번 방의 값이 다릅니다. " + arrA[i] + " / " + arrB[i]);
				}
			}
		} else {
			System.out.println("배열의 크기가 다릅니다.");
		}

	}

}

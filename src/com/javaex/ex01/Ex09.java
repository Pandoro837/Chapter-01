package com.javaex.ex01;

public class Ex09 {
	public static void main(String[] args) {
		
		// 관계 연산자 --> 결과는 true or false --> boolean 형이다
		
		int n01 = 5;
		int n02 = 3;
		int n03 = 5;
//		int n04 = 3;

		System.out.println(n01<n02); // 5<3 false
		System.out.println(n01>n02); // 5>3 true
		System.out.println(n01<=n02); // 5<=3 false
		System.out.println(n01<=n03); // 5<=5 true
		System.out.println(n01>=n02); // 5>=3 true
		System.out.println(n01>=n03); // 5>=5 true
		
		System.out.println(n01==n02); // 5==3 false
//		System.out.println(n01=n02); // n01에 3을 대입하여 3값이 나온다
//		System.out.println(n01); //n01 값이 3으로 변경되었기 때문에 3이 나온다
		System.out.println(n01!=n02); // 5!=3 true
		
	}
}

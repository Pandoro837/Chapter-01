package com.javaex.ex01;

public class Ex10 {

	public static void main(String[] args) {
		
		//논리 연산자
		int a = 5;
		int b = 7;
		
		//논리 연산자 기본 &&
		
		System.out.println("&&연산자=======================");

		System.out.println( true && true); //true
		System.out.println( true && false); //false
		System.out.println( false && true); //false
		System.out.println( false && false); //false
		
		//논리 연산자 기본 ||
		
		System.out.println("||연산자=======================");
		
		System.out.println( true || true); //true
		System.out.println( true || false); //true
		System.out.println( false || true); //true
		System.out.println( false || false); //false
		
		//논리 연산자 응용 
		
		System.out.println("논리 연산자 응용=======================");
		
		System.out.println((a>b) && (a<b)); // (5>7)=F && (5<7)=T = false 
		System.out.println((a>b) && (a>b)); // (5>7)=F && (5>7)=F = false
		System.out.println((a>b) || (a<b));	// (5>7)=F || (5<7)=T = true
		System.out.println((a>b) || (a<b) && (a<b)); // (5>7)=F || (5<7)=T = true && (5<7)= T = T && T = T
		System.out.println((a>b) && (a<b)||(a<b)); // (5>7)=F && (5<7)=T = false  ||(5<7)= T = F || T = T
		
		System.out.println((a>b) && (a<b) && (a<b)); // (5>7)=F && (5<7)=T = false && (5<7) = T = F && T =F
		System.out.println("!연산자=======================");
		System.out.println(a<b); // 5<7 = true
		System.out.println(!(a<b)); // !(5<7) 5<7 = true , ! true = false
		System.out.println( (a>b) && (a>b) ); // (5>7)=F && (5>7)=F = false
		System.out.println( !((a>b) && (a>b)) ); // (5>7)=F && (5>7)=F = false, !false = true
		
		System.out.println( (a>b) && !(a>b) ); // ((5>7)=F && !(5>7)=!F=T) = false
		System.out.println( !(a>b) && !(a>b) );	//(!(5>7)=!F=T && !(5>7)=!F=T) = true
	}

}

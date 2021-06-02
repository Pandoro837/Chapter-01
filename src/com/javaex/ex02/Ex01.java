package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {
		
		int i = 2345;
		double d = 3.14;
		String str = "굿모닝";
		char c = '한';
		String s = "한";
		
		String name = "최영교";

		
		System.out.println("안녕하세요");	//문자열 출력
		System.out.println(str);		//지정된 str의 값을 출력
		System.out.println("str");		//""안의 내용물을 문자열로 인식하여 출력
		System.out.println(i);		//지정된 i의 값을 출력
		System.out.println("i");		//""안의 값을 문자열로 인식하여 출력
		System.out.println('i');		//''안의 값을 문자로 인식하여 출력, 둘 이상의 문자는 인식x
		System.out.println("ii");
		
		System.out.println("안녕");
		System.out.print("하");
		System.out.println("");
		System.out.println("==================");
		
		System.out.println(i);
		System.out.println(i+i);
		
		System.out.println(str);
		System.out.println(str+str);	//두개의 문자열을 이어서 출력해준다
		
		System.out.println(str+i);		//문자열 + 숫자를 이어서 출력해준다
										//"굿모닝" + "2345" 이때, 숫자열은 문자열로써 출력된다
		System.out.println(str+d);		//"굿모닝" + "3.14" 숫자열은 문자열로써 출력된다
//		str 랑 i "굿모닝랑2345" 출력하고 싶을 때
		System.out.println(str+" 이랑 "+i+" 다 ");
		System.out.println(str+" "+i+"다");
		System.out.println(c);
		System.out.println(c+c); 		//캐릭터 형 + 캐릭터 형은 각자를 하나의 숫자열로 인식하여
										// 숫자로 출력된다
		System.out.println(s+s); 		
		System.out.println(c+s); 		
		
		//제 이름은 최영교 입니다.
		
		System.out.println("제 이름은 " + name + "입니다.");
		
		//안녕하세요
		System.out.println("안녕하세요");
		//안녕'하'세요
		System.out.println("안녕'하'세요");
		//안녕"하"세요
		System.out.println("안녕\"하\"세요");
		//안녕\하\세요
		System.out.println("안녕\\하\\세요");
		//안녕	하	세요
		System.out.println("안녕\t하\t세요");
		//안녕
		//하
		//세요
		System.out.println("안녕\n하\n세요");
	}
}

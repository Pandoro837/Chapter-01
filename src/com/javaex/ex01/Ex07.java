package com.javaex.ex01;

public class Ex07 {

	public static void main(String[] args) {
		
//		정수 간의 나눗셈 시, 나머지 값은 버려진다
        
        int num01 = 5; 
        int num02 = 4;
        System.out.println(num01/num02);
		
//      정수는 기본적으로 int로 저장된다 5/4 = int 5 / int 4
//		int5/4를 double로 형변환 한 것 뿐
		
		double v01 = 5/4; 
        System.out.println(v01);
     
// 		정수-실수의 계산 시, 한 쪽이 실수라면 값은 실수형으로 출력된다
        
        double v02 = (double)5 / 4 ;  
        System.out.println(v02); 
      
        double v03 = 5 / (double)4 ;  
        System.out.println(v03);     

        double v04 = (double)5 / (double)4 ;  
        System.out.println(v04);    

//		int/int = int 소숫점 이하 생략
        
        int v05 = (int)1.3 + (int)1.8 ;  
        System.out.println(v05);   

//		실수 값을 괄호로 묶어 먼저 계산하고, int로 강제 형변환을 하면 3으로 나온다
        int v06 = (int)(1.3 + 1.8) ;  
        System.out.println(v06);   
 

	}
}

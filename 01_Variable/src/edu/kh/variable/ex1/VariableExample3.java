package edu.kh.variable.ex1;

public class VariableExample3 {
	
	public static void main(String[] args) {
		
		// 형변환(Casting) : 값의 자료형을 변환하는 것 (단, boolean 제외)
		/*
		 * **형변환은 왜 필요한가?
		 * - 컴퓨터는 기본적으로 같은 자료형끼리만 연산이 가능함.
		 * 다른 자료형과 연산 시 오류 발생이 기본이다.
		 * --> 이런 상황을 해결하기 위해서 필요한 기술이 형변환이다.
		 * 
		 * 자동 형변환 / 강제 형변환 존재
		 * 
		 * 
		 * */
		
		int num1 =10;
		double num2 = 3.5;
		
		System.out.println("자동 형변환 결과 : " + ( num1 + num2 )); // 13.5
		// 원래 에러가 발생해야 하지만 
		//"자동 형변환"(자동으로 값의 범위가 작은 자료형을 값의 범위가 큰 자료형으로 변환) 덕분에 발생하지 않는다.
		
		// int -> long 형변환
		int i2 = 2_100_000_000; // 21억 세 자리수 마다 콤마 대신 언더바로 표현할 수 있다.
		long l2 = 10_000_000_000L; // 100억
		
		long result = i2 + l2;
		// 값의 범위가 더 적은 int 타입을 더 큰 long 타입으로 자동 형변환이 일어남.
		// long = long + long (가능!)
		
		System.out.println(result); // 12100000000
	
				
		// char -> int 자동 형변환이 가능하다.
		// cahr 자료형은 문자형이지만 실제 저장하는 값은
		// 0 부터 6만 5천번 사이에 있는 숫자(정수형)
		
		char ch3 = 'V'; // 유니코드 체계에서 V에 해당하는 정수값을 ch3에 대입
		int i3 = ch3; // 해당 정수값을 i3에 대입		
		System.out.println(i3); //86
		
		// 위 방법을 통해 '각' 이라는 글자가 숫자 몇인지 알아보자
		char ch4 = '각'; 
		int i4 = ch4;	
		System.out.println(i4); // 44033
		 
	} 

}

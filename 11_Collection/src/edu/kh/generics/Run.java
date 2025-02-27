package edu.kh.generics;

public class Run {
	public static void main(String[] args) {
		
	

	// String 타입으로 Box 객체 생성
	Box<String> stringBox = new Box<String>();
	// T가 String으로 대체됌
	// -> 필드도 String 타입.
	// getter/setter에서 사용되는 타입도 String 타입이 됌
	stringBox.setItem("안녕 제네릭?");
	//System.out.println( st)
	

	Box<Integer> intBox = new Box<Integer>();
	// JAva 7 버전 이상에서는 다이아몬드 연산자 덕분에 우변 타입 생략 가능
	// 다이아몬드 연산자 : 컴파일러가 좌변Box<Integer>을 보고
							// 우변의 타입을 추론
	
	intBox.setItem(123);
	//System.out.println(inBox.getItem);
	
	
	// 제네릭은 객체(Reference Type)만 허용
	// -> 제네릭은 기본자료형(primitive type)인 int, double, char 같은
	// 		타입은 사용할 수 없다
	// -> 대신 Wrapper 클래스를 사용
	/*
	 * byte Byte
	 * short Short
	 * int		Integer
	 * long 	Long
	 * float 	Float
	 * double 	Double
	 * char		Character
	 * boolean 	Boolean
	 * 
	 * */
	int num = 10;
	Integer num1 = num; // 오토박싱(Auto-Boxing)
						// : 기본자료형에서 -> 래퍼클래스로 자동변환
			
	int num2 = num1;	// 오토언박싱(Auto-unBoxing)
						// 래퍼클래스를 -> 기본자료형으로 자동변환
	
	
	int number = Integer.parseInt("100");	// 문자열로 변환
	
	
	
	
	
}
}
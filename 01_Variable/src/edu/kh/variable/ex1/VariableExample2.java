package edu.kh.variable.ex1;

public class VariableExample2 {

	public static void main(String[] args) {
		
		/*
		 * 자바의 기본 자료형 8가지
		 * 
		 * 논리형 : boolean (1byte)
		 * 정수형 : byte(1byte), short(2byte), int(4byte), long(8byte)
		 * 실수형 : float(4byte), double(8byte)
		 * 문자형 : char(2byte, 유니코드 문자체계를 따른다.)
		 * 
		 * 참조형 - 문자열 String 대문자로 시작
		 * */
		
		// 변수 선언: 메모리(RAM)에 값을 저장할 공간을 할당하는 것.
		// 변수 값 대입 : 변수에 값을 집어 넣는 것.
		
		boolean booleanData; // -> 변수의 선언
		// 해석: 메모리에 논리값(t/f)을 저장할 공간을 1byte 할당하고 
		// 할당된 공간의 이름을 booleamData 라고 정하겠다. 
		
		booleanData = true; // booleanData 변수에 true 논리값 집어넣기(대입)

		System.out.println("booleanData : " + booleanData);
		
		
		
		
		byte byteNumber = 127; // 128을 넣는 순간 에러( 1 byte의 값의 범위 : -128~127, 256가지)
		// 해석: 메모리에 정수값을 저장할 공간을 1byte 할당하고 
		// 이 할당된 공간을 byteNumber 라고 부르겠다. 
		// 그리고 선언된 byteNumber 공간에 처음으로(초기값) 127을 넣겠다.
		// --> 변수의 초기화 : 처음 변수에 값을 대입하는 것
		
		
		short shortNumber = 32767; // -32768~32767
		
		// 정수 자료형 기본형 int (short, byte는 옛날코드의 잔재일 뿐 거의 사용하지 않는다.)
		int intNuber = 2147483647; // -2147483648 ~ 2147483647
// int- 자료형(타입), intNumber- 변수명, (=)- 대입연산자,  리터럴;
		 // 프로그래밍에서 대입되는 데이터(값 자체)를 리터럴 이라는 단어로도 표현
		
		// ** 리터럴 : 변수에 대입되거나 작성되어지는 값 자체.
		// 자료형에 따라 리터럴 표기법이 다름.
		
		long longNumber = 10000000000L; // 대문자L 또는 소문자l
		// -> The literal 100000000 of type int is out of range
		// -> 100억이라는 값은 int의 범위를 벗어났다.
		// -> 정수형의 기본타입이 int이기 때문에 리터럴값 자체를 int로 인식하고 있다.
		// -> 뒤에 L을 붙여줌으로써 long 자료형인 것을 나타내줘야한다.
		
		float floatNumber = 1.2345f; // F 또는 f
		// 실수형의 기본 타입이 double이기 때문에 1.2345까지만 쓰면 double 자료형으로 인식하기 때문에
		// 변수 타입인 float와 일치하지 않아 Type mismatch 라는 에러가 발생한다.
		
		double doubleNumber = 3.141592;
		// 실수형의 기본형
		// 리터럴 표기법 없는 실수는 자동으로 double로 인식
		// D / d 를 쓸 수는 있다.
		
		// 문자형(char) 리터럴 표기법 : '' (홀따옴표)
		// -> 문자 딱 하나 ex) A, 가
		char ch = 'A';
		char ch2 = 66;
		
		System.out.println("ch : " + ch);
		System.out.println("ch2 : " + ch2);
		// 'A'라는 문자는 유니코드 체계의 65번 으로 지정되어있다.
		/*
		 * char 자료형에 숫자가 대입될 수 있는 이유!
		 * - 컴퓨터에는 문자표가 존재한다.
		 *   숫자에 따라 지정된 문자 모양이 각각 매핑되고
		 *   'B' 문자 그대로 대입되면 변수에 숫자 66으로 변환되어 저장
		 *   -> 반대로 생각하면 번수에 애초에 66이라는 숫자를 저장하는것도 가능함.
		 * */
		
		// 변수 명명 규칙
		
		// 1. 대소문자를 구분하고, 길이제한은 없다.
		int abcdefG123456789; // G
		int abcdefg123456789; // g
		// 대소문자를 구분하기 때문에 위 두 변수는 엄연히 다른 변수로 인식된다.
		
		// 2. 예약어(자료형, public, class 등등) 사용 불가
		// double final; double public; double class; -> 세 가지 모두 사용 불가
		
		// 3. 숫자 시작 X
		//char 1abc; -> 사용 불가
		char a1bc;
		
		// 4. 특수문자의 경우 $, _만 사용 가능(하지만 쓰지 않는다.)
		int $intNumber;	// 문제 없음
		int int_Number; // 자바는 카멜표기법을 사용한다.
		  				// _ 작성 표기법은 DB에서 사용한다.
						// 자바의 상수에서 사용
						// ex) MEMBER_NAME
		
		// 5. 카멜표기법(맨 처음 소문자 시작, 후속 단어 첫글자 대문자)
		char helloWorldAppleBananaTomato;
		
		// 6. 변수명은 언어를 가리지 않는다 (하지만 쓰지 않는다)
		int 정수1번;
		double 실수2번 = 3.14;
		System.out.println(실수2번);
		
		// -------------------------------
		
		final double PI_VALUE = 3.14;
		
		int num = 10;
		num = 20;  // 변수이므로 다른 값 재대입 가능
		
		// final num2 = 10;
		
		// PI_VALUE = 2.33; // 에러! 재대입 불가
		
		/* 
		 * 상수 (항상 같은 수)
		 * - 변수(메모리에 공간을 할당)의 한 종류
		 * - 한번 값이 대입되면 다른 값을 재대입 할 수 없음!
		 * - 사용하려면 자료형 앞에 final 키워드를 작성
		 * - 상숭 명명 규칙 : 모두 대문자로 작성, 여러 단어 작성 시 _(띄어쓰기의 의미) 사용
		 * 
		 * - 상수를 사용하는 경우
		 * 1) 변하면 안 되는 고정된 값을 저장할 때 ex) 파이
		 * 2) 특정한 값에 의미를 부여하는 경우
		 * 
		 * */
		 
		final int MIN_AGE = 1;
		final int MAX_NUM = 130;
		final int LEFT_MOVE = -1;
		final int RIGHT_MOVE = 1;
		
		System.out.println(1 + 1.3); 
		// 내부적으로 정수를 실수와 계산할 때 정수를 실수로 바꿔준 후 연산한다. 
		// => 자동 형변환이라고 한다.
	}
}

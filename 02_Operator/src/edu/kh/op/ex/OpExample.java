package edu.kh.op.ex;

import java.util.Scanner;

// 예제 코드 작성용 클래스(기능용/메서드용)
public class OpExample{
	
	// ex1() method : OpExample 이라는 클래스에 포함된 메서드가 된다.
	public void ex1() {

		// 증감(증가, 감소) 연산자 : ++ , --
		// 1을 더하거나 감소시키는 연산자
		
		int iNum1 = 10;
		int iNum2 = 10;
		
		iNum1++;
		iNum2--;
		
		System.out.println("iNum1 : " + iNum1);
		System.out.println("iNum2 : " + iNum2);
		
		// 전위 연산
		int temp1 = 5;
		
		System.out.println( ++temp1 + 5 ); // 11
						//  6   +   5 -> 11
		
		
		// 후위 연산 : 다른 연산을 다 끝내고 이루어진다.
		int temp2 = 3;
		
		System.out.println( temp2-- +2 );
			// 1.				3 + 2 -> 5  
			// 2. 보이지 않는 곳에서	후위 연산이 이루어진다.	3-- -> 2  따라서 temp2라는 변수에 2라는 값이 저장된다.
		System.out.println(temp2); //2
		
		int a = 3;
		int b = 5;
		int c = a ++ + --b;
		
		//		3++ + --5
		//		3++ + 	4 (b)
		//	c = 7
		//		3++ -> 4 (a)
		
		//최종적으로 a, b, c는 각각 얼마라고 출력될까?
		System.out.printf("%d / %d / %d\n", a, b, c); //8
					//      4 / 4 / 7
		System.out.println(temp1);
		System.out.println(temp2);
		
	}
	
	public void ex2() {
		
		// 비교 연산자 : > , < , >=, <=, ==, !=   // =위치가 헷갈릴 수 있는데 =는 오른쪽에 있음
		// 비교 연산자의 결과는 항상 논리값(true/false)
		
		int a = 10;
		int b = 20;
		
		System.out.println( (a == b) == false );
						//	(false) == false
						//	-> true
		
		int c = 4;
		int d = 5;
		
		System.out.println( (++c != d) == (--c != d) );
						//	( 5  != 5)  -> false
									  //  ( 5  != 20) -> true
						//	( false )  == ( true )
						// => false
		
		System.out.println(100 > 99);
		System.out.println(100 >= 100);
		System.out.println(99 < 64);
		System.out.println(99 <= 100);
		
		
		
		
		
	}
	
	public void ex3() {
				// 논리 연산자 : &&(AND)	 	||(OR)
		
		// &&(AND) : 둘 다 true면 true, 나머지는 false
		// ~와, 그리고, ~면서, ~부터, ~까지, ~사이
		
		int a = 101;
		// a는 100 이상이면서 짝수인가?
		System.out.println((a >= 100) && (a % 2 == 0) ); // false
		
		int b = 5;
		// b는 1부터 10까지의 숫자 범위에 포함되어 있는가?
		// 1~10 -> b는 1보다 크거나 같으면서, 10보다 작거나 같다
		
		System.out.println( (b>=1) && (b<=10) ); // true
		
		// ||(OR) : 둘 다 false면 false, 나머지 true
		// 또는, 혹은, ~거나
		
		int c = 10;
		
		// c는 10을 초과하거나 짝수인가?
		System.out.println( (c  > 10)  ||  (c % 2 == 0) ); // true
		
	}
	
	public void ex4() {
		// 삼항 연산자(조건에 따른 연산을 하는 연산자이다) : 	조건식 ? true일 때 수행될 값 : false일 때 수행될 값 
		// * 조건식 : 연산결과가 true/false인 식
		
		int num = 30;
		
		// num 이 30보다 크면(초과) "num은 30보다 큰 수이다"
		// 아니면 "num은 30 이하의 수이다" 출력
		
		String result = num > 30 ? "num은 30보다 큰 수이다" : "num은 30 이하의 수이다";
		
		System.out.println(result);
		
		// ---------------------------------
		
		// 입력받은 정수가 음수인지 양수인지 구분 => 입력받은: Scanner 생성
		//단, 0은 양수로 처리
		
		// ex)
		// 정수 입력 : 4
		// 양수 입니다.
		//--------------
		
		
		//정수 입력 : 15
		// 음수 입니다.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		
		int input = sc.nextInt();
		
		String result2 = input  >= 0 ? "양수 입니다." : "음수 입니다.";
		
		System.out.println(result2);
				
	
		
	}
	
	
	
	
	
	
}

package edu.kh.variable.ex2;

public class PrintExample {
	

	public static void main(String[] args)  {
		
		//system.out.println() : 한 줄 출력용 메서드 (출력 후 줄바꿈 수행 = 개행)
		System.out.println("테스트1");// 소괄호 ()안의 내용 출력 후 커서 한 칸 밑으로 내림.
		System.out.println("테스트2");
		
		
		// System.out.print(); : 단순 출력용 메서드 (출력 후 줄바꿈 안 해줌)
		System.out.print("테스트3");
		
		System.out.println(); // 내용 없는 pritnln() : 단순 줄바꿈만 수행한다.
		
		System.out.print("테스트4");
		
		// print와 println은 줄바꿈 여부의 차이점은 있지만 괄호안의 내용이 
		// 그대로 출력된다는 것은 똑같다.
		
		System.out.println(); // 바로 위에 print() 사용했으니 줄바꿈 해줌.
		
		int iNum1 = 10;
		int iNum2 =5;
		
		// 콘솔창에 10 + 5 = 15 그대로 출력하고 싶은 경우
		System.out.println( iNum1 + " + " + iNum2  + " = " + (iNum1 + iNum2)); // println 사용 시 상당히 불편하다.
		
		System.out.printf("%d + %d = %d\n", iNum1, iNum2, iNum1 + iNum2); // %d = 정수형 패턴
		// \ : 줄바꿈
		
		//이스케이프 문자(escape character) : 틀별한 의미를 갖도록 하는 용도로 사용
		// \n 역슬래시n은 이스케이프 문자에 속한다.
		
		// System.out.printf("패턴", 패턴자리에 각각 들어갈 값/변수를 나열);
		/*
		 *  %d : 정수형, 	%o : 8진수, 	%x : 16진수
		    %c : 문자,    	%s : 문자열
			%f : 실수(소수점 아래 6자리),	 %e : 지수형태표현, 	%g : 대입 값 그대로
			%A : 16진수 실수
			%b : 논리형
		 */
		
		// 10 + 10 + 5 / 2 = 35
		// System.out.printf("패턴1 + 패턴2 + 패턴3 / 패턴4 = 패턴5",  );
		System.out.printf("%d + %d + %d / 2 = %d\n", 
				iNum1, iNum1, iNum2, iNum1 +  iNum1 * iNum2 / 2 );
		
		// 패턴 연습
		int iNum3 = 3;
		
		System.out.printf("%d\n", iNum3);
		System.out.printf("%5d\n", iNum3);	// 5칸 공간 확보 후 오른쪽 정렬하고 싶을 시
		System.out.printf("%-5d\n", iNum3);	// 5칸 공간 확보 후 왼쪽 정렬하고 싶을 시
		
		// 소수점 자리 제어 (반오림 처리)
		System.out.printf("%f\n", 10 / 4.0); // 2.500000
		System.out.printf("%.2f\n", 10 / 4.0); // 2.50 (소수점 아래 둘째 자리까지표현)
		
		// 문자, 문자열, boolean
		boolean isTrue = false;
		char ch = '가';
		String str = "안녕하세요~!"; // 참조형(기본 자료형에 속하지 않음)
		
		// false / 가 / 안녕하세요~!  가 나오도록 printf 구문 사용해서 출력해보기
		System.out.printf("%b / %c / %s\n", isTrue, ch, str);
		
		//   \
		System.out.println("\\"); // 역슬래시 하나만 출력하고 싶은 경우 역슬래시를 두 개 적어야 함.
		
		//	\o/
		System.out.println("\\o/");
		
		//	\t : tab	(한공간씩 표현하는게 아니고 한번에 공간 차지)
		System.out.println("a\tb\tc\td");
		
		//유니코드 이스케이프
		System.out.println("\u0041"); // A
		// 유니코드(16진수)
		// 65를 16진수로 표현
		// 65 나누기 15 => 몫4, 나머지1
		
		System.out.print("건강한게 최고야\n");
		System.out.print("이불 밖은 위험해\n");
		
		System.out.printf("%5d\n", 10);
		System.out.printf("%3d\n", 10);
		System.out.printf("%-4d\n", 10);
		System.out.printf("%.2f\n",10.25789);

		System.out.print("건강한게 최고야");
		System.out.print("이불 밖은 위험해");
		
		System.out.println();

		// \n 사용해보기
		System.out.print("건강한게 최고야\n"); 
		System.out.print("이불 밖은 위험해\n");
		
		System.out.println();

		// \t 사용해보기
		System.out.println("a\tb\tc\td");

		System.out.println("\\"); // 역슬래시 하나만 출력하고 싶은 
							   	  // 경우 역슬래시를 두 개 적어야 함.
		                          
		System.out.println("\\o/");   
	}
}
package edu.kh.variable.ex1;

public class VariableExample4 {

	public static void main(String[] args) {
		
		/* 강제 형변환
		 * - 기존 자료형을 원하는 자료형으로 강제 변환 시키는 것
		 * 어떨 때 강제 형변환을 하는가?
		 * 1) 값의 범위가 큰 자료형을 값의 범위가 작은 자료형으로 변환할 때
		 * 2) 출력되는 데이터의 표기법을 변환시키고 싶을 때( int -> char)
		 * 
		 * * 강제 형변환 방법
		 * - 자료형을 변환시키고 싶은 값 또는 변수 앞에 (자료형)을 작성
		 * 
		 * */
		
		double temp = 3.14; // 
		int num = (int)temp;
		
		System.out.println("temp : " + temp); // 3. 14
		System.out.println("temp : " + num); 
// -> 실수형인 double에서 정수형인 int로 변환하여 소수점 아래자리 손실(데이터 손실) 발생
		
		// int -> byte 강제 형변환 시
		int iNum = 290;
		byte bNum = (byte)iNum;
		// 2진수로 표현했을 때 3byte 만큼의 범위가 손실됌. (수업 자료 참고)
		System.out.println(iNum); // 290
		System.out.println(bNum); // 34  
		
		// 같은 정수형끼리의 변환시에도 
		// 값의 범위 차이 때문에 데이터 손실이 발생할 수 있다.
		
		// char -> int 강제 형변환 시
		char ch = 'A';
		System.out.println( (int)ch ); // 65
		
		// int -> char 강제형변환 해보기
		// 44085에 매핑되어 있는 문자는 어떤 문자일까?
		int iNum3 = 44085;
		System.out.println( (char)iNum3 );	// 갵
		
		// 오버플로우 현상은 컴퓨터가 미리 예측할 수 없다.
		// -> 개발자가 미리 예측해야 함.
		int i6 = 2147483647;  // int형이 나타낼 수 있는 최대값 (-2,147,483,648 ~ 2,147,483,647)
		int result2 = i6 + 1; // 최대값에서 더 이상 더할 수 없으므로 
							  // 더한 값만큼 즉, 1만큼 역행하여 최소값이 나온다. 
							  // 만약 2를 더하면 2 만큼 역행하여 -2147483647이 출력된다. 
		
		System.out.println(result2); // -2147483648
		
	}

}

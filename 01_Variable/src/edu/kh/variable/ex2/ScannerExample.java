package edu.kh.variable.ex2;

import java.util.Scanner;

// import : 다른 패키지에 존재하는 클래스를 얻어오는 구문
// import java.util.Scanner; 	-> 해석 : java.utill 패키지에서 Scanner Class(설계도)를 수입해옴.

public class ScannerExample {
	
	public static void main(String[] args) {
		
		// Scanner : 프로그램 실행 중 키보드 입력을 받을 수 있게하는 역할
		// Scanner 객체 생성
		// -> 내 프로그램 안에 스캐너라는 기계를 새로 만드는 것
		Scanner sc = new Scanner(System.in);	
		// import 구문이 없으면 설계도가 없는 것과 같아서 기계를 만들 수 없음.
		// -> 오류 확인될 시 적절히 import 작성하여 오류 해결하면 됌.
		// 패키지의 위치를 모를 시 일단 먼저 생성자를 선언하고 오류(빨간줄)에 마우스 커서 갖다둬서 
		// 아래에 뜨는 박스에 import구문 클릭하면 자동으로 import 해줌
		
		System.out.print("정수 1 입력 : ");
		int input1 = sc.nextInt(); // nextInt: 스캐너의 기능 중 하나로, 정수를 입력받는 것을 의미한다.
		// 해석 : 스캐너를 통해 입력받은 정수를 input1이라는 변수에 대입
		
		// System.out.println(input1);
		
		System.out.print("정수 2 입력 : ");
		int input2 = sc. nextInt();
		
		System.out.printf("%d + %d = %d\n", input1, input2, input1 + input2 );
		
	}

}

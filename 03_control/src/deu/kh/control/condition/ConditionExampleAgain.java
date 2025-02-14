package deu.kh.control.condition;

import java.util.Scanner;

public class ConditionExampleAgain { // 기능 제공용 클래스

	// Scanne를 한 번만 생성하고 이 클래스에 속한 메서드가 
	// 해당 scanner를 사용할 수	있는 방법 -> 필드 영역에 생성한다
	Scanner sc = new Scanner(System.in);
	
	// 생성자 영역
	
	// 메서드 영역
	public void ex() {
		
		// if 문
		// 조건식이 true 일 때만 내부 코드 수행
		
		// 입력받은 정수가 양수인지 검사
		// 양수라면 "양수입니다" 출력
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input >0) {
			System.out.println("양수입니다");
		}
			
		if(input <= 0) {
			System.out.println("양수가 아니다");
		}
			
	}
}
		
			


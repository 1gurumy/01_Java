package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample { // 기능 제공용 클래스
	// 중괄호 열고 엔터 치면 자동으로 닫히는 블록이 생성됨. 지우지만 않으면 웬만하면 오류 안남

	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		// 1 ~ 10 까지 콘솔에 출력하기 => 반복문
		//i는 index의 약자로, for문에서는 i라는 변수를 자주 쓴다.
		for(int i = 1; i <= 10; i++) { 
			// 수행될 코드(반복 수행될 코드)
			System.out.println(i);
		}
	}
	
	public void ex2() {
		// 영어 알파벳 A 부터 Z 까지 한줄로 출력
		// -> ABCDEFGHIJKLMNOPQRSTUVWXYZ 
		// char 문자 자료형인데 실제로 메모리에 저장하는 값은 정수값임.
		
		
		// 형변환을 이용한 방법 
		// 초기식에서 형변환 일어남 -> 조건식에서 형변환 일어남 -> 
		for(int i = 'A' ; i <= 'Z'; i++) {
			System.out.print( (char)i); //강제형변환하여 출력했을 때 문자형이 나오도록 한다.
		}
	
		System.out.println("\n========================="); 
		
		// 초기식에서부터 char형으로 선언하여 출력값에 문자값이 나오도록
		for(char i = 'A'; i <= 'Z'; i++) {
		//	System.out.print();
		}
	}
	
	public void ex3() {
		// 1부터 입력받은 수까지 1씩 증가하며 출력
		
		System.out.println("번호 입력: ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			System.out.println(i);
			
		}
			
		
	}

	public void ex4() {
		// 정수 5개를 입력받아서 합계 구하기
		
		// [실행화면]
		// 입력 1 : 10
		// 입력 2 : 20
		// 입력 3 : 30
		// 입력 4 : 40
		// 입력 5 : 50
		// 합계 : 150
		
		int sum = 0; // 합계 저장용 변수
		
		//for 문 밖에서 선언된 변수는 for문 안에서도 사용 가능
		//for 문 안에서 선언된 변수는 for문 밖에서 사용 불가
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("입력" + i + ": ");
			int input = sc.nextInt(); // 
					
			// sum에 입력받은 input 값 누적
			// sum == sum + input
			sum += input;
					
		}
		
		
		System.out.println("합계 : "+ sum);  // 따라서 System.out.println("합계 : "+ input); 이라고 쓰면 에러
	}

	public void ex5() {
		// 1부터 20까지 1씩 증가하면서 출력
		// 단, 입력받은 수의 배수는 양쪽에 () 표시
		
		//[실행화면]
		//괄호를 표시할 배수 : 3
		// 1 2 (3) 4 5 (6) 7 8 (9) . . .  20
		
		//괄호를 표시할 배수 : 4
		// 1 2 3 (4) 5 6 7 (8) 9 . . .  (20)
		
		
		
		System.out.print("괄호를 표시할 배수 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <=20; i++) {
			
			if(i % num == 0) { // 배수일 때
			
			} else { // 배수가 아닐 때
				System.out.print("(" + i + ") ");
			}
			
			
			
		}
				
		
	}

	public void ex6() {
		// [구구단 출력]
		// 2 ~ 9 사이 수를 하나 입력 받아
		//해당 단을 출력
		// 단, 입력받은 수가 2 ~ 9 사이 숫자가 아니라면
		// "잘못 입력하셨습니다." 출력
		
		/*
		 * 단 입력 : 5
		 * 5 X 1 = 5
		 * 5 X 2 = 10
		 * ...
		 * 5 X 9 = 45
		 * ==============
		 * 
		 * 단 입력 : -5
		 * 잘못 입력하셨습니다.
		 */
		
		
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <= 9 ) { //2 ~ 9 사이일 때
			for(int i=1; i <= 9; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, dan * i);
			}
			
			
		} else { // 범위 밖일 때
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
		
	public void ex7() {
		// 숫자 세기 count
		
		// 1 ~ 20 까지 1씩 증가하면서    
		// 입력받은 수의 배수의 총 개수 출력
		// 입력받은 수의 배수의 합계 출력
		
		// 배수 입력 : 3
		// 3 6 9 12 15 18 : 6개
		// 3의 배수 합계 : 63
		
		// 힌트 
		// 필요한 변수가 뭐가 있을까?
		
		int count = 0; // n의 배수의 개수를 세기 위한 변수
		int sum = 0; // n의 배수의 합계를 구하기 위한 변수
		String result = "";
		
		System.out.println("배수 입력 : ");
		int input = sc. nextInt();
		
		for(int i =1; i <= 20; i++) { 
			
			if( i % input == 0 ) { // 배수일 때			//두번째 턴
			result += i + " "; // 첫 턴 때 "5 "				"5 10 "		
			count ++; // 갯수 세기 1						2
			sum += i; // 합계 누적 5						15
			
		}
										// "5 10 15 20 "  // 4
		System.out.printf("%s : %d개\n", result, count);
		System.out.printf("%d의 배수 합계 : %d", input, sum);  // 50
													//5
		
		}
	}

	public void ex8() {
		
		// 구구단 모두 출력하기
		// 2단부터 9단까지 증가 -> 바깥 for문 필요 dan
		// 안쪽 for문  1 ~ 9까지 곱해지는 수 num
		
		for(int dan = 2; dan <= 9; dan++) { // 2 ~ 9단 까지 차례대로 증가
			
			for(int num = 1; num <= 9; num++ ) { // 각 단에 곱해질 수 1 ~ 까지 차례대로 증가
				System.out.printf("%d X %d = %2d  ",dan, num, dan*num ); 
				
			}
			System.out.println(); // 줄바꿈용
		}
		
		
		
		
	}

	public void ex9() {
		
		// 구구단역순		
		// 9 -> 2단까지 역방향		->	바깥 for문 dan 
		// 곱해지는 수는 1 -> 9 까지 정방향	-> 내부 for문 num
		
		for(int dan = 9; dan >=2 && dan <= 9; dan--) {
			
			
			for(int num = 1; num >= 1 && num <= 9; num++) {
				System.out.printf("%d X %d = %2d  ", dan, num, dan*num);
				
			}
					System.out.println();
		}
		
	}
}
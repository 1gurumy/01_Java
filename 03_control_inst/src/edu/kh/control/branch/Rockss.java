package edu.kh.control.branch;

import java.util.Scanner;

public class Rockss {
/*
	Scanner sc = new Scanner(System.in);
	//
	 * 가위 바위 보
	 * 
	 * [프로그램 실행]
	 * 
	 * 가위 바위 보 입력 : 가위 바위 보가 아닌 값을 입력하면 잘못입력했습니다 출력
	 * 
	 * 
	 * 1 -> 가위 / 2 -> 바위 / 0 -> 보 기계가 0부터 2까지 랜덤으로 숫자를 선택
	 * 
	 * 기계가 가위 바위 보 중에 냄. 누가 이겼는지 출력
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 //

	public void ex1() {
		System.out.print("가위 바위 보 중에서 : ");
		String input = sc.next();

		int random = (int) (Math.random() * 2);
		// Math.random()의 결과값 : 0.0 ~ 1.0 중에서 랜덤으로 뽑음. 위에서 정한 가위바위보에 대응하는 숫자가 0 ~ 2까지이므로
		// 2를 곱함.
		String qq;
		// 기계가 낸 결과 저장용 변수

		if (random == 0) { // 기계가 보 냄.
			qq = "보";

		} else if (random == 1) {
			qq = "가위";

		} else { // Math.random()에서 2를 곱했기 때문에 범위가 0 ~ 2까지로 제한되었고 int형으로 강제형변환했기 때문에
					// 0, 1, 2 밖에 나올 수 없음. 0 1 은 위에서 썼으니까 나머지 경우의 수가 2밖에 안 남음. 남은 경우의 수가 하나이므로 굳이
					// 조건문을 쓸 필요가 없어서 else문으로 끝냄!
			qq = "바위";
		}
		
		System.out.println(qq);
		
		

		// 가위 바위 보가 아닌 값을 입력하면 잘못입력했습니다 출력 // 내가 입력한 값(input)을 따지는 거니까 input이 선언된 다음이어야
		// 하고, 내가 낸 것과 기계가 낸 것을 따지기 전에 사전에 input에 잘못된 값을 사용하는 것을 방지.

		if (input.equals("가위") || input.equals("바위") || input.equals("보")) {

			if (input.equals(qq)) { // 내가 낸 것과 기계가 낸 결과가 같음.	//.equals() : 기본자료형 외의 값을 비교할 때 사용
				System.out.println("비겼습니다.");

			} else { // 내가 낸 것과 기계가 낸 결과가 다름.

				if (input.equals("보") && qq.equals("가위")) { // 기계가 이긴 경우 // 나 : 보 / 기계 : 가위 // 나: 가위 / 기계 : 바위 // 나 : 바위
															// / 기계 : 보
					
					System.out.println("졌습니다");

				} else if (input.equals("가위") && qq.equals("바위")) {
					System.out.println("졌습니다");

				} else if (input.equals("바위") && qq.equals("보")) {
					System.out.println("졌습니다");

				} else {
					System.out.println("이겼습니다");

				}

			}

		} else {
			System.out.println("잘못 입력하셨씁니다.");
		}

		
	}
	
	
	*/
	
	/*
	 * [컴퓨터랑 가위바위보]
	 * 
	 * 내가 낼 것 :
	 * 스캐너 통해서 입력
	 * 
	 * 컴퓨터가 낼 것 : 
	 * 
	 * 내가 낸 것과 컴퓨터가 낸 것 비교하여 win/lose/drow 출력
	 * 
	 * 결과 : win/lose/drow
	 * 
	 * */
	
	
	public void exx() {
		Scanner sc = new Scanner(System.in);
		System.out.println("내가 낼 것(가위/바위/보) : ");
		String input = sc.nextLine();
		
		String qq;
		int random = (int)(Math.random() * 3);
		
		if (random == 0) {
			 qq ="가위";
			
			
		}
		
			
		
		
		
	}

}

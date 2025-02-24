package deu.kh.control.condition;

import java.util.Scanner;

public class LoopPractice { // 기능 작성용

	Scanner sc = new Scanner(System.in);

	
	public void practice1(){
		
		// 사용자로부터 한 개의 값을 입력 받아  -> input 
		// 1부터 그 숫자까지의 숫자들을 모두 출력하세요. ->  for문, 1 ~ input 출력 
		// 단, 입력한 수는 1보다 크거나 같아야 합니다.  -> 								input >= 1 , if(input < 0) -> “1 이상의 숫자를 입력해주세요“
		// 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요. 
		   
		
		//  1. 내가 입력한 값이 조건에 맞는지 파악하기
		// -> 조건문을 이용해야한다. -> if/ switch     하나의 조건이기 때문에 if를 쓰ㄴ자
		// 
			
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input < 0) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			
		} else {
			for(int i =1; i <= input; i++) {
				System.out.println(i);
			}
		}
	}	
				

	public void practice2(){
		
		
		// 사용자로부터 한 개의 값을 입력 받아
		// 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		// 단, 입력한 수는 1보다 크거나 같아야 합니다.
		
		// [실행화면]
		// 1이상의 숫자를 입력하세요 : 4		
		// 4 3 2 1
		
		// [실행화면]
		// 1이상의 숫자를 입력하세요 : 0
		// 1 이상의 숫자를 입력해주세요.
		
		
		System.out.printf("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			
		} else { // 정상범주
			for(int i = input; i >= 1 && i <= input; i-- ) {
				System.out.println(i);				
			}			
		}		
	}	

	
	 public void practice3() {
		
	
	// 1부터 사용자에게 입력 받은 수까지의 정수들의 합을     	
	// for문을 이용하여 출력하세요.

	// [실행화면]
	// 정수를 하나 입력하세요 : 8
	// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
	
		int sum = 0;
	
	System.out.println("정수를 하나 입력하세요");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			sum += i;
			
			System.out.printf("%d + %d + %d + %d + %d + %d + %d + %d = %d", input-i ~ input);
		
	}
	
}

}
	
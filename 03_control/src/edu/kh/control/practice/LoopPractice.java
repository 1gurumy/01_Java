package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice13() {
		/*1부터 사용자에게 입력 받은 수까지 중에서 -> for(i = 1; i <= input; i++)
		1) 2와 3의 배수를 모두 출력하고	-> if(i % 2 == 0 || i % 3 == 0){ 출력
		2) 2와 3의 공배수의 개수를 출력하세요. ->  갯수 누적용 변수 count 선언, if(i % 2 == 0 || i % 3 == 0) { count ++
		*/
		
		/*자연수 하나를 입력하세요 : 15
		2 3 4 6 8 9 10 12 14 15
		count : 2
		*/ 
	
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		
		int count = 0;
		
		for(int i = 1; i <= input; i++) { // 1 ~ input		
			if(i % 2 == 0 || i % 3 == 0) {	// 2와 3의 배수를 모두 출력
				System.out.print(i + " ");
			 if(i % 2 == 0 && i % 3 == 0) { // 2와 3의 공배수일 때
				 count ++;
			}
			
			}	
		}
			System.out.println("\ncount : " + count);
	}
	
	public void practice12() {
		// 다음과 같은 실행 예제를 구현하세요.
		
			/*ex.
			정수 입력 : 5
		 	*****
			*   *
	 		*   *
	 		*   *
	 		*****
	 		*/
		
		Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        
        // 첫 번째 줄 출력 (별 n개)
        for (int i = 0; i < n; i++) {
            System.out.print("*"); // *****
        }
        System.out.println();  // 줄 바꿈

        // 중간 줄 출력 (첫 번째 별, 공백, 마지막 별) =>*   *
        for (int i = 1; i < n - 1; i++) { // 1 < 5 - 1
            System.out.print("*");		//*
            for (int j = 1; j < n - 1; j++) { // 1 < 5 - 1 		// 2 < 4	// 3 < 4
                System.out.print(" "); // " "" "" "
            }
            System.out.println("*");
        }
        
        // 마지막 줄 출력 (별 n개)
        if (n > 1) {  // 마지막 줄은 n > 1일 때만 출력
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();  // 줄 바꿈
        }
        
	
	
	}

}
	


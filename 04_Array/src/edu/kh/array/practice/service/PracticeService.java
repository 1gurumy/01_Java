package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	
	Scanner sc = new Scanner(System.in);

	public void practice1(){
		/*길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
		  순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		  짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
		*/
		
		/*[실행 화면]
		1 2 3 4 5 6 7 8 9
		짝수 번째 인덱스 합 : 25
		*/
		
		int arr[] = new int[9];
		
		for(int i = 0; i < arr.length; i++) { // 인덱스 번호
			arr[i] = i + 1;
		}
		System.out.println(Arrays.toString(arr));
		
		int sum = 0; // 합계용 변수
		
		for(int i = 0; i < arr.length; i++) { // 인덱스 번호 중
			if (i % 2 == 0) {					// 짝수 번호
				sum += arr[i];					// => 짝수번째 인덱스에 해당하는 값들을 sum에 누적
			}
		}
		System.out.println("짝수 번째 인덱스 합 : " + sum);
	}	
 
	public void practice2() {
		/*길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
		순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
		*/
		
		/*[실행 화면]
	   	9 8 7 6 5 4 3 2 1
		홀수 번째 인덱스 합 : 20
		*/		
		
		int arr[] = new int[9];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 9 - i;
		}
		System.out.println(Arrays.toString(arr));
	
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				sum += arr[i];
			}
			
		}	System.out.println("홀수 번째 인덱스 합 : " + sum);	
	}

	public void practice3() {
		/*
		 * 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		   1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		   
		 * [실행 화면]
			양의 정수 : 5
			1 2 3 4 5
		 */
		
		Scanner sc = new Scanner(System.in);
			
			
			System.out.print("양의 정수 : " );
			int input1 = sc.nextInt();
				
			int arr[] = new int[input1];
			
			for(int i = 0; i < arr.length; i++) {
				arr[i] = i + 1;
			}
			System.out.println(Arrays.toString(arr));
	}

	public void practice4() {
		/*정수 5개를 입력 받아 배열을 초기화 하고
		검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
		배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
		
		[실행 화면 1]
		입력 0 : 5
		입력 1 : 8
		입력 2 : 9
		입력 3 : 10
		입력 4 : 4
		검색할 값 : 8
		인덱스 : 1
		
		[실행 화면 2]
		입력 0 : 5
		입력 1 : 8
		입력 2 : 9
		입력 3 : 10
		입력 4 : 4
		검색할 값 : 1
		일치하는 값이 존재하지 않습니다.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		// for문으로 작성해보기
		/*System.out.print("입력 0 : ");
		int input1 = sc.nextInt();
		
		System.out.print("입력 1 : ");
		int input2 = sc.nextInt();
		
		System.out.print("입력 2 : ");
		int input3 = sc.nextInt();
		
		System.out.print("입력 3 : ");
		int input4 = sc.nextInt();
		
		System.out.print("입력 4 : ");
		int input5 = sc.nextInt();
		*/
		
		/*int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int input3 = sc.nextInt();
		int input4 = sc.nextInt();
		int input5 = sc.nextInt(); 
		int arr[] = {input1, input2, input3, input4, input5}; */
		
		int arr[] = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("입력 %d : ", i);
			arr[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		
		boolean flag = true;
		
		for(int i = 0; i < arr.length; i++) {
			if (search == arr[i]) {
				System.out.println("인덱스 : " + i);
				flag = false;
			}
		}
		if( flag ) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}

	// 5번 모르겠음
	public void practice5() {
		/*문자열을 입력 받아 문자 하나하나를 배열에 넣고 
		  검색할 문자가 문자열에 몇 개 들어가 있는지
		  개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		*/
		
		/*[실행 화면]
		  문자열 : application
		  문자 : i
		  application에 i가 존재하는 위치(인덱스) : 4 8
		  i 개수 : 2
		*/
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String word = sc.next();
		
		System.out.print("(검색할)문자 : ");
		String text = sc.next();
		
		char arr[] = new char[word.length()]; // 입력 받은 문자열(word)의 길이와
											 // 같은 길이를 가진 문자형 arr 배열 생성
		
		for(int i = 0; i < arr.length; i++) { // 입력 받은 문자열(word)의 
			arr[i] = word.charAt(i);	// 문자 하나하나를 arr 배열에 대입 
			
			if(text == word[i]) { // 검색한 문자 하나와 word
				System.out.printf("%s에 %s가 존재하는 위치(인덱스) : %d %d",
						word, text, i ??);
			}*/
			
			// 과정 먼저 정하기
			// 1. 사용자에게 문자열 입력받기
			System.out.printl("문자열 : ");
			String str = sc
			// 2. 사용자가 입력한 문자열을 하나하나 잘라서 char 배열에 넣기
			// -> 사용자가 입력한 문자열의 길이만큼의 char 배열을 할당
			// 3. 문자 입력받기 (검색할 문자)
			// 4. 검색할 문자가 문자열에 몇개가 존재하는지, 어느 인덱스에 있는지 파악
			// 5. 적절히 출력해주기
		
		
		}	
		
}
	
	public void practice6() {
		/*사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.*/
		
		/*[실행 화면]
		정수 : 5
		배열 0번째 인덱스에 넣을 값 : 4
		배열 1번째 인덱스에 넣을 값 : -4
		배열 2번째 인덱스에 넣을 값 : 3
		배열 3번째 인덱스에 넣을 값 : -3
		배열 4번째 인덱스에 넣을 값 : 2
		4 -4 3 -3 2
		총 합 : 2
		*/
		
		
		int arr[] = new int[];
		
	}


}


	
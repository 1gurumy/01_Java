package edu.kh.array2.ex;

import java.util.Arrays;

public class Array2Example {

	/*
	 * 2차원 배열
	 * 
	 * - 자료형이 같은 1차원 배열을 묶음으로 다루는 것
	 * -> 1차원에서 행, 열 개념이 추가된 것
	 * 
	 * */
	public void ex1() {
		
		// 2차원 배열 선언
		int[][] arr;		// 세 개
		// int arr[][];			모두
		// int[] arr[];		같은 의미
		// -> int 2차원 배열을 참조하는 참조변수 arr 선언
		// 참조변수 == 참조형 == 레퍼런스 변수 == 레퍼런스
		
		// 2차원 배열 할당
		// -> new 자료형[행 크기][열 크기];
		
		arr = new int[2][3];
		// : heap 영역에 int 2차원 배열 2행 3열 공간을 할당한다
		//   그 공간의 주소값을 arr이라는 참조변수에 대입한다
		
		// 2차원 배열 초기화
		// 1) 행, 열 인덱스를 이용해서 직접 초기화한다.
		/*
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		*/
		
		// 2) 2중 for문을 이용한 초기화
		int num = 10; // 배열 요소 초기화에 사용할 변수
		
		// * 배열 길이
		System.out.println(arr.length); // 2 (행 길이)
		// arr.length -> arr이 참조하고 있는 2차원 배열의 행의 길이
		
		System.out.println(arr[0].length); // 3 (열 길이)
		// arr[0].length -> arr[0] 이 참조하고 있는 배열의 길이
		
		System.out.println(arr[1].length); // 3 (열 길이)
		// arr[1].length -> arr[1] 이 참조하고 있는 배열의 길이
		
		
		// arr = new int[2][3];
		for(int row = 0; row < arr.length; row++) { // 행 반복 (0, 1)
			
			for(int col = 0; col < arr[row].length; col++) { // 열 반복 (0, 1, 2)
				
				arr[row][col] = num;
				num += 10;
				
				/*
				 * arr[0][0] = 10;
				 * arr[0][1] = 20;
				 * arr[0][2] = 30;
				 * 
				 * arr[1][1] = 40;
				 * arr[1][2] = 50;
				 * arr[1][2] = 60;
				 * 
				 * */
				
			}
			
		}
		
		// 3) 선언과 동시에 초기화
		int[][] arr2 = {{10, 20, 30}, 	// 2행 3열
						{40, 50, 60}}; 
		
		
		
		
		//// Arrays사용하려면 임포트 필수!
		// Arrays. toString(배열명) : 참조하고 있는 1차원 배열의 값을 문자열로 반환한다.
		System.out.println(Arrays.toString(arr)); // 따라서 2차원 배열의 주소값이 출력된다.
		
		// Arrays.deepToString(배열명)
		// : 참조하고 있는 배열의 실제 데이터가 나오는 부분까지 파고 들어가서 
		//   모든 값을 문자열로 반환
		System.out.println(Arrays.deepToString(arr));
		System.out.println(Arrays.deepToString(arr2)); 
		
		
		
	}	
	
	public void ex2() {
		// 2차원 배열 선언과 동시에 초기화
		// 3행 3열 짜리 정수형 2차원 배열 선언과 동시에
		// 1 ~ 9까지 초기화
		int[][] arr = {{1, 2, 3}, 
					   {4, 5, 6}, 
					   {7, 8, 9}};
		
		// 행 별로 합 출력
		// 0행의 합 : 6
		// 1행의 합 : 15
		// 2행의 합 : 24
		
		for(int row = 0; row < arr.length; row++) { // 행 반복 (3)
			
			int sum = 0; 
			
			for(int col = 0; col < arr[row].length; col++) { // 열 반복 (3)
				
				sum += arr[row][col]; //안쪽 for문이 끝날때마다 각 행의 합이 누적됨
				//			0	0	-> 1
				//			0	1	-> 2
				// 			0 	2	-> 3
				// ----------------------0행의 합은 : 6
				// 			1	0	-> 4
				// 			1	1	-> 5
				// 			1	2	-> 6
				// ----------------------0행의 합은 : 15
				//	 		2	0	-> 7
				// 			2	1	-> 8
				// 			2	2	-> 9
				// ----------------------0행의 합은 : 24
			}
			
			System.out.printf("%d행의 합 : %d\n", row, sum);
			
		}
		
		System.out.println("===========================================");
		
		// 열 별로 합 출력하기
		// ex)
		// 0열의 합 : 12
		// 1열의 합 : 15
		// 2열의 합 : 18
		
		
		for(int col = 0; col < arr[0].length; col++) { //각 열을 순회 /// arr[0]-> 어차피 모든 행의 길이가 같으므로 임의의 행 선택
			
			int sum = 0;
			
			for(int row = 0; row < arr.length; row++) { // 각 행을 순회
				
				sum += arr[row][col];
				//			0    0	-> 1
				//			1    0	-> 4
				//			2    0	-> 7
				// ------------------0열의 합 : 12
				//			0    1	-> 2
				//			1    1	-> 2
				//			2    1	-> 2
				// ------------------1열의 합 : 15
				//			0    2	-> 3
				//			1    2	-> 6
				//			2    2	-> 9
				// ------------------2열의 합 : 18
			}
			
			System.out.printf("%d열의 합 : %d\n", col, sum);
		}
		
		
	}
	
	public void ex3() {
		// 가변 배열
		// - 2차원 배열 생성 시 마지막 배열 차수(열)를 지정하지 않고
		//   나중에 서로 크기가 다른 1차원 배열을 생성하여 참조하는 배열
		
		char[][] arr = new char[4][];
		// char 2차원 배열 생성 시 행 부분만 생성했다. heap메모리에 행 부분만 4칸 생성이되었고 이 것이 누굴 참조할 지 미정했다.

		
		arr[0] = new char[3]; // arr 0행에 3열짜리 1차원 배열을 생성하여 주소값을 저장한다.
		arr[1] = new char[4]; // arr 1행에 4열짜리 1차원 배열을 생성하여 주소값을 저장한다.
		arr[2] = new char[5]; // arr 5행에 5열짜리 1차원 배열을 생성하여 주소값을 저장한다.
		arr[3] = new char[2]; // arr 3행에 2열짜리 1차원 배열을 생성하여 주소값을 저장한다.
		
		char ch = 'a';
		
		for(int row = 0; row < arr.length; row++) {	// arr.length -> 4
			
			for(int col = 0; col < arr[row].length; col++) { // 
				
				arr[row][col] = ch++;
			//  
			}
				
		}
		
		System.out.println(Arrays.deepToString(arr));
	}	
		
}



package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// nextInt() 사용한 후 nextLine() 사용 시 문제점
		
		System.out.print("nextInt() 입력 : "); 
		int intNum = sc.nextInt(); // nextInt 이용해서 정수값 입력 -> 정수값과 엔터(\n)가 입력버퍼에 들어감.
		// -> nextInt()는 정수값만을 수집 -> 따라서 입력버퍼에는 \n만 남은상태
		
		sc.nextLine(); // *입력버퍼에 남은 개행문자 제거용*
	
		System.out.print("nextLine() 입력 : ");
		String word = sc.nextLine(); // 공백까지 포함(개행 포함)
		// 입력버퍼에 남아있는 \n을 수집하고 끝.
		
		// 입력버퍼 : 키보드로 입력한 값은 입력버퍼를 거쳐서 자바 프로그램에 들어간다.
		// 5 입력하고 엔터 누르면 5가 자바프로그램에 들어가고 대행문자만 혼자 버퍼에 남아버린다.
		//  *따라서 sc.nextLine();을 중간에 넣어주면* 입력버퍼에 남은 개행문자가 제거된다*
		
		
		
	}

}

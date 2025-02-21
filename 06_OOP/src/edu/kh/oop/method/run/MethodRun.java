package edu.kh.oop.method.run;

import edu.kh.oop.method.model.service.MemberService;

public class MethodRun {

	public static void main(String[] args) {

		//MethodExample methodEx = new MethodExample();
		//methodEx.method1();
		
		
		MemberService service = new MemberService();
		service.displayMenu();
		
		
		// 3. method2() 함수 호출
		// 2. method1() 메서드 실행
		// 1. main 메서드 실행
		//------- Stack 바구니--------
		// 메서드를 호출한 순서대로 쌓이고 return된 순서대로 빠져나간다.
		
		
		//LIFO (Last - input - First - Out) : 마지막에 들어온 게 첫번째로 나간다 == 마지막 게 가장 빨리 실행ㅇ을 끝낸다 후입선출
		// stack은 LIFO 방식을 따른다.
		// 
	}

}

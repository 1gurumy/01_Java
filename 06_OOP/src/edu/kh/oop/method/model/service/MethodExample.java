package edu.kh.oop.method.model.service;

public class MethodExample {

	// main 메서드가 호출될 때마다 stack에 메서드를 실행한 이력이 쌓인다.
	// -> 메서드를 호출한 순서대로 쌓임.
	
	// main -> method1 -> method2
	// 그리고 제일 마지막에 쌓인순서대로 스택에서 나간다
	// -> LIFO ( Last - Input - Fist - Out)
	// : 마지막에 들어온게 첫번째로 나간다 == 후입선출
	// 나가는순서 : method2 -> method1 -> main
	
	
	
	
	
	public void method1() {
		int result = method2(3, 5); // method2() 함수 호출과 동시에 전달인자의 3, 5 전달
		System.out.println(result);
		// void 함수의 경return; 이 생략된 상태이다.(있어도 없어도 문제없음)
		// 호출한 곳으로 (코드 흐름이) 되돌아감.
	
	
	
	}

	public int method2(int a, int b) {
		int sum = a + b;
		return sum;
		
		// return 값; -> (값 반환)
		// method2()를 호출한 쪽으로 sum(8)을 가지고 
		// (코드의 흐름이)되돌아감
	}



}

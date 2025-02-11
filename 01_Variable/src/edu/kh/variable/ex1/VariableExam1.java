package edu.kh.variable.ex1;

public class VariableExam1 {
// 생성된 .java 파일과 class 오른쪽에 작성된 클래스명(이름)은 같아야 한다. 그렇지 않을 시 빨간줄(에러)이 뜬다.
	// 변경하려면 클래스명을 먼저 변경하고 왼쪽에서 파일명 클릭, F2 -> 변경된 파일명 입력
	public static void main(String[] args) {
		
		// 반지름5, 높이20 원
		System.out.println(2 * 3.141592653589793 * 5); // 원의 둘레
		System.out.println(3.141592653589793 * 5 * 5); // 원의 넓이(반*반*파이)
		System.out.println(3.141592653589793 * 5 * 5 * 20); // 원기둥의 부피
		System.out.println(4 * 3.141592653589793 * 5 * 5); // 구의 겉넓이
		
		// 3.141592653589793라는 복잡한 수를 매번 쓰기 번거롭다. 변수를 사용해보자!
		double pi = 3.141592653589793; // double : 실수 자료형. 원주율 pi라는 박스(변수)에 파이값을 대입한다. 등호(=)가 오른쪽 값을 왼쪽에 대입한다는 의미로 쓰인다.
		int r = 5; // 반지름(radius) // int : 정수 자료형
		int h = 20; // 높이(height)
		
		System.out.println(2 * pi * r); // 원의 둘레
		System.out.println(pi * r * r); // 원의 넓이
		System.out.println(pi * r * r * h); // 원기둥의 부피
		System.out.println(4 * pi * r * r); // 구의 겉넓이
		
		/* 변수 (Variable)
		 * - 메모리(RAM)에 값을 기록하는 공간
		 * -> 공간에 기록되는 값(Data)이 변할 수 있어서 변수라고 한다.
		 * 
		 * - 변수는 여러 종류가 존재한다.(저장되는 값의 형태, 크기가 다름)
		 * 
		 * 변수 사용의 장점
		 * 1. 가독성 증가
		 * 2. 재사용성 증가(한번 만든 변수를 계속 사용)
		 * 3. 코드 길이 감소
		 * 4. 유지보수성 증가(코드 수정이 간단해짐)
		 * 
		 */
		
	}
}

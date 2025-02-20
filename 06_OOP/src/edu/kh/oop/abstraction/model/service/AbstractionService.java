package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

// Service : 특정 기능(비즈니스 로직)을 제공하는 패키지 or 서비스
// (비밀번호 -> 암호화, 파일 -> 유효한 파일 걸러내는 작업...)
public class AbstractionService {

	// 클래스에는 속성과 기능이 있지만 필요하지 않다면 쓰지않아도 된다.
	// 해당 클래스에서는 기능만 쓸 예정
	public void ex1() {
		// People 클래스를 이용해서 국민 객체 만들기
		People p1 = new People();
		// People p1 : People 클래스의 객체의 주소를 저장하여 참조하는 변수 p1(p1 == 참조변수) (p1은 메서드 안에서 생성되었으니 지역변수에 해당하고 Stack 메모리에 저장된다.)
		// new People() : People 클래스의 인스턴스(객체)를 힙 메모리에 생성
		// 해석 순서 : new People() -> People p1
		// 해석 => People 클래스의 객체(인스턴스)를 Heap 메모리에 새롭게 생성할거고, 
		//			그렇게 Heap 메모리에 생성된 객체의 주소값을 p1이라는 참조변수에 저장하겠다.
		//			
		
		
		// 보통 객체를 만들 때 int[] arr = new int[5]; 이런식으로
		// int와 같이 변수 명 앞에 자료형이 붙는다.
		
		// * 클래스 이름이 자료형처럼 사용된다.*
		// == 그래서 클래스를 "사용자 정의 자료형" 이라고 부른다!!! (People == 사용자 정의 자료형)
		/*
		p1.name = "홍길동";	// 에러 메세지 - The field People.name is not visible => 데이터 직접접근을 제한하는 praivate 접근제한자를 사용했기 때문에 호출 불가능해서 에러 뜸
		p1.gender = '남';
		p1.pNo = "123456-1234567";
		p1.address = "서울시 중구 남대문로 120";
		p1.phone = "010-1234-1234";
		p1.age = 20;
		// 위 코드들은 캡슐화를 어김.
		
		p1.tax();
		p1.vote();
		
		System.out.println("p1의 name : " + p1.name);
		//System.out.println("p1의 gender : " + (int)p1.gender);
		System.out.println("p1의 gender : " + p1.gender);
		System.out.println("p1의 pNo : " + p1.pNo);
		System.out.println("p1의 address : " + p1.address);
		System.out.println("p1의 phone : " + p1.phone);
		System.out.println("p1의 age : " + p1.age);
		
		// jvm에 의한 char 타입의 기본값은 0이다.
		// 유니코드 문자체계에서 0은 공백을 나타낸다.
		// -> int 형으로 강제 형변환하면 0인 것을 확인할 수 있다.!
		
		System.out.println("p1의 pNo : " + p1.pNo);
		System.out.println("p1의 address : " + p1.address);
		System.out.println("p1의 phone : " + p1.phone);
		System.out.println("p1의 age : " + p1.age);
		
		*/
		//p1.getName();
		
		// 전달하는 값(인자) : 전달인자. 홍길동은 전달인자이다.
		p1.setName("홍길동"); 
		p1.setGender('남');
		p1.setpNo("123456-1234567");
		p1.setAddress("서울시 종구 남대문로 120");
		p1.setPhone("010-1234-1234");
		p1.setAge(20);
		
		System.out.println(p1.getName());
		//호출하는 쪽 입장에서 값을 입력하여 전달
		System.out.println(p1.getGender());
		System.out.println(p1.getpNo());
		System.out.println(p1.getAddress());
		System.out.println(p1.getPhone());
		System.out.println(p1.getAge());
		
	}	
		//People 클래스 이용하여 본인 이름 객체 생성하기
		// 본인의 정보 setter 이용해 값 대입
		// getter 이용해서 콘솔창 출력까지
		// 세 단계 완료하면 메모리구조 그려서 선생님 호출
		
		public void ex2() {
			
		
		People me = new People();
		me.setMyName("윤진경");
		me.setMyGender('F');
		me.setMyAge(26);
		me.setMyPhone("010-4840-6924");
		
		System.out.println(me.getMyName());
		System.out.println(me.getMyGender());
		System.out.println(me.getMyAge());
		System.out.println(me.getMyPhone());
		
		}

}

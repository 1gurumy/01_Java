package edu.kh.oop.abstraction.model.vo;
//model 프로그램 로직과 관련되어있는 데이터를 저장하는 용도, + 비즈니스 로직
//VO(Value Object) : 값 저장용 객체를 만들기 위한 클래스를 모아두는 패키지

//=> DB에서 객체를 가져와 관리하는 공간의 역할을 하는 패키지

/*
 * MVC 패턴(Model View Controller)
 * : 애플리케이션의 역할을 세 가지로 분리하는 설계 패턴이다.
 * 
 * Model - 데이터와 비즈니스 로직을 처리하는 부분(DB, 서비스, 객체)
 * View - 사용자에게 보여지는 화면(UI, HTNL, SSP, Thymeleaf, React)
 * Controller - 사용자의 요청을 받고, 모델과 뷰를 연결하는 역할(응답)
 * 
 * vo : 값 저장용 객체(Value Object). 데이터를 담는 객체들을 관리하는 공간이다.
 * 
 *  MVC 패턴 이용시 유지보수에 용이하며, 협업하기 수월해진다.
 * 
 * */
public class People { // 국민(사람) 클래스

	// 클래스란? 객체의 특성(속성과 기능)을 정의한 것
	// == 즉, 객체를 만들기 위한 설계도다.
	
	// 속성 == 값 == data
	// 값을 저장하기 위한 변수 선언
	// -> 국민이라면 공통적으로 가지고 있는 속성만 작성(추상화)
	//    이름, 성별, 주민번호, 주소, 전화번호, 나이
	// 필드(클래스에서 사용할 변수들을 나열하는 공간) == 필드변수 == 멤버변수
	
	// 캡슐화
	// - 데이터(속성)와 기능을 하나로 묶어서 관리하는 기법
	// - 데이터의 직접적인 접근을 제한하는 것이 원칙이다.
	// -> 데이터에 직접접근을 못하기 때문에
	// 	  클래스 내부에 간접 접근 방법을 제공하는
	//	  기능(메서드)를 작성해둬야 한다.
	// -> 이러한 기능을 하는 메서드 : getter() / setter()
	
	/*
	 * 데이터 직접 접근 제한 하는 법
	 * 
	 * 접근제한자를 public (공공의) -> private (사적인, 개인적인)로 변경
	 * 
	 * 
	 * */
	
	
	
	// [접근제한자] 자료형 변수명;
	private String name;  // getter 혹은 setter를 사용했기 때문에 경고 메세지(노란밑줄) 안 뜸.
	private char gender;
	private String pNo;	// "123456-1234567"
	private String address;
	private String phone;	// "010-1234-1234"
	private int age;
	// public double bitcoin; // 모든 국민들에게 해당하는 공통점(추상화)이 아니므로 제거
	
	// 기능 == 행동/동작 == method(메서드)
	public void tax() {
		System.out.println("세금을 냅니다...");
	}
	
	public void vote() {
		System.out.println("투표를 합니다... 꼭 하세요!");
	}
	
	// 캡슐화에서 사용할 간접 접근 기능 (getter/setter)
	// [접근제한자] 반환형 메서드명() {}
	
	// name 변수의 값을 호출한 쪽으로 
	// 돌려 보내주는 간접 접근 기능 중 getter를 사용해보자
	
	// void : 반환할 값이 없다.(반환형(자료형)이 없다.)
	public String getName() { // 외부에서 접근 가능해야 하기 때문에 public 접근제한자 사용
		return name; // 필드에서 선언한? 변수를 
		// return : 반환, 되돌려주다
		// retrun 현재 메서드를 종료하고 호출한 쪽으로 되돌아감. 즉 AbstractionService클래스의 p1.getName();로 되돌아감
		// return 값/변수; : 현재 메서드를 종료하고
						//값/변수 가지고 호출한 쪽으로 되돌아감.
	}
	// getter setter 메서드 작성 시 변수 명명 규칙 : set/get변수명 -> 변수명은 카멜케이스 규칙따른다.
	
	// getter() : 반환형이 무조건 있음
	//			getter는 필드에 작성된 변수값을 호출한 쪽으로 되돌려주는 것.
	// 			필드에 작성된 변수는 자료형이 있을 것임.
	//  		그 변수를 되돌려준다면 당연히 반환형도 존재할 것!
	
	// name 변수에 값을 세팅하는 간접 접근 기능 중 setter 역할을 함
							// 매개변수
	public void setName(String name) { // name은 전달인자의 값을 전달받는 매개변수이다. AbstractionService클래스의 p1.setName("홍길동"); 코드로 인해 name에 홍길동 문자열 값 전달받음. 
	
		// **this : 현재 객체(의 필드)
		this.name = name;  // 현재 필드에 매개변수에 전달받은 문자열 "홍길동" 대입
		// setter() : 호출하는 쪽에서 값을 입력받아 현재 객체의 필드에 값을 전달하는 역할
	}
	/*
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
		
	}
	*/
	
	// getter setter 자동완성 단축키
	// alt + shift + s 또는 상단메뉴 Source
		// -> Generate Getters and Setters... 클릭
		// -> selectAll -> Generate 클릭
	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getpNo() {
		return pNo;
	}

	public void setpNo(String pNo) {
		this.pNo = pNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}
	

	public void setAge(int age) {
		// 메서드(기능) 형태인 getter/setter를 이용하면 본인이 원하는 기능을 추가할 수 있음
		// age가 0보다 작을 때 예외 발생시키기
		// age가 0보다 클 때 속성에 전달받은 값 세팅하기...
			if(age >0 ) {
		this.age = age;
	}	else {
			throw new IllegalArgumentException("음수는 안된다..");
			// IllegalArgumentException
			// 메서드에 전달된 인자(매개변수)가 유효하지 않을 때 발생하는 예외
	}
	}
	//=============================================
	
	private String myName;
	private char myGender;
	private int myAge;
	private String myPhone;

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public char getMyGender() {
		return myGender;
	}

	public void setMyGender(char myGender) {
		this.myGender = myGender;
	}

	public int getMyAge() {
		return myAge;
	}

	public void setMyAge(int myAge) {
		this.myAge = myAge;
	}

	public String getMyPhone() {
		return myPhone;
	}

	public void setMyPhone(String myPhone) {
		this.myPhone = myPhone;
	}
		
	
	
	
}
	




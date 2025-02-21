package edu.kh.oop.cls.model.vo;

public class User {
	
	// 속성 (필드 작성 영역) User가 가져야할 속성
	// (추상화 진행) = > 아이디, 비밀번호, 이름, 나이, 성별 
	// 데이터 직접접근 불가 원칙 -> 필드는 기본적으로 모두 private(캡슐화 진행)
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private char userGender;
	
	// 기본생성자 단축키 : Ctrl + space -> Enter
	// 기본생성자 ( -> 매개변수가 없는 생성자 )
	public User() { 
		// 기능
		System.out.println("기본생성자로 User 객체 생성");
		
		// 필드 초기화
		userId = "user01";
		userPw = "pass01";
		userName = "홍길동";
		userAge = 20;
		userGender = '남';
		
		
	}
	
	
	public User(String userName, int userAge, char userGender) {
		super();
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;
	}
	
	//매개변수 생성자 자동완성 단축키 : alt + shift + s -> Generate Constructor using Fields.. -> generate
	// 매개변수 생성자
	// 변수 : 매개변수, Overloading(오버로딩), this
	// ** 매개변수 : 생성자나 메서드 호출 시 () 안에 작성되어 
	//		전달되어지는 값을 저장하고 있는 변수
	// -> 전달받은 값을 저장하고 있는 매개체 역할의 변수라서 매개변수라고 부른다.
	public User(String userId, String userPw) { // 위의 생성자명이 같지만 매개변수의 타입이나 순서나 개수가 다르기 때문에 오버로딩이 적용됨.
		System.out.println("매개변수 생성자를 이용하여 User 객체 생성");
		
		// 필드 초기화
		this.userId = userId;
		this.userPw = userPw;
		//    필드  = 매개변수
		
		// this 참조변수
		// - 객체가 자기 자신을참조할 수 있도록 하는 변수
		// 힙메모리에 this가 생성되는데 이때 this의 주소값은 필드변수의 주소값을 참조한다. 
		// this 참조변수 왜 사용?
		// -> 필드명과 매개변수명이 같은 경우
		// 		이를 구분하기 위해서 사용한다.
		
	}
	
	// 필드를 전부 초기화하는 목적의 매개변수 생성자 만들어보자
	public User(String userId, String userPw, String userName,
			int userAge, char userGender) {
		
		// this() 생성자
		// 같은 클래스의 다른 생성자를 호출할 때 사용
		// 주의할점 : 생성자 내에서 반드시 첫번째 줄에작성해야한다!
		// 왜 사용하는가?
		// 중복 코드 제거에 효과가 있다 -> 코드 길이 감소.  재사용성 증가.
		// (단점) 가독성이 좀 떨어지는 경우가 있다.
		this(userId, userPw);
		
		
		//this.userId = userId;
		//this.userPw = userPw;
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;
		
		
	}
	
	// 자바는 기본적으로 필드명, 생성자명, 메서드명, 변수명의
	// 중복을 허용하지 않음.
	
	//private String userId; // Duplicate중복된 field User.userId
	//public User() {} // Duplicate method User() in type User
	
	//**오버로딩(Over loading)**
	// - 클래스 내에 동일한 이름의 메서드(생성자도 포함)를
	// 여러개 작성하는 기법
	
	// [오버로딩 조건]
	// 1) 메서드의 이름이 동일할 것
	// 2) 매개변수의 개수나 변수나 타입(자료형) 순서 중 1개라도 달라야 함.
	
	//public User() {}	// 매개변수가 없는 것을 기본생성자라고 함. 위에서 기본생성자 이미 작서오디어있어서 사용불가
	public User(String userId) {}	// 매개변수의 개수가 같은 생성자 이전에 없었고,므로
	// -> 오버로딩 성립
	
	public User(int userAge) {} // 매개변수의 개수는 같지만 타입이 다름
	// -> 오버로딩 성립
	
	public User(String userId, int userAge) {}
	// 매개변수의 개수와 동일한 것이 있으나, 하나의 타입이 다름
	// -> 오버로딩 성립
	
	public User(int userAge, String userId) {}
	// 바로 위의 메서드와 매개변수의 개수, 타입은 같지만 순서가 다름
	// -> 오버로딩 성립
	
	//public User(int userAge, String userName ) {}
	// 매개변수의 개수, 타입, 순서가 모두 같아서 불가
	// -> 오버로딩에서 변수명은 신경쓰지 않는다.
	
	
	
	
	// 기능 (생성자 + 메서드 작성 영역)
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public char getUserGender() {
		return userGender;
	}
	public void setUserGender(char userGender) {
		this.userGender = userGender;
	}
	
	
	public String toStirng() {	
		return "";
	}
	// 본래, 프린트 구문에 객체명을 입력해 이클립스를 실행하면 객체의 주소값이 출력된다.
	// 그런데 toString을 호출하면 return구문 옆의 문자열들을 호출한 쪽으로 return(반환)해준다.
	// 오버라이드를 했다면 재정의를한 형태를 그대로 반영하여 프린트구문에 출력되는 것이다.
	//  (프린트 구문에 객체명만 적은 경우와 객체.toString이라고 적은 경우의 출력값은 같다.) 
	// (객체명만 적어도 toString이 생략되어있는 상태인 것이다.) 
	// toString() 메서드 : Object 최상위 클래스에 이미 만들어져있는 메서드
	// 객체가 문자열로 변환될 때 호출되는 메서드
	// -> 보통 객체의 필드값을 출력하는 용도로 오버라이딩(==재정의)해서 사용함.

	// @Override : 메서드가 부모 클래스의 메서드(바로 위의 toString 메서드)를 "정확히" 재정의(오버라이딩) 검사
	// 1. 만약에 오타가 있거나, 부모 클래스에 없는 메서드를 잘못 작성했을 경우 컴파일 오류 발생
	// 2. 이 메서드가 부모 클래스를 재정의 했다는것을 한눈에 알 수 있음
	@Override // @ (어노테이션) : 컴파일러 인식용 주석
	public String toString() {
		return "User [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", userAge=" + userAge
				+ ", userGender=" + userGender + "]";
	}
	
	
	
	
	
	
		/*
		 * 생성자 (constructor)
		 * 
		 * - new 연산자를 통해서 객체를 생성할 때
		 *  생성된 객체의 필드값 초기화 + 지정된 기능을 수행하는 역할
		 *  
		 *  - 생성자 작성 규칙
		 *  1) 생성자의 이름은 반드시 클래스명과 같아야 한다.
		 *  2) 반환형이 존재하지 않는다.
		 *  
		 *  생성자 종류
		 *  1) 기본생성자 -> 모든 생성자의 맨 위에서 단축키 Ctrl + space -> Enter
		 *  2) 매개변수 생성자 -> Alt + Shift + s => 필드 초기화용 생성자 자동완성
		 *  
		 *  
		 * 
		 * 
		 * */
}

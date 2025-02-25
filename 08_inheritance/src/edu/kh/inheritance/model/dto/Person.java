package edu.kh.inheritance.model.dto;

// DTO(Data Transfer Object) : 비즈니스 계층과 데이터 교환을 위해 사용하는 객체
public class Person { /*extends Object*/ // 생략되어있는 상태, 내부적으로는 자동으로 Object라는 부모 클래스의 상속을 받는다.
	// 모든 클래스는 상속받는 것이 하나도 없으면 Object라는 클래스의 상속을받는다.
	// Obgect 클래스
	// : 모든 클래스의 최상위 부모 클래스이다.
	// - calss 선언부에 상속 구문이 하나도 작성되어있지 않다면
	// 컴파일러가 extends Object 구문을 자동으로 추가해준다.

	// 속성(필드)
	private String name; 			//이름
	private int age; 				// 나이
	private String nationality; 	// 국적
	
	// 생성자 영역
	
	// 생성자의 역할?
	// : 객체 생성의 기능을 함
	// ex) new Person(); // 기본 생성자를 이용해 Person이라는 객체를 생성
	// ex) new Person(매개변수 1, 매개변수 2); // 
	
	public Person() {
		super(); // 기본 생성자에서 super()는 프로그래머가 굳이 작성하지 않아도 컴파일러가 내부적으로 자동추가해줌. 
	}

	public Person(String name, int age, String nationality) {	
		super(); // super생성자라고 부르며 부모의 생성자를 의미한다. (Person클래스에서는 Object 클래스의 기본생성자를 의미함.)
		// 자식 객체를 생성하면 내부에 부모객체가 먼저 생성된다. 자식객체가 상속을 받고있는 부모 객체가 있다면 부모 생성자가 먼저 호출되면서 부모객체를 먼저 생성.
		// 자식 생성자가 호출되면서 자식객체가 생성된다. 이 때 자식 객체 안쪽에 부모객체가 포함되어있다.
		this.name = name;
		this.age = age;
		this.nationality = nationality;	
	}

	
	
	// 기능(메서드)
	// getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	
	public void breath() {
		System.out.println("사람은 코나 입으로 숨을 쉰다.");
	}

	public void move(String str, int num) {
		System.out.println("사람은 움질일 수 있다.");
	}
	
	
	@Override
	public String toString() {
	//	return super.toString();	// Object 클래스에 있는 toString을 의미
		return name + " / " + age + " / " + nationality;		
	}
	
	
	
	
}

package com.hw1.model.vo;

public class Person {

	/*
	 * # name : String
	- age : int
	- height : double
	- weight : double
	+ Person()
	+ Person(age:int, height:double, weight:double)
	+ information() : String
	 * */
	
	protected String name;
	private int age;
	private double height;
	private double weight;
	/*
	 * private 필드는 상속을 통해 자식클래스가
	 * 부모 클래스의 필드를 물려받더라도
	 * getter/setter를 이용하여 간접 접근 해야한다.
	 * 
	 * protected 필드는 상속받은 자식이 마치 원래 본인 것이었던 것처럼
	 * 사용 가능하기 때문에 부모 필드에 직접 접근 가능하다.
	 * */
	
	public Person() {}

	
	
	public Person(int age, double height, double weight) {
		super();
		this.age = age;
		this.height = height;
		this.weight = weight;
	}



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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	
	public String information() {
		return String.format("이름 : &s / 나이 : %d / 신장 : %.1f / 몸무게 : %.1f",
				name, age, height, weight);	
			// 클래스명.매서드명 == static이 붙어있는 메서드를 호출하는 방법.
				// Ctrl 누른채 클릭해보면 static 붙어있는 메서드인 것 확인 가능
			// 해석 :String.format이 괄호 안의 매개변수들을 받고 형식에 맞춰 문자열을 반환해줌.
			// -> "이름 : 홍길동 / 나이 : 20 / 신장 : 180.0 / 몸무게 : 70.0"
	
	}
}
	
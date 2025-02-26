package com.hw1.model.vo;

public class Student extends Person {

	private int grade; // 학년
	private String magor; // 전공
	
	
	
	
	public Student() {}


	public Student(String name, int age, double height, double weight, int grade, String magor) {
		super(age, height, weight);
		this.name = name; // this는 현재 클래스의 객체만을 가리키는데, 부모클래스의 protected 필드가 있다면 상속받는 후손클래스가 직접접근이 가능.
		this.grade = grade;
		this.magor = magor;
	}
	
	@Override
	public String information() {
		//return super.information();
		//String.format("이름 : &s / 나이 : %d / 신장 : %.1f / 몸무게 : %.1f",
		// name, age, height, weight) 이 내용이 super.information에 반환받음.
		
		// 학년과 전공을 추가하기
		return super.information() + String.format(" / 학년 : %d / 전공 : %s", grade, magor);
		// 추후에 Student라는 객체 만들어서 Student에 있는 information() 메서드를 호출하면 
		// => "이름 : 홍길동 / 나이 : 20 / 신장 : 180.0 / 몸무게 : 70.0 / 학년 : 3 / 전공 : 컴공과"
		//  호출한 쪽에서 이런식의 문자열을 반환받는것.
			
		
		
	}				
	
	
}
	
	
	
	
	
	
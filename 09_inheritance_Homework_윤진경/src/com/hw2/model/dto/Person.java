package com.hw2.model.dto;

public abstract class Person {	// 추상메서드 가지고 있으므로 추상클래스
													// => [접근제한자] abstract class 클래스명 {}


	/*# id : String					  // 고유번호
	  # name : String 				  // 이름
	  + Person(String id, String name)
		+ abstract getInfo() : String // Person 정보를 문자열로 리턴
	 * */

	
	protected String id; 	// 고유번호
	protected String name;  // 이름
	
	
	// 매개변수 생성자
	public Person(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	// 추상메서드 -> [접근제한자] abstract 반환형 메소드명(자료형 변수명);
	// 기능 : Person 정보를 문자열로 리턴
	public abstract String getInfo();	
	
	
	
	
	
}

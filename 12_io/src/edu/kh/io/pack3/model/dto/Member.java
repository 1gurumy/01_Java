package edu.kh.io.pack3.model.dto;

import java.io.Serializable;

// Serializable 인터페이스
// - 추상메서드가 하나도 없는 인터페이스이다.
// -상속만 받아도 입/출력 시 직렬화가 가능하다는 의미(표시)만 제공
// --> 이런걸 마커 인터페이스라고 함.

// 직렬화 방법 -> impelmets Serializble만 작성함으로써 상속받기만 하면 됨.

public class Member implements Serializable{

	// 필드
	private String id;
	private String pw;
	private String name;
	private int age;
	
	// 메서드
	// 기본 생성자
	public Member() {}

	// 매개변수 생성자
	public Member(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	// 오버라이딩된 toString() 메서드
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", age=" + age + "]";
	}

	// getter / setter ---------------------------------------------------------
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
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
	
	
	
	
}

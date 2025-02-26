package com.hw2.model.dto;

public class Employee extends Person {

	
	/*
	 * - position : String // 직책
		+ Employee(String id, String name, String
		position)
		+ getInfo() : String
	 * */
	
	
	private String position;	// 직책

	
	
	// 매개변수 생성자
	public Employee(String id, String name, String position) {
		super(id, name);
		this.position = position;
	}


	// 강제 오버라이딩 메서드
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
		
	}

	
	// getter / setter ----------------------------------------------------------- 

	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}
	
	
	
	
	
	
	
	
	
	
	
}

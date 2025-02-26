package com.hw2.model.dto;

public class Prisoner extends Person {

	/*
	 * - crime : String // 죄목
		+ Prisoner(String id, String name, String crime)
		+ getInfo() : String
	 * */


	private String crime;	// 죄목

	
	// 매개변수 생성자 
	public Prisoner(String id, String name, String crime) {
		super(id, name);
		this.crime = crime;
	}


	
	// 강제 오버라이딩 메서드
	@Override
	public String getInfo() {
		return null;
	}


	
	// getter / setter --------------------------------------------------------

	public String getCrime() {
		return crime;
	}

	public void setCrime(String crime) {
		this.crime = crime;
	}


	
	
	
	
	
	
}

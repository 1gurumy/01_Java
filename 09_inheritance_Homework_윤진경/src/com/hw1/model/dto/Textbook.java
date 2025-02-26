package com.hw1.model.dto;

public class Textbook extends Book {

	/*
	 * - subject : String // 과목
		+ Textbook()
		+ Textbook(String title, String author, String
		subject)
		+ displayInfo() : void
	 * */
	
	private String subject;	// 과목
	
	// 기본생성자
	public Textbook() {}

	// 매개변수 생성자
	public Textbook(String title, String author, String subject) {
		super(title, author);
		this.subject = subject;
	}
	
	// 오버라이딩 강제화 메서드
	@Override
	public void displayInfor() {
		
		setTitle("자바 프로그래밍");
		setAuthor("James Gosling");
		setSubject("컴퓨터 과학");
		System.out.println(String.format("[전문 서적] 제목 : %s / 저자 : %s / 과목 : %s", getTitle(), getAuthor(), getSubject()));
		
		
		//[전문 서적] 제목 : 자바 프로그래밍 / 저자 : James Gosling / 과목 : 컴퓨터 과학
		
	}

	
	// getter / setter ---------------------------------------------
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
	
	
	
	
	
	
}

package com.hw1.model.dto;

public abstract class Book {

	
	/*
	 * - title : String // 제목
		- author : String // 저자
		+ Book()
		+ Book(String title, String author)
		+ abstract displayInfo() : void
	 * */
	
	private String title;// 제목
	private String author; // 저자
	
	// 기본생성자
	public Book() {}

	// 매개변수 생성자
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
	
	// 추상 메서드 => {}없음.
	public abstract void displayInfor();
	//public abstract 반환자료형 메소드명([자료형 매개변수])

	
	
	
	// getter / setter --------------------------------------------------------
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	


	
	
	
	
}

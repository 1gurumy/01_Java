package com.hw1.model.dto;

public class Poetry extends Book{

	/*
	 * - numberOfPoems : int // 시 수
		+ Poetry()
		+ Poetry(String title, String author, int
		numberOfPoems)
		+ displayInfo() : void
	 * 
	 * */

	private int numverIfPoems; 	// 시 수
	
	// 기본생성자
	public Poetry() {
		// TODO Auto-generated constructor stub
	}

	//매개변수 생성자
	public Poetry(String title, String author, int numverIfPoems) {
		super(title, author);
		this.numverIfPoems = numverIfPoems;
	}

	// 오버라이딩 강제화 메서드
	@Override
	public void displayInfor() {
		setTitle("우리들의 사랑시");
		setAuthor("김소월");
		setNumverIfPoems(30);
		System.out.println(String.format("[시집] 제목 : %s / 저자 : %s / 시 수 : %d", getTitle(), getAuthor(), getNumverIfPoems()));
		
		// [시집] 제목 : 우리들의 사랑시 / 저자 : 김소월 / 시 수 : 30
		
	
	// getter / setter --------------------------------------------------	
	}

	public int getNumverIfPoems() {
		return numverIfPoems;
	}

	public void setNumverIfPoems(int numverIfPoems) {
		this.numverIfPoems = numverIfPoems;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

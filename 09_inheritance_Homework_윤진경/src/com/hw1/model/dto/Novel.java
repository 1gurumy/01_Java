package com.hw1.model.dto;

public class Novel extends Book {

	/*
	 * - genre : String // 장르
		+ Novel()
		+ Novel(String title, String author, String genre)
		+ displayInfo() : void
	 * 
	 * */
	
	private String genre;	// 장르
	
	// 기본생성자
	public Novel() {}

	// 매개변수 생성자
	public Novel(String title, String author, String genre) {
		super(title, author);
		this.genre = genre;
	}

	// 오버라이딩 강제화 메서드
	@Override
	public void displayInfor() {
	// System.out.printf("제목 : %s / 저자 : %s / 장르 : %s", getTitle(), getAuthor(), getGenre() );
//		setTitle("해리 포터");
//		setAuthor("J.K 롤링");
//		setGenre("판타지");		
		System.out.println(String.format("[소설] 제목 : %s / 저자 : %s / 장르 : %s", 
				getTitle(), getAuthor(), getGenre()));
		
		// [소설] 제목 : 해리 포터 / 저자 : J.K 롤링 / 장르 : 판타지	
		//q toString.fomat ???
	}
	
	public String test1() {
		return "문자열 반환";
	}
	
	public int test2() {
		return 1;
	}
	
	
	//q 다이어그램에 안써있던 함수는 쓰면 안되는거?
	/*@Override
	public String toString() {
		return "제목 : 해리 포터 / 저자 : J.K 롤링 / 장르 : 판타지"; 
	      //[소설]
	}
	*/
	
	
	
	// getter / setter ------------------------------------------
	
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
}

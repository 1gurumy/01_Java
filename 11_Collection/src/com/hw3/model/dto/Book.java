package com.hw3.model.dto;

public class Book {
	
	private String title;			// 책 제목
	private String author;			// 책 저자
	private int price;				// 가격
	private String publisher;		// 출판사
	public int bookNum;				// 책 번호
	
	// 기본 생성자
	public Book() {}

	// 매개변수 생성자
	public Book(String title, String author, int price, String publisher, int bookNum) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.bookNum = bookNum;
	}
	
	
	// 재정의 toString() 메서드
	@Override
	public String toString() {
		//return "Book [title=" + title + ", author=" + author + ", price=" + price + ", publisher=" + publisher
				//+ ", bookNum=" + bookNum + "]";
		return bookNum + "번 도서 : [도서제목 : " + title + " / 도서저자 : " + author +
				" / 도서가격 : " + price + "원 / 출판사 : " + publisher + "]";
	}

	
	// getter / setter ---------------------------------
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	
}
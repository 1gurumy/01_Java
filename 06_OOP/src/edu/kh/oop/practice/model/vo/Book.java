package edu.kh.oop.practice.model.vo;

public class Book {

	
/*  - title : String // 도서명
	- price : int // 가격
	- discountRate : double // 할인율
	- author : String // 저자명
	+ Book()
	+ Book(title:String, price:int,
	discountRate:double, author:String)
	
	
	+ toString() : String
	*/
	
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	
	public Book() {
		
	}
	
	public Book(String title, int price, 
			double discountRate, String aouthor) {
		
		this.title = title;						//헷
		this.price = price;				//갈
		this.discountRate = discountRate;	//린
		this.author = aouthor;		//부분
	}

	//===================================================
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
		
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	

	
	@Override
	public String toString() { //C언어 / 30000 / 0.1 / 홍길동
		return title + " / " +  price + " / " + discountRate + " / " + author;
	}
	

	
	
	
	
}

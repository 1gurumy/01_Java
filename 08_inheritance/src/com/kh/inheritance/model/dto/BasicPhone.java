package com.kh.inheritance.model.dto;

public class BasicPhone extends Phone {
	
	/*
	 * - hasPhysicalKeyboard : boolean //
		물리적키보드유무
		+ BasicPhone()
		+ BasicPhone(String brand, String model, int
		year, int price, boolean hasPhysicalKeyboard)
		+ checkKeyboard() : void
	 * 
	 * */
	
	private boolean hasPhysicalKeyboard;
	
	public BasicPhone() {
	}

	
	
	public BasicPhone(String brand, String model, int year, int price, boolean hasPhysicalKeyboard) {
		super(brand, model, year, price);
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}
	
	

	
	
	
	public boolean isHasPhysicalKeyboard() {//q 왜 get아니고 is로 시작??
		return hasPhysicalKeyboard;
	}



	public void setHasPhysicalKeyboard(boolean hasPhysicalKeyboard) {
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}



	public void checkKeyboard() {
		
		super.printInfo();
			
		
		if(hasPhysicalKeyboard) {
			System.out.println("이 휴대폰은 물리적 키보드가 있습니다");
		} else {
			System.out.println("이 휴대폰은 물리적 키보드가 없습니다");
		}
		 
		
	}
	

	
}

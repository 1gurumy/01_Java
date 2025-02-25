package com.kh.inheritance.model.dto;

public class SmartPhone extends Phone {

	/*
	 * 
	 * - operatingSystem: String // OS
		- storageCapacity: int // 스토리지공간크기
		+ SmartPhone()
		+ SmartPhone(String brand, String model, int
		year, int price, String operatingSystem, int
		storageCapacity)
		+ printInfo() : void // @Override
	 * */
	
	
	private String operatingSystem;
	private int storageCapacity;
	
	
	public SmartPhone() {}

	
	public SmartPhone(String brand, String model, int year, int price, String operatingSystem, int storageCapacity) {
		super(brand, model, year, price);
		this.operatingSystem = operatingSystem;
		this.storageCapacity = storageCapacity;
	}
	
	
	
	public String getOperatingSystem() {
		return operatingSystem;
	}


	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}


	public int getStorageCapacity() {
		return storageCapacity;
	}


	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}


	
	@Override
	public void printInfo() {
		super.printInfo();  // 부모 클래스의 printInfo() 호출
		/*System.out.println("Brand: " + brand);
	      System.out.println("Model: " + model);
	      System.out.println("Year: " + year);
	      System.out.println("Price: " + price + "원");*/
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Storage Capacity: " + storageCapacity + "GB");
	
	}
	
}

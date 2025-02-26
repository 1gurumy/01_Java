package edu.kh.poly.ex1.model.dto;

public class Tesla extends Car{ // 전기차

	private int batteryCapacity; // 고유필드 배터리 용량
	
	public Tesla() {}
	
	// 매개변수 생성자 만들 때 상속받은것도 포함되도록 만들기
	public Tesla(String engine, String fuel, int wheel, int batteryCapacity) {
		super(engine, fuel, wheel);	// Car의 매개변수 생성자를 의미
		this.batteryCapacity = batteryCapacity;
	// 내부적으로 부모객체가 먼저 생성되고 자식클래스가 다음에 생성되기 때문에
		// super생성자는 반드시 맨 윗줄에 있어야함.
	}

	
	
	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	
	// Car.toSting()을 오버라이딩
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " / " + batteryCapacity;
	}
	
	
	
	
	
	
	
	
}

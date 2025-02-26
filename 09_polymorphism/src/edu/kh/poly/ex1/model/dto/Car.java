package edu.kh.poly.ex1.model.dto;

public class Car /*extends Object*/ {

	// 속성
	private String engine;  // 엔진
	private String fuel; 	// 연료
	private int wheel; 		// 바퀴갯수
	
	// 기능(생성자 + 메서드)
	public Car() {}

	public Car(String engine, String fuel, int wheel) {
		super(); // 슈퍼생성자라고 부름. 부모의 기본생성자를 의미함. Object 클래스의 기본생성자
		this.engine = engine;
		this.fuel = fuel;
		this.wheel = wheel;
		
		
		
		//---------------------------------------------------------
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	
	
	// Object.toString() => 오브젝트 클래스에 있는 toString메서드
	// 오버라이딩?
	// ->부모클래스에서 정의된 메서드를 자식클래스에서 재정의 하는 것
	
	// Ctrl + space 목록에 있음
	@Override
	public String toString() {
		//return super.toString(); // super. 슈퍼참조변수. 부모 클래스(오브ㅡ젝트 클래스)의 주소값을 받고있다.
		// : 오브젝트 클래스가 가진 투스트링 메서드를 호출한다
		return engine +  " / " + fuel + " / " + wheel;	// 재정의 한것
	
	
	}

	
	
	
	
	
	
}

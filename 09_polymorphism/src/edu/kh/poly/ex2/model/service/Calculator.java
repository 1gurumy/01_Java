package edu.kh.poly.ex2.model.service;

// 계산기 인터페이스
// -> 모든 계산기에 대한 공통 필드, 기능명을 제공하는 접점(interface)으로써의 용도
public interface Calculator {

	// 인터페이스 : 추상클래스의 변형체(추상클래스와 비슷하나 추상클래스보다 추상도가 높다)
	// - 추상클래스 : 일부만 추상메서드 (추상메서드가 있어도 없어도 됌)
	// - 인터페이스 : 메서드 중 추상메서드만 사용 가능
	
	// 속성(필드)
	// 인터페이스에서 필드는 묵시적으로 public static final => 상수  public static final 적지 않아도 상수로 인식됨.
	// 상수 특징 : 한번 초기화이후 값 재대입 불가 => 반드시 필드에서 초기화해야된다는 의미 //q
	public static final double PI = 3.14;
	 static final int MAX_NUM = 100000;
	 public int MIN_NUM = 100000;
	 int ZERO = 0;
	 // 위처럼 선언방식이 어떻든 모두 상수로 인식됨.
	 
	
	// 기능 
	// 인터페이스에서의 메서드는 묵시적으로 public abstract(추상) 메서드이다.
	public abstract int plus(int num1, int num2); 
	
	int minus(int num1, int num2);
	
	public int multiple(int num1, int num2);
	
	public abstract int divide(int num1, int num2);
	
	default void display() {
		System.out.println("Calculator의 display()");
	}
	
	
	
	
	
	
}

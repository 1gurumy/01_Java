package edu.kh.poly.ex2.model.service;

public interface TestInterface {

	int puls(int num1, int num2);
	
	public abstract String Test();
	
	
	// JAva 8 이후에는 디폴트 메서드(구현부가 있는 메서드)가 추가되었음
	default void display() {
		System.out.println("TestInterface의 display()");
	}
	
}

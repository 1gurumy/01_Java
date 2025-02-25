package com.hw1.model.vo;

public class Employee extends Person {

	private int salary; // 급여
	private String dept; // 부서
	
	public Employee() {}

	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		this.name = name; // 부모 PErson에 작성된 필드 중 protected 접근제한자 name	// 본인 클래스의 객체만 가리키는 this이지만, 
		this.salary = salary;	// 해당클래스가 부모 클래스(Person)의 상속을 받고있고, 
		this.dept = dept;		// 부모 클래스에서 name 필드의 접근제한자를 protected로 지정했기 때문에 
								// 자기 자신의 객체인 것 마냥 사용할 수 있음.
								
								
		// Person이 가진 매개변수 생성자가 name을 가지고 있지 않아서 자동 추가 안됌. 직접 입력해야함.
	}
	
	
	@Override	// Ctrl + space 누르면 Emplyee가 현재 오버라이딩 가능한 메서드 목록이 쭉 나타남.
	public String information() {
		//return super.information(); // Person 클래스의 information 메서드를 호출한 것.
			// super.information(); 이 자리에 String.format("이름 : &s / 나이 : %d / 신장 : %.1f / 몸무게 : %.1f", name, age, height, weight); 가 들어온 것과 같음.	
								//			==>	"이름 : 홍길동 / 나이 : 20 / 신장 : 180.0 / 몸무게 : 70.0"
													// 급여와 부서만 추가해주면 된다. => " / 급여 : 2000000 / 부서 : 기획팀" 추가
		return super.information() + String.format(" / 급여 : %d / 부서 : %s", salary, dept);
		//== "이름 : 홍길동 / 나이 : 20 / 신장 : 180.0 / 몸무게 : 70.0 / 급여 : 2000000 / 부서 : 기획팀"
		
	}
	
	
	
}

package edu.kh.inheritance.model.service;

import edu.kh.inheritance.model.dto.Imployee;
import edu.kh.inheritance.model.dto.Person;
import edu.kh.inheritance.model.dto.Student;

public class InheritanceService {

		// 상속 확인 예제
	public void ex1() {
		
		Person p = new Person();
		
		p.setName("홍길동");
		p.setAge(25);
		p.setNationality("대한민국");
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getNationality());
		
		System.out.println("=======================");
		
		
		// person 을 상속받은 Student가
		// 정말로 Person의 필드, 메서드를 사용할 수 있는가?
		
		// Student 객체 생성
		Student std = new Student();
		
		// Student만의 고유한 멤버
		std.setGrade(3);
		std.setClassRoom(5);
		
		// Person 클래스로부터 상속받은 멤버
		std.setName("고길동");
		std.setAge(19);
		std.setNationality("대한민국");
		
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		
		System.out.println("=======================");
		
		Imployee emp = new Imployee();
		
		//Imployee 만의 고유 멤버
		emp.setCompany("KH정보교육원");
		
		
		//Person 클래스로부터 상속받은 멤버
		emp.setName("조미현");
		emp.setAge(20);
		emp.setNationality("대한민국");
		
		System.out.println(emp.getCompany());
		
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getNationality());
		
		
		p.breath();
		p.move();
		
		std.breath();
		std.move();
		
		emp.breath();
		emp.move();
		
		// 상속의 특징
		// 코드 길이 감소 및 중복제거 효과가 있다
		
	}
	
	public void ex2() {	// super() 생성자 이용해보기
		
		// Student 객체 생성
			Student std = new Student("홍길동", 17, "한국", 1, 3);
			
			
			System.out.println(std.getName());
			System.out.println(std.getAge());
			System.out.println(std.getNationality());
			System.out.println(std.getGrade());
			System.out.println(std.getClassRoom());
			
			// Employee 객체 생성
			// 매개변수 생성자 이용) 이름, 나이, 국적, 회사)
			// 참조변수명 emp (김노동 30 한국 kh정보교육원)
			Imployee emp = new Imployee();
			
			//q ?????????????????????????????????????
			System.out.printf("%s, %d, %s, %s",
				emp.getName(), emp.getAge(), emp.getNationality(), emp.getCompany());
			
			
			
			
	}
	
	// 오버라이딩 확인 예제
	public void ex3() {
		
		Student std = new Student();
		Imployee emp = new Imployee();
		
		
		std.move(null, 0);	// Student 클래스에서 오버라이딩 안된 move => Person(부모) 클래스가 가진 메서드 수행
		// 사람은 움직일 수 있다. 출력됨.
		
		emp.move(null, 0);	// 오버라이딩이 되어있음 => Imployee에서 재정의한 메서드 수행
		// 오버라이딩된 move()
		// 효율적으로 빨리 일하고 퇴근한다 출력
		
		
		
			
		}
	public void ex4() {
		
		Person p = new Person("김철수", 17, "한국");
		
		
		System.out.println(p.toString());	// 똑같이
		System.out.println(p);				// 출력됨.
		// print 구문 수행 시 참조변수명을 작성하면
		// 자동으로 toString() 메서드를 호출해서 출력해준다.
			
		
		
		System.out.println("---------------------------");
		
		
		Student std = new Student(super(), );
		
		System.out.println(std.toString());
		
		// Employee 객체 생성("김노동", 36, "한국", "Kh정보교육원")
		// toString 이용한 출력 시 : 김노동 / 36 / 한국 / KH정보교육원
	
		System.out.println();
	}
	
	
}

package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		/*1. 3명의 학생 정보를 기록할 수 있게 객체 배열을 할당하고 
		 *  Student 클래스 이용해서 객체를 만들거고 그 Student 객체가 3개가 들어올 수 있도록 Student 타입의 배열 만들라는 것 
		 * 
		 * 사용데이터를 참고하여 3명의 학생 객체 생성 후 
		 * 반복문을 통해 출력
			2. 최대 10명의 사원 정보를 기록할 수
			있게 객체 배열을 할당하고 반복문을
			사용하여 키보드로 사원 정보를 입력
			받도록 구현 
			2명 정도의 사원 정보를 입력 받아 각
			객체에 저장하고 현재까지 기록된
			사원들의 정보 출력
			*
			*/
		
		//1. 3명의 학생 정보를 기록할 수 있게 객체 배열을 할당 
		// == Student 클래스 이용해서 객체를 만들거고 
		// 그 Student 객체가 3개가 들어올 수 있도록 Student 타입의 배열 만들라는 것 
		Student[] students = new Student[3];
		
		//1 - 2. 사용데이터를 참고하여 3명의 학생 객체 생성
		students[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		students[1] = new Student("김말똥", 21, 187.3, 80.0, 1, "경영학과");
		students[2] = new Student("강개순", 23, 167.0, 45.0, 1, "정보통신공학과");
		
		
		
			// 향상된 for문이란
			/*
			 * 자바에서 배열, 컬렉션과 같은 데이터를 순차적으로 간단하게 반복할 수 있는
			 * 구조를 제공하는 for문이다.
			 * 일반적인 for문보다 코드가 더 간결하고 가독성이 좋아서
			 * 반복 작업을 더 쉽게 작성할 수 있다.
			 * 
			 * for(데이터타입(자료형) 변수명 : 배열명or컬렉션명) {
			 * 		// 반복해서 실행할 코드;
			 * }
			 * 
			 * */
		//1 - 3. 반복문을 통해 출력
		for(Student std : students) {	//Student 타입의 studemts배열의 0번 인덱스부터 마지막 인덱스까지 접근하여 각각의 인덱스에 있는 객체를 불러와 std(변수)라고 부르겠다.
		System.out.println(std.information());
		
		}
		
		System.out.println("----------------------------------------");
		
		//최대 10명의 사원 정보를 기록할 수 있게 객체 배열을 할당
		// 하고 반복문을
		// 사용하여 키보드로 사원 정보를 입력
		// 받도록 구현
		//2명 정도의 사원 정보를 입력 받아 각 객체에 저장하고 현재까지 기록된
		// 사원들의 정보 출력
		
		
		// 2-1. 최대 10명의 사원 정보를 기록할 수 있게 객체 배열을 할당
		Employee[] emps = new Employee[10];
		
		// 2-2. 반복문을 사용하여 키보드로 사원 정보를 입력 받도록 구현
		// 사원들의 정보를 키보드로 계속 입력 받고 -> while(true) 무한 반복문을 통해
		// 계속 추가할 것인지 물어보고, 대소문자 상관없이 'y'이면 계속 객체 추가
		// 한 명씩 추가될 때마다 카운트하기.
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0; // 한 명씩 추가될 때마다 카운트하기. == 카운트용 변수 선언
		
		while(true) {
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.print("신장 : ");
			double height = sc.nextDouble();
			
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			
			System.out.print("부서 : ");
			String dept = sc.next();
			
			emps[count] = new Employee(name, age, height, weight, salary, dept);	// 새로운 Employ객체 생성, 매개변수 이용
			count++;
			// while문 처음 실행 시 count는 0이므로 0번 인덱스에 입력받은 회원 정보가 저장됨.
			// 2회차 대 count++로 1 증감받아 1번 인덱스에 입력받은 회원 정보가 저장됨.
			
			// 배열이 10칸 다 꽉 찼으면 반복을 종료 // 꽉 차면 바로 종료해야하니까 추가여부 묻는 코드보다 위에 위치해있어야함.
			if(emps.length == count) {
				break;
			}
			
			//------방법1------
			/*
			// 추가 여부 묻기 
			System.out.println("계속 추가하시겠습니까 (y/n) : ");
			String str = sc.next().toUpperCase(); // 소문자로 값이 입력되어도 대문자로 바꿔서 str에 저장해줌.
			//대소문자 상관없이 'y'이면 계속 객체 추가
			
			// String.toUpperCase() : n -> N
			// String.toLowerCase() : N -> n
			
			if(str.equals("N")) break; 
			*/
			//------다른 방법2--------------
			
			// 추가 여부 묻기
			System.out.println("계속 추가하시겠습니까 (y/n) : ");
			String str = sc.next(); // 소문자로 값이 입력되어도 대문자로 바꿔서 str에 저장해줌.
			//대소문자 상관없이 'y'이면 계속 객체 추가
			
			// String.toUpperCase() : n -> N
			// String.toLowerCase() : N -> n
			
			if(str.equalsIgnoreCase("N")) break; 
			// : str에 대문자가 들어왔든 소문자가 들어왔든 어쩃든 N이면 된다는 의미. 대소문자를 가리지 않음.
			/*
			 * -> equalsIgnoreCase() : 문자열을 비교하는 메서드인데, 대소문자를 구분하지 않고
			 *  두 문자열이 같은지 비교한다.
			 * */
			
		
		}
		// 2-3. 현재까지 기록된 사원들의 정보 모두 출력
		// 2명 정도 입력받은 상태에서 추가여부를 물을 때 n을 입력하면 emps 배열의 나머지 8칸은 null인것.
		for(Employee emp : emps) {	// emps의 모든 인덱스에 접근하는 것
			// [첫번째 EMP객체에 대한 주소, 두번째 EMP객체 주소, null, null.....10번째 EMP객체의 주소까지 null]인 상태
			// ==> 만약에 emp가 null이면 반복 종료하라는 조건을 붙어야함.
			if(emp == null) break; // null에 접근하면 NullPointException 오류가 발생하는데 해당 if문으로 오류 방지할 수 있음.
			
			
			System.out.println(emp.information());
		}
		
	}
}

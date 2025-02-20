package edu.kh.oop.cls.run;

import edu.kh.oop.cls.model.service.ClsService;
import edu.kh.oop.cls.model.vo.User;

public class ClsRun {
	public static void main(String[] args) {
		ClsService service = new ClsService();
		
		// service.ex2();
		// service.ex3();
		// service.ex4();
		// 프로그램 실행 순서
		// 1. 메인메서드 실행 : service.ex3();
		// 2. ex3 메서드에 해당하는 첫번째 코드 User u1 = new User(); 수행
		// 3. u1(참조변수겸 객체)이 참조하는 public User() { 실행 
		//    => "기본생성자로 User 객체 생성" 출력, 필드 초기화
		// 4. 다시 ClsService 클래스로 돌아와 User u1 = new User(); 아래 코드 수행
		//  => 그 아래에 있는 출력코드들 실행됨
		///////// 만나서 반복
		//  콘솔창에 출력될 때 위 과정의 실행 순서대로 출력됨.
		
		
		
		
	}
}

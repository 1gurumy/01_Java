package edu.kh.exception.model.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.AsynchronousSocketChannel;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionService {

	
	// 예외(Exception) : 개발자가 소스코드 수정 시 해결 가능한 오류
	
	// 예외는 두 종류로 구분된다.
	// 1) Unchecked Exception : 선택적으로 예외처리(ex. Runtime Exception) // 컴파일단계에서 에러가 뜨지 않으며 실행할 수 있음.
	// 2) checked Exception : 필수적으로 예외 처리해야함.(ex. IOException, 나머지..)
	
	private Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		// 두 정수를 입력받아 나누기한 몫을 출력
	
		System.out.print("정수 1 입력 : ");
		int input1 = sc.nextInt(); 
		// java.util.InputMismatchException => int 형이 아닌 다른 자료형을 (입력)대입했을 때 발생하는 오류
		
		System.out.print("정수 2 입력 : ");
		int input2 = sc.nextInt();
		// java.util.InputMismatchException => int 형이 아닌 다른 자료형을 (입력)대입했을 때 발생하는 오류
		
		//System.out.println("결과 : " + input1 / input2 ); 
		// java.lang.ArithmeticException: / by zero => 산술적 예외 발생 : input2에 0이 들어왔을 때 0으로 나눌 수 없다 : 
		
		
		// 예외처리 방법 1
		if(input2 != 0) {
			System.out.println("결과 : " + input1 / input2 ); 
			// java.lang.ArithmeticException: / by zero => 산술적 예외 발생 : input2에 0이 들어왔을 때 0으로 나눌 수 없다 : 
		} else {
			System.out.println("infinity");
		}
	
		
		// 예외처리 방법 2
		
		try {
			// 예외가 발생할 우려가 있는 코드
			System.out.println("결과 : " + input1 / input2 ); 
			
		} catch(ArithmeticException e) {
			// : try에서 던져진 예외를 catch문의 매개변수 e로 잡음.
			// e를 사용하여 예외 추적 코드를 작성할 수도 있음.
			System.out.println("infinity");
			
			e.printStackTrace(); // 예외발생 추적
			// printStackTrace(); => 발생한 예외에 대한 메서드와 위치에 대한 모든 내용을 출력
			// 예외 발생 지점을 추적하는 메서드이다.
			// at edu.kh.exception.model.service.ExceptionService.ex1(ExceptionService.java:44)
			// at edu.kh.exception.run.ExceptionRun.main(ExceptionRun.java:10)
			
		}
	
		// 발생하는 예외 중 일부 예외는 try-catch문을 사용하는 방법 외에도
		// if-else구문을 사용하여 예외 상황을 방지하는 것도 가능하다
		// 일부 예외 == 대부분 Unchecked Exception에 해당함
		
	
	}
	
	public void ex2() {
		// 여러 가지 예외에 대한 처리 방법
		
		try {
			System.out.print("정수 1 입력 : ");
			int input1 = sc.nextInt(); 
			// java.util.InputMismatchException => int 형이 아닌 다른 자료형을 (입력)대입했을 때 발생하는 오류
			
			System.out.print("정수 2 입력 : ");
			int input2 = sc.nextInt();
			// java.util.InputMismatchException => int 형이 아닌 다른 자료형을 (입력)대입했을 때 발생하는 오류
			
			System.out.println("결과 : " + input1 / input2 ); 
			// java.lang.ArithmeticException: / by zero => 산술적 예외 발생 : input2에 0이 들어왔을 때 0으로 나눌 수 없다 : 
			
			String str = null;
			System.out.println( str.charAt(0));
			
			// InputMismatchException, ArithmeticException 둘 다 RuntimeException의 후손
			// RuntimeException은 Exception의 후손
			
			// 가계도(상속관계)
			// Exception
			//    ㄴ RuntimeException
			//			ㄴ InputMismatchException, ArithmeticException // 형제관계라 위아래 위치 상관없음
			
			
			
		} catch(InputMismatchException e) {
			System.out.println("타입에 맞는 값만 입력하세요.");
			
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		
		} catch(RuntimeException e) { 
			System.out.println("잡았다!");
		// RuntimeException를 후손들보다 위에 쓸 경우 다형성에 의해 RuntimeException이 자손이 처리할 수 있는 예외를 다 처리해버렸기 때문에 아래에 작성한 후손들에 에러 뜸.
		
		} catch(Exception e) {
			// Exception 클래스 : 모든 예외의 최상위 부모
			// 다형성 - 업캐스팅(부모타입 참조변수로 자식객체 참조)에 의해 모든 예외를 잡을 수 있음.
								// Exception e = new RuntimeException
			
			// ** 상위 타입의 예외 클래스를 catch문에 작성하면
			//		다형성 업캐스팅에 의해 모두 잡아서 처리하는 것이 가능하다!
			// 최상위 부모 Exception 클래스 사용할 시 발생한 예외에 대해 알기 위해서는 e.printStackTrace(); 사용해야함.
		
			System.out.println("뭔지 모르겠으나 예외가 발생해서 처리함..");
			e.printStackTrace();
			// 발생한 예외에 대한 메서드와 위치에 대한 모든 내용 출력
			
		}
		
		
	}
	
	public void ex3() {
		// try - catch - finally
		// finally : try구문에서 예외가 발생하든 말든 무조건 마지막에 수행시킴
		try {
			System.out.print("정수 1 입력 : ");
			int input1 = sc.nextInt(); 
			// java.util.InputMismatchException => int 형이 아닌 다른 자료형을 (입력)대입했을 때 발생하는 오류
			
			System.out.print("정수 2 입력 : ");
			int input2 = sc.nextInt();
			// java.util.InputMismatchException => int 형이 아닌 다른 자료형을 (입력)대입했을 때 발생하는 오류
			
			//System.out.println("결과 : " + input1 / input2 ); 
			// java.lang.ArithmeticException: / by zero => 산술적 예외 발생 : input2에 0이 들어왔을 때 0으로 나눌 수 없다 : 
			
		} catch(ArithmeticException e) {
			System.out.println("산술적 예외 처리가 됨");
			
			// 매개변수 e : 예외 관련된 정보 + 예외 관련 기능 이용 할 수 있음.
			System.out.println( e.getClass() ); // 어떤 예외 클래스인가?
			// class java.lang.ArithmeticException
			
			System.out.println( e.getMessage() );	// 예외 발생 시 출력된 내용
			// / by zero
			
			
			System.out.println( e ); // e.toString() // toString 호출
			// java.lang.ArithmeticException: / by zero
			
	e.printStackTrace();
			
		} catch(InputMismatchException e) {
			System.out.println("숫자만 넣어라..");
			
		} finally {
			
			System.out.println("무조건 수행됨");
			sc.close();  // 스캐너 통로 닫기 : 메모리 누수 방지
			
		}
		
		
		
	}
	
	public void ex4() {
		
		try {
			methodA();
			
		} catch (Exception e) {
			System.out.println("methodC에서부터 발생한 예외를 ex4에서 잡아 처리함");
		}
		
		
		
		methodA();
	}
	
	public void methodA() throws IOException{
		methodB();
	}
	
	public void methodB() throws IOException{
		methodC();
	}
	
	public void methodC() throws IOException{
		// throws 이용해 예외 강제발생 시켜보기
		// -> 호출한 메서드에게 예외처리를 하라고 위임하는 행위
		
		
		
		//throw new IOException(); //IOException는 Checked Exception에 속해서 사용시 빨간줄(에러)이 뜸.
		throw new FileNotFoundException();
	}
	
	
	public void ex5() {
		// 사용자 정의 예외 클래스인 UserException 사용하여 강제 예외 발생시키기
		throw new UserException("사용자 정의 예외 발생")
		
		
	}
	
	
	
	
	
}
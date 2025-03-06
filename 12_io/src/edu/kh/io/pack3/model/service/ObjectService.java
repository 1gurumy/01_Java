package edu.kh.io.pack3.model.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import edu.kh.io.pack3.model.dto.Member;

public class ObjectService {

	/*
	 * ObjectInputStream / ObjectOutputStream
	 * 
	 * - Java 객체를 입/출력 할 때
	 * 	 사용하는 바이트 기반 "보조" 스트림
	 *  (보조 스트림은 단독 사용 불가능!)
	 * 
	 * *** 직렬화(Serializable) ***
	 * - 객체를 직렬(직선)형태로 변환
	 * 
	 * - 직렬화란 객체의 상태(필드값)를 바이트 스트림으로 변환하는 과정
	 * 이를 통해 객체는 메모리에서만 존재하는 것뿐만 아니라,
	 * 파일로 저장되거나 네트워크를 통해 전송될 수 있음
	 * 
	 * - 역직렬화는 바이트 스트림을 다시 객체 형태로 복원하는 과정
	 * 즉, 저장되거나 전송된 데이터(데이터 형태의 객체)를 원래의 객체 형태로 되돌리는 작업.
	 * 
	 * */
	
	/**
	 * 객체를 외부 파일로 출력
	 * 자바 프로그램 내부 -> 외부로 출력
	 * 					직렬화 필요!
	 * 객체 입출력(ObjectInputStream/ObjectOutputStream) 기능을 제공하는 보조스트림 사용하기
	 * 보조스트림은 혼자 사용할 수 없음. 기반스트림과 같이 사용해야만 함.
	 */
	public void objectOutput() {
		
		// 스트림 참조 변수 선언
		FileOutputStream fos = null;	// 기반 스트림
		ObjectOutputStream oos = null; // 객체 출력용 보조 스트림
		
		try {
			// .dat 확장자 : data를 담고있는 파일을 나타내는 확장자
			fos = new FileOutputStream("/io_test/20250305/Member.dat");	//기반 스트림 생성// OutputStream은 해당경로에 파일이 없으면 생성까지 해줌.
			
			oos = new ObjectOutputStream(fos);	// 객체 보조 스트림 생성.// 보조스트림이니까 기반 스트림fos 전달해주기.
			
			// Member 객체 하나 생성
			Member member = new Member("member01", "pass01", "김회원", 30);
			
			// ObjectOutputStream을 이용해서 Member 객체를 출력하기(파일로서 내보내기)
			oos.writeObject(member); // writeObject() : 출력(내보내기) 메서드 // member 객체를 연결된 경로의 파일로 내보냄(출력)
			// 
			// -> 직렬화 되지 않음
			// -> Member 클래스를 직렬화하기 위해 implements Serializable 해줘야함!
			
			
			System.out.println("회원 데이터 출력 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		
		} finally {
			
			try {
				if(oos != null) oos.close(); // 기반 스트림인 fos도 함께 닫힘.
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
		}
		
		
		
		
	}
	
	/**
	 * 외부 파일로부터 객체 입력 받기
	 * 
	 * 외부에서 -> 내부로 들여오는 것 ==> 역직렬화 필요
	 * 
	 * 
	 */
	public void objectInput() {
		
		//스트림 참조 변수 선언
		FileInputStream fis = null;	//기반
		ObjectInputStream ois = null;	//보조
		
		
		try {
			
			// 파일 입력 기반 스트림 생성
			fis = new FileInputStream("/io_test/20250305/Member.dat");	// InputStream은 생성은 안해줌.
												// 직렬화가 되어있는 파일
			// 객체 입력 보조 스트림 생성
			ois = new ObjectInputStream(fis);
			
			// 스트림을 이용해서 파일에 작성된 
			// 직렬화된 Member 객체를 읽어와
			// 역직렬화를 수행하여 정상적인 Member 객체로 변경
			
			// Object ois.readObject() : 직렬화된 객체를 읽어와 역직렬화해주는 메서드
			// 							+ Member객체로 변경(다운캐스팅)
			
			Member member = (Member)ois.readObject();
			
			// 읽어온 내용 확인
			System.out.println(member);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}finally {
			try {
				if(ois != null) ois.close();	// 보조 스트림만 닫아도 기반 스트림 함께 닫힘.
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
	
}

package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {
	
	
	
	public void practice1() {
		// 1) 기본 생성자를 이용하여 첫 번째 Book 객체 생성
		Book bk = new Book();
		
		// 2) 매개변수 생성자를 이용하여 두 번째 Book 객체 생성 (사용 데이터 참고)
		Book bk2 = new Book("자바의 정석", 30000, 0.2, "남궁성");
		
		// 3) 객체가 가진 필드 값을 toString()을 이용하여 출력
		System.out.println(bk.toString());
		System.out.println(bk2.toString());
		
		
		// 4) 첫 번째 객체가 가진 값을 setter를 이용하여 수정 
		// C언어 / 30000 / 0.1 / 홍길동
		bk.setTitle("C언어");
		bk.setPrice(30000);
		bk.setDiscountRate(0.1);
		bk.setAuthor("홍길동");
		
		// 5) 수정된 객체의 필드 값을 toString() 메소드를 이용하여 출력
		System.out.println("=============================");
		System.out.println("수정된 결과 확인");
		System.out.println(bk.toString());
		
		// 6) 각 객체의 할인율을 적용한 책 가격을 계산해서 출력
		// 7) 할인된 가격 = 가격 - (가격 * 할인율)
		//도서명 = C언어
		//할인된 가격 = 27000원
		//도서명 = 자바의정석
		//할인된 가격 = 24000원
		System.out.println("=============================");
		System.out.println("도서명 = " + bk.getTitle());
		System.out.printf("할인된 가격 = %d원\n",
				bk.getPrice() - (int)(bk.getPrice() * bk.getDiscountRate()));
		System.out.println("도서명 = " + bk2.getTitle());
		System.out.printf("할인된 가격 = %d원",
				bk2.getPrice() - (int)(bk2.getPrice() * bk2.getDiscountRate()));
		/// 정수형으로 강제형변환 하지 않으면 왜 오류가 뜨는건지 이해가 안됨
		/// 더 범위가 큰 double형으로 자동형변환 일어나서 실수값으로 나와야하는것 아닌지??
	}
	
}

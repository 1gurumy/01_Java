package com.hw1.run;

import com.hw1.model.dto.Book;
import com.hw1.model.dto.Novel;
import com.hw1.model.dto.Poetry;
import com.hw1.model.dto.Textbook;

public class Run {

	public static void main(String[] args) {
		
		//q Novel, Textbook, Poetry => 얘네 사용되는데 생성 안해줘도 됌?? 왜?? 왜 얘네 생성자 안써도 다 자동으로 임포트 되는것???
		//Novel novel = new Novel();	// 패키지가 다른 클래스
		//novel.displayInfor();
		//new Novel().displayInfor();
		
		// Textbook textbook = new Textbook();
		// textbook.displayInfor();
		// new Textbook().displayInfor();
				
		//Poetry poetry = new Poetry();
		//poetry.displayInfor();
		//new Poetry().displayInfor();
		
		// Book 객체배열 3칸 생성 후 각 인덱스마다 
		// Novel, TextBook, Poetry 생성하여 대입
		
		// 모든 도서 정보 출력
		
	//---------------------------------------------------
		
		// 1. Book 객체배열 3칸 생성
		Book books[] = new Book[3];
		
		
		/// 2. 각 인덱스마다 Novel, TextBook, Poetry 생성하여 대입
		books[0] = new Novel("해리 포터", "J.K ", "판타지");
		books[1] = new Textbook("자바 프로그래밍", "James Gosling", "컴퓨터 과학");
		books[2] = new Poetry("우리들의 사랑시", "김소월", 30);
		
		
		// 모든 도서 정보 출력
	    for(Book i : books) {
	    	i.displayInfor(); 
	    	
		} 
		
	    Novel test = new Novel();
	    
	    System.out.println("문자열 반환");
	    System.out.println(1);
	    
	    /*
	    import com.hw1.model.dto.Book;
	    import com.hw1.model.dto.Novel;
	    import com.hw1.model.dto.Poetry;
	    import com.hw1.model.dto.Textbook;
	    */
		
		
		
	}
}

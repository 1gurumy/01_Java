package edu.kh.oop.practice.run;

import edu.kh.oop.practice.model.service.BookService;
import edu.kh.oop.practice.model.service.HeroService;

public class PracticeRun {

	public static void main(String[] args) {
		
		BookService bs = new BookService();
		bs.practice1();
		
		// HeroService 객체를 생성한 후 practice() 메소드를 호출
		HeroService service = new HeroService();
		service.practice();
	}
	
}

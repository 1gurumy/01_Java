package edu.kh.poly.ex2.model.service;

import edu.kh.poly.ex2.model.dto.Animal;
import edu.kh.poly.ex2.model.dto.Fish;
import edu.kh.poly.ex2.model.dto.Person;

public class AbstractService {

	public void ex1() {
		
		
		// Animal a1 = new Animal(); // Animal 객체 생성
		// Cannot instantiate the type Animal
		// -> 객체화 할 수 없다는 에러 메세지
		
		// 부모타입 참조변수로서의 역할은 가능하기 때문에
		// Animal을 상속받아 미완성 되었던 부분을 구체적으로 구현한
		// 자식 클래스를 이용해 객체 생성
		
		
		
		/*Person p1 = new Person(); //p Person클래스에서 매개변수 생성자 틀에 맞춰서 출력이 되는건데
								// 출처따라가면 왜 기본생성자가 활성화는지?
		p1.setName("홍길동");
		p1.setType("척추동물 중 인간");
		p1.setEatType("잡식");
		
		Fish f1 = new Fish();
		
		f1.setType("척추동물 중 어류");
		f1.setEatType("잡식");
		*/
		
		System.out.println( p1.toString() );
		System.out.println( f1.toString() );

		
		
		
		
		// 추상클래스 + 다형성 함께 이용하기
		Animal a1 = new Person();	// 다형성 중 업캐스팅
		Animal a2 = new Fish();		// 다형성 중 업캐스팅
		
		// 메세지 화인하면 정적바인딩, 실제 실행시는 동적바인딩(오버라이딩 한 메서드 우선) 적용
		a1.ex();	
		a1.breath();
		a1.move();
		a1.eat();
		
		a2.ex();
		a2.breath();
		a2.move();
		a2.eat();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}

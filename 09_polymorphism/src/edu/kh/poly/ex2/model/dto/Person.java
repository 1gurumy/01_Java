package edu.kh.poly.ex2.model.dto;

public class Person extends Animal{
	// The type Person must implement the inherited abstract method Animal.move()
	// 부모 클래스의 추상 메서드 재정의(오버라이딩) 안 해서 뜨는 에러메세지.

	private String name;


	public Person() {}
	
	
	public Person(String type, String eatType, String name) {
	super(type, eatType);
	this.name = name;
}





	// 오버라이드 단축키 :// alt + shift + s -> Override/impleaments method... 클릭 -> Ok클릭
	public void eat() {
		System.out.println("숟가락, 젓가락 등 도구를 이용하여 먹는다");
		
	}

	@Override
	public void breath() {
		System.out.println("코와 입으로 숨쉰다.");		
	}

	@Override
	public void move() {
		System.out.println("이족보행한다.");
	}
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Person : " + super.toString() + " / " + name; 
						// type + " / " + eatType
	}
	
	
	
	
	

}

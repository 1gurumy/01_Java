package edu.kh.inheritance.model.dto;


	// final  클래스 : 상속불가(누군가의 부모가 될 수 없다)
	// -> 제공되는 클래스 그대로 사용해야하는 경우
	// ex) String 클래스
public /*fina*/l class Imployee extends Person{
	
	/* 가계도(상속 관계)
	 * Object
	 * 		ㄴ Person
	 * 			ㄴ Imployee
	 * 
	 * */
	
	// 필드 // Person을 상속받았으니까 이름, 나이, 국적 안써도 됌.
	private String company;	// 회사명
		// 자료형이 String이므로 
	
	public Imployee() {} // 필요없으면 안만들어도 됌?
	
	
	public Imployee(String name, int age, String nationality, 
			String company) {
		super(name, age, nationality);	// Person 매개변수 생성자 의미
		this.company = company;
	}
	
	
	
	
	
	// Person으로 부터 상속받은 메서드 중
	// move() 메서드를 Employee에 맞게 재정의(==오버라이딩)해보기
	
	// @Override 어노테이션의 역할 : 해당 메서드가 오버라이딩 되었음을
	// 컴파일러에게 알려주는 역할
	// -> 컴파일러에게 !문법체크!를 하도록 알린다.
	// 문법체크 :
	// -> 부모에게 해당 메서드가 있는지 체크
	// -> 이름, 매개변수 타입과 개수가 일치하는지 여부 검사
	
	/*@Override
	public void move(String str, int num) {
		 System.out.println("오버라이딩 된 move()");
		 System.out.println("효율적으로 빨리 일하고 퇴근한다.");
		 }
		*/
	
	//Ctrl + space => 오버라이드 가능한 메서드 목록 뜸
	@Override
	public void move(String str, int num) {
		// super.move(str, num); -> 안 쓰고 싶으면 지워도 됌.
	// super. == super 참조변수 == 상속관계에서 부모 객체를 가리키는 참조변수
		System.out.println("오버라이딩된 move()");
		System.out.println("효율적으로 빨리 일하고 퇴근한다");
	}
		
	
	


	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " / " + company;
	}
	
	/*
	 * final 메서드 -> 오버라이딩 불가
	 * - 메서드의 기능이 변하면 안되는 경우
	 * 
	 * 
	 * 
	 * */
	public final void onlyEmployee() {
		System.out.println("final 메서드입니다");
		
		
	}
	
	
	
	
	
	
	
}

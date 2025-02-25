package edu.kh.inheritance.model.dto;

/* 가계도(상속관계)
 * Object
 * 	ㄴ Person
 * 		ㄴ Student
 * 
 * */






// 상속 방법: 자식클래스 extends 부모클래스
public class Student extends Person{
	// Student라는 클래스에 Person클래스의 내용을 확장한다/연장한다.
	// == Student 클래스에 Person 클래스의 필드, 메서드를 추가하여 확장한다. == Person 클래스의 필드, 메서드를 사용할 수 있게 됬다는 뜻
	
	
	// 속성(필드)						// Person 클래스의 상속을 받으므로
	/*private String name;			//이름 Person 클래스의 필드에 
	private int age;				//나이 이미 있는 속성이므로
	private String nationality;		//국적 적지 않아도 된다.
	*/	
	private int grade;				//학년
	private int classRoom;		//반
	
	public Student() {}
	
	
	
	
	/*
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}*/



	public Student(String name, int age, String nationality, 
		int grade, int classRoom) {
		
		
		/* 왜 안될까?
		// -> this 참조변수는 본인 자신만을 의미함. Student 필드만 의미한다.
		// -> 상속을 받았어도 name, age, nationallity는 부모의 고유필드이기 때문에
		// 자식인 Student에서 this 참조변수를 이용해 직접 접근 불가
		this.name = name;
		this.age = age;
		this.nationality = nationallity;
		
		
		
		// 부모의 setter를 이용할 수는 있지만 일일이 작성해야하므로 비효율적임.
		setName(name);
		setAge(age);
		setNationality(nationality);
		*/
		
		// super(); / 부모의 기본생성자 의미
		// super(매개변수...); : 부모의 매개변수 생성자 의미
		
		
		super(name, age, nationality); //// Person의 매개변수 생성자라는 의미 // 부모 생성자는 가장 첫줄에 위치해야함. 안그러면 오류
		this.grade = grade;		
		this.classRoom = classRoom;
	}




	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() // == name + " / " + age + " / " + nationality;
		// 부모인 Person클래스에서 이미 재정의를 했기 때문에 Ctrl 누른채 super클릭하면 Person클래스로 이동됨.
		+ " / " + grade + " / " + classRoom;
	
	}
	// 이름 / 나이/ 국적/ 학년 /반
	
	
	}
	
	


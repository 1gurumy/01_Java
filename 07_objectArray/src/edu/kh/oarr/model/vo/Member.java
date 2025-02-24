package edu.kh.oarr.model.vo;

public class Member {

	// 속성(필드 == 멤버변수)
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	private String region;	// 지역(서울, 경기, 충북, 강원..)
	
	
	// 기능(메서드, 생성자)
	// 생성자
	// 기본생성자, 매개변수 생성자
	// 생성자 작성 규칙
	// 1. 생성자 이름은 클래스명과 같다.
	// 2. 반환형이 없다.
	// 3. ** 기본생성자는 컴파일러가 자동으로 생성해준다. ** 
	// 만약 다른 생성자가 하나라도 있으면 기본생성자 자동생성 안 해준다.
	// -> 매개변수 생성자가 있다면, 프로그래머가 필요 시 기본생성자를 직접 만들어야 한다.
	
	
	// 기본생성자
	public Member() {}

	// (모든 필드 초기화용)매개변수 생성자
	// 오버로딩 : 같은 클래스 내 동일한 생성자명, 메서드명 등을 이용할 수 있는 기법
	// 오버로딩 성립조건 : 매개변수의 개수, 순서, 타입 중 하나라도 달라야 한다. 
						 // + 생성자명(메서드명) 이름 같아야 한다.
	public Member(String memberId, String memberPw, String memberName, int memberAge, String region) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.region = region;
	}

	
	// 메서드
		// getter / setter 
		// -> 필드에 선언된 멤버변수들이 캡슐화 원칙에 의해서 private로 선언되었으므로
		// -> private은 다른 클래스에서 직접 접근이 불가함,
		// -> 간접 접근 방식으로 값을 세팅/얻어올 수 있도록 메서드를 만들어 제공한다.
		// -> 그 메서드가 getter/setter이다. getter/setter의 접근제한자는 
		// 외부에서 접근이 가능해야 하므로 public이어야 한다.
	
	public String getMemberId() {
		  // 반환형(== 반환값의 형태, 반환값의 자료형)
	      // : String 자료형인 값을 호출한 쪽으로 되돌려준다는 것이다.
		return memberId;	// memberId가 String타입이라는 뜻
		// return memberId; : 해당 메서드를 바로 종료하고 해당 메서드를 호출한 쪽으로 memberId를 가지고 되돌아감.
		// int a; -> 메서드가 종료되었기 때문에 오류가 뜬다.
	}

	public void setMemberId(String memberId) {
		// 반환형 void : 반환형이 없다.
		this.memberId = memberId;
		// return; 이 생략된 형태. 직접 return;을 작성해도 오류가 뜨진 않음.
		// 모든 메서드는 종료 시 호출한 곳으로 돌아가는 return; 구문이 작성되어야 하지만.
		// 반환형이 void일 경우 컴파일러가 자동으로 추가해준다.
		
		
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
	
}

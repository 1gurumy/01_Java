package edu.kh.oop.method.model.vo;

public class Member {	// 회원 클래스
	// 속성 + 기능 필요!
	
	
	// 필드 ( == 속성)
	private String memberId; 	// 아이디
	private String memberPw;	//비밀번호
	private String memberName;	//이름
	private int memberAge;		//나이
	
		
		// 생성자 ( == 기능)
		// 생성자 규칙 : 반환형이 없고, 클래스명과 이름이 같아야 한다.
		// ctrl + space -> enter
		public Member() {}
		// 기본 생성자는 없으면 컴파일러가 자동으로 생성해주지만,
		// 매개변수생성자가 하나라도 있다면 기본생성자 자동 생성 안해준다.
		//  다른 클래스에서 new 연산자를 이용해 객체 생성한 상태였고 객체 클래스에서 매개변수가 있는 메서드를 입력한 상태라면 기본생성자 반드시 직접 작성해야 한다.
		
		// 매개 변수 생성자 (모든 필드 초기화용)
		public Member(String memberId, String memberPw, String memberName, int memberAge) {
			// 오버로딩 적용 조건
			// 1. 이름이 같아야 한다.
			// 2. 매개변수의 개수, 타입, 순서 중 하나라도 달라야 함.
			
			super();
			this.memberId = memberId;
			this.memberPw = memberPw;
			this.memberName = memberName;
			this.memberAge = memberAge;
		}
		
		
	// 메서드 ( == 기능)
	// getter / setter 는 메서드 영역
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberId() {
		return memberId;
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
	
}

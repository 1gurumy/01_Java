package edu.kh.oarr.model.service;

import java.util.Arrays;
import java.util.Scanner;

import edu.kh.oarr.model.vo.Member;

public class MemberService {

	// 속성(필드)
	private Scanner sc = new Scanner(System.in);
	
	// 회원가입한 사람의 정보를 저장해둘 참조변수
	// Member 5칸짜리 객체배열 선언 및 할당
	private Member[] memberArr = new Member[5]; // 생성자 아님 []있으니까 배열 
	// memberArr 배열은 Member의 객체를 참조하는 참조변수 겸 객체이므로 기본값이 null이다.
	
	// 현재 로그인한 회원의 정보를 저장할 참조 변수 선언
	private Member loginMember = null;	//q 초기화를 왜 해야하나? 선언만 해놓고 나중에 필요할때 초기화해도 되는거 아닌지
	
	public MemberService() {	// 기본생성자	//q 필드인데 왜 private 안쓰고 public 썼는지?
	
		// memberArr 배열 0, 1, 2 인덱스 초기화
		memberArr[0] = new Member("user01", "pass01", "홍길동", 30, "서울");	// 생성자임. Member에서 매개변수 생성자 이용해서 객체(배열) 생성한 것.
		memberArr[1] = new Member("user02", "pass02", "계보린", 25, "경기");
		memberArr[2] = new Member("user03", "pass03", "고길동", 45, "강원");
	
	}	
	
	// 기능 영역
	/*
	 * public void ex() {
		System.out.println(Arrays.toString(memberArr)); // 출력 시 기본값 null 5칸 나오는 것을 확인할 수 있음.
	}
	*/
	// 메뉴출력용 메서드
	public void dispalyMenu() {
		
		int menuNum = 0; // 메뉴 선택용 변수
		
		
		do {	// 무조건 한번은 반복
			System.out.println("===회원 정보 관리 프로그램 vw===");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 검색(지역)");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 입력 : ");
			menuNum = sc.nextInt();
			// 입력 버퍼에 남은 개행문자 제거
			sc.nextLine();
			
			switch(menuNum) {
			case 1 : System.out.println(signUp()); break;
			case 2 : System.out.println( login() ); break;
			case 3 : System.out.println( selectMember() ); break;
			case 4 : 
				
				int result = updateMember(); // -1, 0, 1
				
				if(result == -1) {
				System.out.println("로그인 후 이용바람");
				
			} else if(result == 0) {
				System.out.println("회원 정보 수정 실패(비밀번호 불일치)");
				
			} else {
				// result == 1
				System.out.println("회원 정보가 수정되었습니다! :)");
			}
			break;
			
		case 5 : searchRegion(); break;
		case 0 : System.out.println("프로그램 종료..."); break;
		default : System.out.println("잘못 입력하셨습니다. 다시 입력하세요!");
		}
		
	} while(menuNum != 0); // menuNum이 0이 되면 반복 종료
	
}
	
	// 회원가입 메서드의 서브 메서드// memberArr의 빈 공간의 인덱스 번호를 얻어오기// 되돌려주는 값이 인덱스 번호이기 때문에 int형
	// 단, 비어있는 인덱스가 없다면 -1 반환.		////////////////왜?????
	public int emptyIndex() { 
								
		// memberArr 배열을 0번 인덱스부터 끝까지 접근해서
		// 참조하는 값이 null인 경우의 인덱스를 반환
								// 길이 5
		for(int i = 0; i < memberArr.length; i ++) {
			
			if(memberArr[i] == null) {
				return i;	//////////////얘를 호출한 곳이 어딘데????
				// 현재 메서드 종료하고 호출한 곳으로 i값을 가지고 돌아감
				
				
			}
		}
		
		// for문을 수행했지만 return이 되지 않은 경우 해당 위치의 코드가 수행된다.
		// -> for문에서 return되지 않았다 == 배열에 빈칸이 없다.
		return -1;
		
	}
	
	// 회원 가입용 매서드
	public String signUp() {
		
		System.out.println("\n=========회원 가입==========");
		
		
		// 객체배열 memberArr에 새로 가입할 회원 정보를 저장할 예정
		// -> memberArr 배열에 빈자리가 있는지 확인(새로운 회원을 받아줄 자리가 있는지)
		// -> 빈 공간의 인덱스 번호를 얻어오기
		// => 인덱스 번호를 불러올 메서드를 위에다 생성       ///////////////왜??????? 여기다 하면 안됌?????
		int index = emptyIndex();	// memberArr배열에서 비어있는 인덱스 반환받음
									// 없다면 -1 반환
		
		
		if(index == -1) {	// 비어있는 공간 없음 -> 회원가입 불가
			return "회원가입 불가능합니다(인원 수 초과)";
			
		}
		
		// 회원 가입 가능일 때
		System.out.println("아이디 : ");
		String memberId = sc.next();
		
		System.out.println("비밀번호 : ");
		String memberPw = sc.next();
		
		System.out.println("비밀번호 확인 : ");
		String memberPw2 = sc.next();
		
		System.out.println("이름 : ");
		String memberName = sc.next();
		
		System.out.println("나이 : ");
		int memberAge = sc.nextInt();
		
		System.out.println("지역 : ");
		String region = sc.next();
		
		// 비밀번호, 비밀번호 확인이 일치하면 회원가입 진행
		// 일치하지 않으면 회원가입 실패
		if(memberPw.equals(memberPw2)) {	// 일치하는 경우
			
			// 새로운 Member 객체 생성해서 할당된 주소를
			// memberArr의 비어있는 인덱스에 대입
			memberArr[index] = new Member(memberId, memberPw, memberName, memberAge, region);
			
			return "회원 가입 성공!!!";
			
			
		}else {	// 불일치하는 경우
			return "회원 가입 실패!! (사유: 비밀번호 불일치)";
		}
		
		
	
		
		
		
		
		
	}
	

	// 로그인 메서드
	public String login() {
		
		System.out.println("\n=============로그인==============");
		
		// 1) 아이디, 비밀번호 입력받기
				System.out.print("아이디 입력 : ");
				String memberId = sc.next();
				
				System.out.print("비밀번호 입력 : ");
				String memberPw = sc.next();
				
				// 2) memberArr 배열 내 요소를 순서대로 접근하여 
				for(int i = 0; i < memberArr.length; i++) {
					
					// 2-1) 현재 접근한 요소가 null이 아닌지 확인
					if(memberArr[i] != null) { // 회원 정보가 있을 경우
						// 2-2) 회원정보가 있을경우
						//		-> 회원정보의 아이디, 비밀번호와
						//		입력받은 (로그인)아이디, 비밀번호가 같은지 비교
						if(memberArr[i].getMemberId().equals(memberId) && 
							memberArr[i].getMemberPw().equals(memberPw) ) {
							// 2-3) 같다면 로그인 회원 정보 객체를 참조할 변수 loginMember에
							//		현재 접근중인 memberArr[i] 요소에 저장된 주소를 얕은 복사
							loginMember = memberArr[i];
							break; // 더이상 같은 아이디, 비밀번호가 없기때문에 효율을 위해 for문 종료
						}
						
					}
				}
				
				// 3)   로그인 성공/실패 여부에 따라 결과 값 반환
				//		-> 로그인 성공 : 홍길동님 환영합니다!
				//		-> 로그인 실패 : 아이디 또는 비밀번호가 일치하지 않습니다.
				if(loginMember == null) { // 실패
					return "아이디 또는 비밀번호가 일치하지 않습니다.";
					
				} else { // 성공
					return loginMember.getMemberName() + "님 환영합니다!";
					
				}
				
			}
		
	// 회원 검색(지역) 메서드
	public void searchRegion() {
		
		System.out.println("\n================회원 검색(지역)======================");
		 System.out.println("검색할 지역을 입력하세요 : ");
		 String inputRegion = sc.next();
		 
		 
		 // 1) memberArr 배열의 모든 요소 순차 접근
		 boolean flag = true; // 검색 결과 신호용 변수		// true일때 일치하는 결과 찾지 못했다는 전제
		 
		
		 for(int i = 0; i < memberArr.length; i++) {
			 // 2) memberArr[i] 요소가 null인 경우 반복 종료
			 if(memberArr[i] == null) {			// 회원가입 안된 index는 걸러버림.
				 break;
			 }
			// 3) memberArr[i]요소가 null이 아니라면
			 //	memberArr[i] 요소에 저장된 지역(region)이
			 // 입력받은 지역(inputRegion)과 같을 경우
			 // memberArr[i] 요소에 저장된 객체의
			 // 회원의 아이디, 이름을 출력
			 if(memberArr[i].getRegion().equals(inputRegion)) {	// 회원가입 된 index 중에서 내가 검색한 지역과 일치하는 지역을 가지는 index이면 
				 System.out.printf("아이디 : %s, 이름 : %s\n", 
						 memberArr[i].getMemberId(), 
						 memberArr[i].getMemberName());
				 
				 flag = false; // 찾았다는 신호 	/////////////////////// 내가 검색한 결과랑 회원 정보가 일치하면 flag는 flase.
			 }
			 
		 }
		 
		 // flag가 ture이면 검색결과 못찾음
		 // flag가 false이면 검색결과 찾음
		 
		 

		 // 4) 입력한 지역과 일치하는 회원이 없다면 
		 //    일치하는 검색결과가 없습니다! 출려																			// 초기값 true가 유지된 상태
		 if(flag) {										//////////////////////// flag가 false이면 해당 if문 내부코드 수행안됌. / flag가 true일때만 수행됨.
			 System.out.println("일치하는 검색결과가 없습니다!");
		 }
		 
	}
	
	
	
																		// 초기값 true가 유지된 상태
	
	public void ex() {	//q 이건 왜쓴거지?? 
		System.out.println(Arrays.toString(memberArr));
	}
	
 	/*
 	 * 회원 정보 조회 메서드명 : selectMember() 
 	 * 					반환형 : String
 	 * 
 	 * ======회원 정보 조회=======
		로그인 후 이용바람
 	 * 
		======회원 정보 조회=======
		이름 : 홍길동
		아이디 : user01
		나이 : 30
		지역 : 서울
 	 * 
 	 * */
 	//회원 정보 조회 메서드
 	public String selectMember() {
 		
 		System.out.println("\n======회원 정보 조회=======");
 		
 		// 1) 로그인 여부 확인
 		// -> 필드 loginMember가 참조하는 객체가 있는지 확인
 		if(loginMember == null) {
 			return "로그인 후 이용바람";
 		}
 		
 		// 2) 로그인이 되어있는 경우
 		// 		현재 로그인한 회원의 정보를 출력할 문자열을 만들어서 반환
 		//		이름, 아이디, 나이, 지역
 		
 		String str = "이름 : " + loginMember.getMemberName();
 		str += "\n아이디 : " + loginMember.getMemberId();
 		str += "\n나이 : " + loginMember.getMemberAge();
 		str += "\n지역 : " + loginMember.getRegion();
 		
 		return str;
 		
 	}
 	
	// 회원 정보 수정 메서드
 	public int updateMember() {	// 
 		System.out.println("\n======회원 정보 수정=======");
 		
 		// 1) 로그인 여부 판별
 		if(loginMember == null) {
 			return -1;
 		}
 		
 		// 2) 로그인 된 경우
 		//    수정할 회원 정보 입력 받기(이름, 나이, 지역)
 		System.out.print("수정할 이름 입력 : ");
 		String inputName = sc.next();
 		
 		System.out.print("수정할 나이 입력 : ");
 		int inputAge = sc.nextInt();
 		
 		System.out.print("수정할 지역 입력 : ");
 		String inputRegion = sc.next();
 		
 		// 3) 비밀번호를 입력받아서
 		//	  로그인한 회원의 비밀번호와 일치하는지 확인
 		System.out.print("비밀번호 입력 : ");
 		String inputPw = sc.next();
 		
 		// 4) 비밀번호가 같을 경우
 		//    로그인한 회원의 이름, 나이, 지역 정보를 입력받은 값으로 변경 후
 		//	  1 반환
 		if( inputPw.equals(loginMember.getMemberPw()) ) {
 			
 			loginMember.setMemberName(inputName);
 			loginMember.setMemberAge(inputAge);
 			loginMember.setRegion(inputRegion);
 			
 			return 1;
 			
 		} else { // 다를 경우
 			// 5) 비밀번호가 다를 경우 0 반환
 			return 0;
 		}
 		
 		
 	}
 	
 	/* 회원 정보 수정 메서드명 : updateMember()
 	 * 					반환형 : int 
 	 *	1) 로그인이 되어있지 않으면 -1 반환
 	 *  2) 비밀번호가 다른경우 0 반환
 	 *  3) 비밀번호가 같을경우(수정이루어짐) 1 반환
 	 * 
 	 * 
 	 * ======회원 정보 수정=======
		로그인 후 이용바람
 	 * 
 	 * 
 	 * ======회원 정보 수정=======
		수정할 이름 입력 : 홍길자
		수정할 나이 입력 : 31
		수정할 지역 입력 : 경기
		비밀번호 입력 : pass02
		회원 정보 수정 실패(비밀번호 불일치)
		
		
		======회원 정보 수정=======
		수정할 이름 입력 : 홍길자
		수정할 나이 입력 : 31
		수정할 지역 입력 : 경기
		비밀번호 입력 : pass01
		회원 정보가 수정되었습니다! :) 
 	 * 
 	 * */
	
}
	
	


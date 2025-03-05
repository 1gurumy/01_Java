package com.hw3.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class BookService {

	private List<Book> books = new ArrayList<>();	// 도서(객체) 목록 저장할 리스트 생성
	// List <Book>타입 컬렉션 - ArrayList 선언, 참조변수 books가 이 List <Book>타입 컬렉션 - ArrayList의 주소값 참조함.
	// List(부모)타입 부모타입참조변수 = new 자식타입  --=> 다형성 중 업캐스팅 적용상태.
	
	private Scanner sc = new Scanner(System.in);	// 스캐너
	
	// 기본생성자
	public BookService() {
		// Book의 매개변수 생성자 이용해서 도서목록 리스트에 도서 객체 5개 생성
		// -> 매개변수에 따라 다르게 초기화해야 하므로 생성자 내에서 초기화하는 것.
		this.books.add(new Book(1111, "세이노의 가르침", "세이노", 6480, "데이원"));
		this.books.add(new Book(2222, "문과남자의 과학공부", "유시민", 15750, "돌베개"));
		this.books.add(new Book(3333, "역행자", "자청", 17550, "웅진지식하우스"));
		books.add(new Book(4444, "꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들"));
		books.add(new Book(5555, "도둑맞은 집중력", "요한 하리", 16920, "어크로스"));

}
	
	
	/**
	 * 메인 화면 
	 * 입력한 번호에 따라 각각 다른 기능 수행
	 * -> switch문 사용, 각각의 번호에서 기능 수행할 메서드 호출
	 * 
	 */
	public void displayMenu() {
		int input;	//q 메뉴 선택용 변수 //변수를 초기화하지 않고 사용하려고 하면 컴파일 에러가 발생하기 때문에 초기화해주는 것.
		do {  // 0번을 입력하기 전까지 반복할건데 그 반복 횟수가 정해지지 않았으며, 메뉴 번호를 입력하지 않아도 
			  // 반드시 콘솔창에 메인화면이 출력되어야 하므로 do while문 사용
		System.out.println("===도서 등록 프로그램===");
		System.out.println("1. 도서 등록");
		System.out.println("2. 도서 조회");
		System.out.println("3. 도서 수정");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 즐겨찾기 추가");
		System.out.println("6. 즐겨찾기 삭제");
		System.out.println("7. 즐겨찾기 조회");
		System.out.println("8. 추천도서 뽑기");
		System.out.println("0. 프로그램 종료");
		System.out.print("메뉴를 입력하세요 : ");
		input = sc.nextInt(); // 번호 입력받기
		
		switch(input) { // 입력받은 번호에 따라 각각의 기능 수행할 메서드 호출
			case 1 :	addBook(); /*1. 도서 등록*/ break;
			case 2 :	showBooks();/*2. 도서 조회*/ break;
			case 3 :	/*3. 도서 수정*/
			case 4 :	/*4. 도서 삭제*/
			case 5 :	/*5. 즐겨찾기 추가*/
			case 6 :	/*6. 즐겨찾기 삭제*/
			case 7 :	/*7. 즐겨찾기 조회*/
			case 8 :	/*8. 추천도서 뽑기*/
			case 0 :	System.out.println("프로그램 종료..");
			default :	/*0 ~ 8 사이에 있는 번호가 아닌 다른 번호를 입력한 경우*/
						System.out.println("메뉴에 있는 번호만 입력해주세요."); break;
		}
		}while(input != 0);	// 0번을 입력하기 전까지 반복. 0번 입력받으면 반복 종료.
	}
	
	/**
	 * 1. 도서 등록
	 */
	public void addBook() {
		System.out.println("등록할 도서의 정보를 입력해주세요.");
		
		System.out.print("도서 번호 : ");
		int bookNum = sc.nextInt(); 	// 등록할 도서의 번호 입력받기
		sc.nextLine();	// 입력버퍼에 남은 개행 문자 제거용
		
		System.out.print("도서 제목 : ");
		String title = sc.nextLine();	// 등록할 도서의 제목 입력받기
		
		System.out.print("저자 : ");
		String author = sc.nextLine();	// 등록할 도서의 저자명 입력받기
		
		System.out.print("가격 : ");
		int price = sc.nextInt(); 		// 등록할 도서의 가격 입력받기
		sc.nextLine(); // 입력 버퍼에 남은 개행 문자 제거용
		
		System.out.print("출판사 : ");
		String publisher =  sc.nextLine();	// 등록할 도서의 출판사 입력받기
		
		Book addBook = new Book(bookNum, title, author, price, publisher); // 입력받은 정보를 토대로 새로운 도서 객체 생성
		
		books.add(addBook);	// 새로 생성한 도서 객체를 도서 목록 리스트에 추가
		
		//q	return "등록 완료";	// 등록 과정 완료 시 "등록 완료" 문자열 반환
		System.out.println("등록 완료");
		
	}
	
	/**
	 * 2. 도서 조회
	 * 등록된 도서 목록들을 보여줄 메서드
	 * 등록되어 있는 도서가 있다면 목록을 모두 보여주기 -> if문, for문 사용
	 * 등록되어있는 도서가 없으면 "등록된 도서가 없습니다. 도서를 등록해주세요!" 출력 -> else
	 */
	public void showBooks() {
		System.out.println("====도서 목록====");
		
		if(!books.isEmpty()) {	// 등록된 도서가 하나라도 있으면
			for(Book i : books) {
				System.out.println(i); 	
			// => books.toString() 객체 출력할때는 toString 메서드가 묵시적으로 작성되어있음.
				// Book클래스에서 재정의한 toString()메서드를 토대로 도서 정보 출력
			}
			
		} else { // 등록되어 있는 도서가 전혀 없으면
			System.out.println("등록된 도서가 없습니다. 도서를 등록해주세요!");
		}
		
	}
	
	/**
	 * 3. 도서 수정
	 * 수정하고 싶은 도서의 도서 번호 입력받기 
	 * -> 입력받은 번호랑 도서 리스트에 있는 도서의 도서번호 중 일치하는 게 있는지 찾기 -> for문(도서리스트 다 뒤져봐야 하므로), if문 사용
	 * --> 있으면 해당 도서 정보 보여주기 / 없으면 "해당하는 도서가 없습니다"
	 * 일치하는게 있다면 해당 1. 도서의 번호, 2. 제목, 3. 저자, 4. 가격, 5. 출판사 중에서 수정하고 싶은 것 번호로 입력받기.
	 * 입력받은 수정사항 반영하기
	 */
	public void editBook() {
		System.out.println("===도서 수정===");
		
		System.out.print("수정할 도서의 도서 번호 입력: ");
		int bookNum = sc.nextInt();	// 수정하고 싶은 도서의 도서 번호 입력받기
		
		if(bookNum != ) {
			
		}
		
	}
	
}


/*--------------------------------------------------------------------------------------------
package com.hw3.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class BookService {

	private List<Book> books = new ArrayList<>(); 	// 도서 목록 저장할 List 생성	
	// : Book(사용자 정의 자료형)타입 ArrayList 컬렉션 생성. ArrayList 컬렉션의 주소값을 참조변수 books가 참조한다.
	
	private Scanner sc = new Scanner(System.in);	// 스캐너
	
	private List<Book> favBook = new ArrayList<Book>();	// 즐겨찾기 저장용 List 생성
	// : Book타입 ArrayList 컬렉션 생성. 이 ArrayList 컬렉션의 주소값을 참조변수 favBook가 참조한다.
	
	
	
	/**
	 * 메인 화면
	 */
	public void mainDisplay() {
		
		int input = 0; // 메뉴 선택용 변수
		do { // 반복 횟수가 정해지지 않았으며, 메뉴 번호를 입력하지 않아도 반드시 콘솔창에 메인화면이 출력되어야 하므로 do while문 사용
			System.out.println("===도서 목록 프로그램===");
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 조회");
			System.out.println("3. 도서 수정");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 즐겨찾기 추가");
			System.out.println("6. 즐겨찾기 삭제");
			System.out.println("7. 즐겨찾기 조회");
			System.out.println("8, 추천도서 뽑기");
			System.out.println("0. 프로그램 종료");
			
			System.out.println("메뉴를 입력하세요 : ");
			input = sc.nextInt();
			
			switch(input) {
				case 1: System.out.println(addBook()); break;	
				// 1 입력한 경우 addBook() 메서드 실행. 해당 메서드에서 문자열을 반환하므로 그 문자열을 출력하기 위해 print구문 이용
				case 2: showBook(); break;	
				// 2 입력한 경우 showBook() 메서드 실행
				case 3: System.out.println(editBook()); break;	
				// 3 입력한 경우 editBook() 메서드 실행. 해당 메서드에서 문자열을 반환하므로 그 문자열을 출력하기 위해 print구문 이용
				case 4:	System.out.println(deleteBook()); break;
				// 4 입력한 경우 deleteBook() 메서드 실행. 해당 메서드에서 문자열을 반홚하므로 그 문자열을 출력하기 위해 print구문 이용.
				case 5: System.out.println(addFav()); break;
				// 5 입력한 경우 addFav() 메서드 실행. 해당 메서드에서 문자열을 반환하므로 그 문자열을 출력하기 위해서 print구문 이용.
				case 6: System.out.println(deleteFav()); break;
				// 6 입력한 경우 deleteFav() 메서드 실행. 해당 메서드에서 문자열을 반환하므로 그 문자열을 출력하기 위해서 print구문 이용.
				case 7: showFav(); break; 
				// 7 입력한 경우 showFav() 메서드 실행.
				case 8: randomBook(); break;
				// 8 입력한 경우 randomBook() 메서드 실행.
				case 0: System.out.println("프로그램을 종료합니다...") ;break;
			}
			
		} while(input != 0); // 0번을 입력하기 전까지 무한 반복
		
	}
	
	
	/**
	 * 1. 도서 등록 
	 */
	public String addBook() {
		System.out.println("등록할 도서 정보를 입력하세요.");
		
		System.out.print("도서 번호 : ");
		int bookNum = sc.nextInt();		 // 등록할 도서의 번호 입력
		
		System.out.print("도서 제목 :");
		String title = sc.nextLine();	 // 등록할 도서의 제목 입력
		
		System.out.print("저자 : ");
		String author = sc.nextLine(); 	 // 등록할 도서의 저자 입력
		
		System.out.print("가격 : ");
		int price = sc.nextInt();		 // 등록할 도서의 가격 입력
		
		System.out.println("출판사 : ");	
		String publisher = sc.nextLine();// 등록할 도서의 출판사 입력
		
		//List<Book> books = new ArrayList<>()
		Book addBook = new Book(title, author, price, publisher, bookNum);
		// Book 매개변수 생성자 이용해서, 입력한 값들을 요소로 한 새로운 객체 생성
		
		books.add(addBook);
		// 새로 생성한 객체를 books List에 추가
		
		return "등록 완료되었습니다.";	// case문 1번에서 addBook() 메서드를 호출하였으므로
										// 해당 메서드의 입력 과정 완료 시 "등록 완료되었습니다."가 case문 1번으로 되돌아감.
		
	}
	
	/**
	 * 2. 도서 조회
	 */
	public void showBook() {
		System.out.println("===도서 조회===");
		
		if(books.isEmpty()) {	// books 리스트가 비어있으면
			System.out.println("등록된 도서가 없습니다. 도서를 추가해주세요!");
			
		} else { // 리스트에 등록된 도서가 있다면 
			for(Book i : books) {	// books 리스트의 모든 요소에 전체 접근
				System.out.println(i);	// 객체를 출력할 때 toStirng이 묵시적으로 자동 호출됨. 
										// Book 클래스에서 재정의한 toString메서드의 return 형식에 맞춰서
										// i번째에 해당하는 객체의 정보가 출력된다. => 리스트에 있는 모든 객체에 대한 정보가 출력된다.
							
			}
		}
		
	}
	
	/**
	 * 3. 도서 수정
	 */
	public String editBook() {
		System.out.println("===도서 목록===");
		showBook();	// 등록된 도서목록 출력
		
		System.out.println("수정할 도서 번호를 입력해주세요 : ");
		int bookNum = sc.nextInt();	// 도서 번호 입력 받기
		
		boolean flag = true; // 내가 입력한 도서 번호를 찾지 못함.
		
		for(Book i : books) {				// books 리스트에 있는 모든 객체들 중에서
			if(bookNum == i.getBookNum()) {	// 내가 입력한 도서 번호와 일치하는 도서 번호를 가진 객체가 있다면
				System.out.println(i); // 해당 객체(도서) 정보 출력
				flag = false; // 내가 입력한 도서 번호를 찾음.
				
				System.out.println("1. 도서 제목");
				System.out.println("2. 도서 저자");
				System.out.println("3. 가격");
				System.out.println("4. 출판사");
				System.out.println("5. 도서 번호");
				System.out.println("0. 수정 종료");
				
				System.out.println("어떤 것을 수정하시겠습니까? : ");
				int editNum = sc.nextInt();	// 번호 입력받기
				
				switch(editNum) {
				case 1: // 1 입력한 경우
						System.out.print("수정할 제목 입력 : ");
						String bookName = sc.nextLine();	// 수정할 제목 입력 받기.
						i.setTitle(bookName);	// 입력한 제목을 set메서드를 통해 초기화.
						break;
					
				case 2: // 2 입력한 경우
						System.out.print("수정할 저자 입력 : ");
						String author = sc.nextLine();	// 수정할 저자 입력 받기.
						i.setAuthor(author);	// 입력한 저자명을 set메서드를 통해 초기화
						break;
						
				case 3: // 3 입력한 경우
						System.out.println("수정할 가격 입력 : ");
						int price = sc.nextInt();	// 수정할 가격 입력 받기
						i.setPrice(price);		// 입력한 가격을 set메서드를 통해 초기화
						break;
						
				case 4: // 4 입력한 경우
						System.out.println("수정할 출판사 입력 : ");
						String publisher = sc.nextLine();	// 수정할 출판사 입력 받기
						i.setPublisher(publisher); // 입력한 출판사를 set메서드를 통해 초기화
						break;
						
				case 5:// 5 입력한 경우
						System.out.println("수정할 도서 번호 입력 : ");
						int bookreNum = sc.nextInt();	// 수정할 도서 번호 입력 받기
						i.setBookNum(bookreNum);	// 입력한 도서 번호를 set메서드를 통해 초기화
						break;
						
				case 0 : System.out.println("수정을 종료합니다."); break;	// 0 입력한 경우 "수정을 종료합니다." 출력
				default : System.out.println("메뉴에 있는 번호만 입력해주세요."); break; 
				// 1, 2, 3, 4, 5, 0 이 아닌 다른 번호를 입력한 경우 "메뉴에 있는 번호만 입력해주세요." 출력
				
				}
				
			} 
			
			
		} if (flag) {	// falg == true ->  내가 입력한 도서 번호를 찾지 못했을 때
			return "해당하는 도서가 없습니다.";	// 아래 코드 보지 않고 editBook() 메서드 호출한 곳으로 "해당하는 도서가 없습니다." 문자열 반환
		} return "수정 완료";	// flag == false -> 내가 입력한 도서 번호를 찾았을 때 
						// editBook() 메서드 호출한 곳으로 "수정 완료" 문자열 반환
		
	}
	
	/**
	 * 4. 도서 삭제
	 */
	public String deleteBook() {
		System.out.println("===도서 삭제===");
		System.out.println("삭제할 도서 번호를 입력하세요 : ");
		int bookNum = sc.nextInt();	// 도서 번호 입력 받기
		
		for(Book i : books) { // books 리스트의 모든 객체 중에서 
			if(bookNum == i.getBookNum()); { // 입력받은 도서 번호와 일치하는 도서 번호를 가진 객체가 있다면
			int index = books.indexOf(i);	// 그 객체에 해당하는 인덱스 번호 반환, 만약 리스트에 없다면 -1 반환하여 index에 저장
			
			System.out.print("정말 삭제하시겠습니까? (Y/N) : ");
			char answer = sc.next().toUpperCase().charAt(0);
			// 문자형을 입력받아서 대문자로 변환하고 그 문자의 0번째 글자(첫글자)만 char형으로 저장하여 answer이라는 변수에 그 값을 담음.
			
			if(answer == 'Y') {	// answer에 저장된 값이 Y라면
				books.remove(index);	// books 리스트에서 index번째 인덱스에 해당하는 객체를 삭제
				return "삭제 완료";	 // deleteBook()를 호출한 곳으로 "삭제 완료" 문자열 반환
				
			} return "삭제를 진행하지 않았습니다.";	// answer에 저장된 값이 Y가 아니라면
				// deleteBook()를 호출한 곳으로 "삭제를 진행하지 않았습니다." 문자열 반환
			
		}
		
		
	}	return "해당하는 도서가 없습니다.";	// 입력받은 도서 번호와 일치하는 도서 번호를 가진 객체가 없어서 
										// for문 내부의 if문이 수행되지 않고 for문을 완전히 빠져나와 
										// deleteBook() 메서드를 호출한 곳으로 "해당하는 도서가 없습니다." 문자열 반환.
	
	
}
	
	
	/**
	 * 7. 즐겨찾기 조회
	 */
	public void showFav() {
		//List<Book> favBook = new ArrayList<Book>();
		if(favBook.isEmpty()) {	// favBook 리스트가 비어있다면 
			System.out.println("즐겨찾기가 비어있습니다."); //"즐겨찾기가 비어있습니다." 출력
			
		} else {	// favBook 리스트가 비어있지 않다면
			for(Book i : favBook) {	// favBook 리스트에 있는 모든 객체에 접근하여
				System.out.println(i);	// 객체를 출력할 때 묵시적으로 toString()이 자동 호출됨.
										// Book 클래스에서 재정의한 toString()메서드의 return구문 형식에 맞춰 
										// favBook 리스트가 가진 모든 객체의 정보가 출력된다.
				
			}
		}
		
		
		
	}
	
	
	/**
	 * 5. 즐겨찾기 추가
	 */
	public String addFav() {
		System.out.println("===즐겨찾기 목록===");
		showFav();	// 즐겨찾기에 있는 목록들 출력. 비어있다면 "즐겨찾기가 비어있습니다."가 출력됨.
		
		System.out.println("===즐겨찾기 추가===");
		System.out.println("즐겨찾기에 추가할 도서 번호를 입력하세요 : ");
		int bookNum = sc.nextInt();	// 즐겨찾기에 추가할 도서 번호 입력 받기.
		
		for(Book i : favBook) {	// favBook 리스트의 모든 객체 중에서
			if(bookNum == i.bookNum) {	// 입력받은 도서 번호와 일치하는 도서 번호를 가진 객체가 있다면
				
				System.out.println(i);	// => favBooks.toString() // 해당 도서의 정보 출력
				System.out.print("해당 도서를 즐겨찾기에 추가하시겠습니까? (Y.N) : ");
				char answer = sc.next().toUpperCase().charAt(0);
				// 문자형을 입력받아서 대문자로 변환하고 0번째 글자(첫글자)에 해당하는 문자값을 변수 answer에 저장.
				
				if(answer == 'Y' ) { // answer에 저장된 값이 Y일 경우
					Book addFav = new Book(i.getTitle(), i.getAuthor(), i.getPrice(), i.getPublisher(), i.getBookNum());
					// Book 클래스의 매개변수 생성자 이용하여 새로운 객체 생성, 그 객체의 주소값을 참조변수 addFav가 저장
					favBook.add(addFav); // 생성한 객체를 favBook 리스트에 추가
					return "즐겨찾기 추가 완료";	// addFav() 메서드 호출한 곳으로 "즐겨찾기 추가 완료" 문자열 반환
				}	return "즐겨찾기에 추가되지 않았습니다.";	// answer에 저장된 값이 Y가 아닌 경우, 
						// addFav() 메서드 호출한 곳으로 "즐겨찾기에 추가되지 않았습니다." 문자열 반환
				
			}
			
		}	return "해당하는 도서가 없습니다.";	
		// 입력한 도서번호와 일치하는 도서번호를 가진 객체가 없을 때 
		// addFav()메서드 호출한 곳으로 "해당하는 도서가 없습니다." 문자열 반환.
	}
	
	
	/**
	 * 6. 즐겨찾기 삭제
	 */
	public String deleteFav() {
		showFav();	// 즐겨찾기에 등록된 목록들 출력
		
		System.out.println("즐겨찾기 삭제할 도서번호 입력 : ");
		int bookNum = sc.nextInt();	// 즐겨찾기 삭제할 도서번호 입력 받기.
		
		boolean flag = true; // 입력한 도서번호에 해당하는 도서 못찾은 상황.
		
		for(Book i : favBook) {	// favBook 리스트에 저장된 모든 객체 중에서
			if(bookNum == i.getBookNum()) {	// 입력받은 도서 번호와 일치하는 도서 번호를 가진 객체라면
				favBook.remove(i);	// 해당 객체(i번째에 해당하는 객체)를 favBook 리스트에서 삭제
				flag = false; // 입력한 도서번호와 일치하는 도서번호를 찾은 상황
				break;	// 찾았으면 더이상 반복할 필요가 없으므로 for문 종료.
			}
			
		} if(flag) { // flag == ture => 입력한 도서번호에 해당하는 도서를 못찾은 경우
			return "해당하는 도서가 없습니다.";	// deleteFav() 메서드 호출한 곳으로 "해당하는 도서가 없습니다." 문자열 반환
		}return "삭제 완료되었습니다.";	// falg != true => deleteFav() 메서드 호출한 곳으로 
											// "삭제 완료되었습니다" 문자열 반환
		
	}
	
/**
 * 8. 추천도서 뽑기
 */
public void randomBook() {
		
		int max = books.size();	// books 리스트가 가진 크기를 정수값으로 max에 저장
		
		int random = (int)(Math.random() * max);
		// 0부터 books 리스트의 크기까지 중에서 무작위로 정수값 선택하여 변수 random에 저장
		
		System.out.println(books.get(random).getTitle());
		// books 리스트 중 random번째에 해당하는 객체의 제목 출력
		
	}
	
	
	
}
*/

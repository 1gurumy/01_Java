package deu.kh.control.condition;

import java.util.Scanner;

public class If {
	
	public void ifExmaple() {
	
		
		//1, 2, 12 => "겨울"
		// 3 ~ 5 => "봄"
		// 6 ~ 8 => "여름"
		// 9 ~ 11 => "가을"
		// 모두 다 아닐 시 "해당하는 계절이 없습니다"
		
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("달 입력 : ");
		int month = sc.nextInt();
	
	if(month == 1 && month == 2 && month ==12) {
		System.out.println("겨울");
		
	} else if(month >= 3 && month <= 5) {
		System.out.println("봄");
		
	} else if(month >= 6 && month <= 8) {
		System.out.println("여름");
		
	} else if(month >= 9 && month <= 11) {
		System.out.println("가을");
	
	} else {
		System.out.println("해당하는 계절이 없습니다.");
	}
			
	}

}		


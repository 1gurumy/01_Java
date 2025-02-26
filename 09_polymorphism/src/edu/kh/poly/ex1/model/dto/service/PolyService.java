package edu.kh.poly.ex1.model.dto.service;

import edu.kh.poly.ex1.model.dto.Car;
import edu.kh.poly.ex1.model.dto.Spark;
import edu.kh.poly.ex1.model.dto.Tesla;

public class PolyService {

	public void ex1() { // 다형성 확인예제
		
		// Car 객체 생성
		Car car = new Car();
	// 부모타입 참조변수 = 부모객체주소값	
		
		//Tesla 객체 생성
		Tesla tesla = new Tesla();
	// 자식타입 참조변수 = 자식객체주소값 할당	
		
		// -> 여기까진 당연한 것
		
		// **************** 다형성 ***************
		
		// 업캐스팅: 부모타입 참조변수 = 자식객체
		
		Car car2 = new Tesla();	// 오류발생 안함.
		// =은 대입연산이라 같은 자료형끼리만 연산이 가능한데 다형성이 적용되어 오류안남
		// Tesla 객체를 참조하느 변수의 타입이 Car(부모)타입 이기 때문에
		// Tesla 객체가 Car(부모)타입 객체로 변화함  // car인척 하는 테슬라
		// => 업 캐스팅
		
		
		Car car3 = new Spark();
		// spark 객체를 참조하는 변수의 타입이 Car이기 때문에
		// Spark 객체가 Car객체로 변화함
		// => 업캐스팅
		
		// 1) 자식 객체가 부모 객체로 변하였기 때문에
		//  자식만의 고유한 필드, 메서드를 사용할 수 없다.
		
		// 1-1) car (부모 = 부모) // Car car = new Car();
		car.setEngine("v6 6기통 엔진");
		car.setFuel("휘발유");
		car.setWheel(4);
		// Car는 본인의 메서드 모두 사용 가능
		
		// 1-2) tesla (자식 = 자식)
		tesla.setEngine("전기모터");
		tesla.setFuel("전기");
		tesla.setWheel(4);
		tesla.setBatteryCapacity(1000000);		//q setBatteryCapacity는 Tesla의 고유필드인데 왜 오류안남?
		// Tesla는 부모, 본인의 메서드 모두 사용 가능
		
		// 1-3) car2 (부모 = 자식(Tesla))(부모타입 참조변수에 자식타입 테슬라를 넣어둔 상태, Car타입으로 변한 Tesla 객체)
		car2.setEngine("전기모터");
		car2.setFuel("전기");
		car2.setWheel(4);
		// car2.setBatteryCapacity(1000000); // == 에러나는 이유 Car타입에 없어서 => 테슬라가아니라 카 타입으로 인식되어짐.
		// The method setBatteryCapacity(int) is undefined for the type Car
		
		// car3 (부모 = 자식(Spark))
		 car3.setEngine("경차엔진");
		car3.setFuel(null);
		car3.setWheel(0);
		// car3.setDiscountOffer(0.5) // 카타입에는 setDiscountOffer 메서드가 정의되어있지 않아서 사용 못해서 오류
		// 오류메세지 The method setDiscountOffer(double) is undefined for the type Car
		
		// car2, car3는 부모타입 참조변수(Car)이기 때문에
		// Tesla, Spark와 같은 자식객체의 고유 필드, 메서드 사용 불가
	
		// --------------------------------------------------
		
		// 2) 다형성을 이용한 객체배열
		
		// 객체 배열 : 같은 객체 참조 자료형의 변수들을 하나의 묶음으로 다루는 것.
		// 다형성을 이용한 객체배열 : 
		// 부모 타입 참조 자료형의 변수를 하나의 묶음으로 다루는 것
		Car[] arr = new Car[3]; // Car타입(부모타입) 참조변수 배열 선언 및 3칸 할당
		// arr[]의 각 요소들은 Car타입 참조변수이다.
	
		
		// 상속 특징 : Car 상속 클래스는 모두 getEmgime()을 가지고 있다.
		// 다형성(업캐스팅) : 부모 타입 참조변수인 arr[i]로 자식객체를 참조할 수 있다.
		arr[0] = car;	// Car타입 주소
		
		arr[1] = car2; //  Tesla 주소
		
		arr[2] = car3; // Spark 주소
	
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 인덱스의 엔진 : " + arr[i].getEngine());
			
		}
	
		// 상속 + 다형성이 적용
		// 상속 특징 : Car 상속 클래스는 모두 getEmgime()을 가지고 있다.
		// 다형성(업캐스팅) : 부모 타입 참조변수인 arr[i]로 자식객체를 참조할 수 있다.
		
		
	}
	// 전달받은 Car 또는 자식객체(Tesla, Spark)의 엔진, 연료, 바퀴갯수를 출력하는 메서드
	public void printCar(Car temp) {
		// Car temp = c(Car)
		// Car temp = t(Tesla) Car의 자식객체
		// Car temp = s(Spark) Car의 자식객체
		// 부모타입 참조변수 = 자식타입객체
		// -> 다형성의 업캐스팅 모양과 똑같다.
		// temp라는 Car타입 매개변수에는 Car, Tesla, Spark객체의 주소가 참조되어도 된다.
		System.out.println("엔진 : " + temp.getEngine());
		System.out.println("연료 : " + temp.getFuel());
		System.out.println("바퀴 갯수 : " + temp.getWheel() + "개");
		System.out.println(); // 줄바꿈 용도
	}
	// 매개변수로 전달받은 정수값에 따라 Car, Tesla, Spark 객체를 만들어
	// 반환하는 메서드
	public Car createCar(int num) {
	// 반환형이 Car
		Car result = null;
		
		switch (num) {
		case 1 : result = new Car(); break;
		case 2 : result = new Tesla(); break;
		case 3 : result = new Spark(); break; 
		}
		
		return result;
		
		
	}
	
	
	
	
	
	// 다형성(업캐스팅)을 이용한 매개변수 사용법
	public void ex2() {
		
		Tesla t = new Tesla("전기모터", "전기", 4, 1000000);
		
		
		Spark s = new Spark("경차엔진", "휘발유", 4, 0.5);
		
		Car c = new Car("경유엔진", "경유", 12);
		
		printCar(t); 
		printCar(s); 
		printCar(c); 
		
		
		System.out.println("-----------------------------------");
		
		
		// 다형성을 이용한 반환형 사용법
		
		// Car[] arr = {new Car(), new Tesla(), new Spark()};
					//카타입 arr배열에 객체 
		
		Car[] arr = {createCar(1), createCar(2), createCar(3) };
						// Car	// Car(Tesla) 	// Car(Spark)
		
		
		// 객체가 어떤 타입(자료형)인지 검사하는 방법
		// instanceof 연산자 : 객체의 자료형을 검사하는 연산자 // 주로 다운캐스팅 시 실수 방지를 위해 사용함
		// -> 참조하는 객체가 특정 자료형이거나 상속관계인지 확인
		// 상속관계가 맞으면 true, 아니면 false를 출력해줌.
		
		// arr[1] -> Car타입인척 하는 Tesla 객체
		System.out.println(arr[1] instanceof Tesla);	// true (자기 본인 맞음)
		
		System.out.println(arr[1] instanceof Spark );   // false(Spark와 Tesla 관계 없음)
		
		System.out.println(arr[1] instanceof Car); 		// true(부모 -> 상속관계)
		
	}
	
	public void ex3() { // 다형성 중 다운캐스팅 확인 예제
		
		// 다운캐스팅이란?
		// 부모타입 참조변수가 자식객체를 참조하는 기술(==업캐스팅)이
		// 적용된 상태에서만 진행할 수 있다.
		// 부모타입을 자식타입으로 "강제 형변환"해서 
		// 자식객체의 본래 필드, 메서드를 사용 가능하게 한다.
		
		Car c1 = new Tesla("전기모터", "전기", 4, 50000);
		// 업캐스팅 상태 (Tesla 타입인 자식객체가 -> Car타입인 부모객체인척 함)
		
		// System.out.println( (Tesla)c1.get   );
		// 주의!
		// "." 연산자는 (Tesla)로 형변환하는 연산자보다 우선순위가 높음.
		System.out.println( ((Tesla)c1).getBatteryCapacity()   );
		// 그래서 형변환하는 부분을 ()로 한번 묶어주고나서 . 연산을 진행해야 
		// Tesla 객체의 고유 getBatterCapacity() 를 사용할 수 있게된다.
		
		Tesla t1 = (Tesla)c1;
		//c1은 카타입인데 테슬라 타입으로 형변환.
		// 테슬라 타입이된 씨원이 테슬라 타입의 t에 대입될 수 있게됨.
		
		
		}
	
	public void ex4() { // 다운캐스팅 주의사항!!!!
		Car c1 = new Tesla();
		// : Tesla 객체를 만들어 Car 타입 참조변수 c1에 담음
		
		
		
		
		
		// Spark s1 = (Spark)c1; // c1을 관계없는 Spark로 다운캐스팅하려고함. 따라서 실행 시 오류.
		// 다운캐스팅 잘못해도 컴파일 에러가 발생 안함
		// -> 실행 시에 오류가 발생한다.(런타임 에러)
		// 에러 메세지 : ClassCastException : 형변환 예외
		
		// 해결방법 : instanceof 연산자와 같이 사용하면 된다!(예외처리에 해당)
		
		// 예외처리
		if( c1 instanceof Spark ) {	// : c1이 Spark이거나 상속관계인가?
			// 맞다면 형변환해라 출력
			Spark s1 = (Spark)c1; // 다운캐스팅
			System.out.println("성공");
			
			
		} else { // c1이 Spark가 아니고 상속관계도 아니라면
			 System.out.println("실패. Spark 타입/상속관계 아님");
	
		}
		
		
		public void ex5() { // 바인딩 확인 예제
			
			// 바인딩(Binding)
			// : 실제 실행할 메소드 코드와 호출하는 코드를 연결시키는 것.
			
		
		Car c1 = new Car("경유엔진", "경유", 8);
		
			System.out.println(c1.toString());
				// String edu.kh.poly.ex1.model.dto.Car.toString ()
				// Car 객체에 있는 toString 메서드를 호출했고 실제로 Car 클래스에 있는 toString 메서드로 연결해준 것.
				// 프로그램 "실행 전"
			// 컴파일러는 toString() 메서드가 Car에 있는 걸로 인식해서
			// c1.toString() 호출코드와
			// String edu.kh.poly.ex1.model.dto.Car.toString () 메소드 코드를 연결하는 것은
			// -> 정적 바인딩에 해당한다.
		
			
			// ** 다형성 적용 시 바인딩 **
			Car c2 = new Spark("경차엔진", "휘발유", 4, 0.5);
			// c2는 업캐스팅적용된 상태 -> 부모 부분만 참조 가능한 상태
		
			System.out.println(c2.toString());
			// String edu.kh.poly.ex1.model.dto.Car.toString ()
			// 참조변수 c2가 Car 타입이므로
			// toString() 호출코드와 Car의 toString() 메소드 코드를 연결한 것
			// => 현재 정적바인딩 상태라는 것
			
			// 실행해보면 자식(Spark)의 toString() 이 호출되는 것을 확인할 수 있다.
			// 경차엔진 / 휘발유 / 4 / 0.5
			// -> 컴파일 시에는 부모(Car)타입과 바인딩 ==> 정적바인딩
			
			// "실행 시"에는 정적바인딩보다 자식(Spark)에서 오버라이딩된
			// toString() 메서드가 우선시되어 Spark의 메서드와 바인딩 되는것
			// == > 동적 바인딩(자식에서 재정의된 메서드가 우선순위가 높다)
			// 
			
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

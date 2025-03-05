package edu.kh.io.pack2.model.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class ByteService {
	
	/*
	 * 스트림(Stream) : 데이터가 이동하는 통로
	 * 					기본적으로 한 방향으로 흐름.
	 * 
	 * Byte 기반 스트림
	 * - 1byte 단위로 데이터를 입/출력하는 스트림
	 * - 최상위 클래스 : InputStream, OutpurStream
	 * - 문자열, 이미지, 영상, 오디오, pdf 등
	 * 	 모든 것을 입/출력 할 수 있음.
	 * 	 (단, 통로가 1byte로 좁다보니 속도가 좀 느림,
	 * 	  char 형 문자 같은 경우는 깨질 우려가 있음.)
	 * 
	 * */
	
	// IO 관련된 코드는 IOException이 발생될 가능성이 높다.
	// -> IO관련된 코드는 거의 모든 메서드가 정의될 당시 throw IOExcetpion 이 작성되어있음.
	// -> IOExcetpion 예외 처리 구문을 작성하는 것이 필수!(Checked Exception이므로)
	
	/**
	 * 바이트 기반 스트림을 이용한 파일 출력(생성)
	 * + 데이터 출력(Stream 필요)
	 */
	public void fileByteOutput() {
		
		// FileOutputStream 참조 변수 선언(FileOutputStream은 OutputStream 클래스를 상속받은 자식 클래스)	// ppt 7페이지 참고
		FileOutputStream fos = null;	// finally구문 안에서 fos에 접근할 수 있게끔 지역변수로 선언해놓기.
		
		try {
			
			
			// new FileOutputStream("경로")
			// -> 경로에 작성된 파일과 연결된 파일 출력 스트림 객체 생성
			// -> 출력 스트림에 연결된 파일이 존재하지 않으면 자동 생성
			// 단, 폴더는 생성되지 않음.
			// -> 기존 파일(같은 이름의 파일)이 존재하면 내용을 덮어쓰기함.
			fos = new FileOutputStream("/io_test/20250305/바이트기반_테스트.txt");	
			// 출력 스트림으로 해당 경로와 연결이 된 상태.
			
			// String의 불변성 문제를 해결한 객체 StringBuilder(비동기)/StringBuffer(동기)
			StringBuilder sb = new StringBuilder();
			sb.append("Hellow World!!\n");
			sb.append("123456789\n");
			sb.append("~!@#$%^&*()_+<>?\n");
			sb.append("가나다라마바사아\n");
			sb.append("자고싶다\n");
			sb.append("잠이 부족하다.\n");
			sb.append("잠 못자서 우울하다\n");
			
			// 출력방법 1 : 한 글자(2byte)씩 파일로 출력
			
			// StringBuilder -> String 변환 -> charAt -> char로 변환
			String content = sb.toString();
			/*
			for(int i = 0; i < content.length(); i++) {
				char ch = content.charAt(i);
				fos.write(ch);	// 1byte를 출력할 수 있는 스트림이 연결된 파일에 현재 ch를 쓰겠다.
				
			}
			*/
			// 출력방법 1의 한계
			// -> 2byte 범주의 문자(영어, 숫자, 기본 특수문자 제외)는
			// 바이트 기반 스트림 통과 시
			// 데이터 손실이 발생해서 글자가 깨지는 문제가 발생한다
			
			
			// 출력방법 2 : String을 byte[] 변환 후 출력
			
			//**********수행 시간 확인 방법*************
			// write()가 수행되는 시간 측정
			// System.nanoTime() : 1970.01.01 오전 9:00:00 부터
			// 현재 시간까지의 차이를 ns(nano second)로 반환
			// 1ms (밀리 세컨) == 1/1000초
			// 1us (마이크로)  == 1/1000ms
			// 1ns (나노) 	   == 1/1000us
			
			// 이전
			long startTime = System.nanoTime();
			
			fos.write(content.getBytes());	// byte[]로 만들어 반환
			
			// 이후
			long endTime = System.nanoTime();
			
			System.out.println("[수행 시간] : " + (endTime - startTime) + "ns"); // 60600ns
			
			
			fos.flush();	// 스트림 안에 남아있는 모든 데이터를 모두 밀어냄.
			// FileOutputStream에서 flush() 사용은 선택 사항임.
			
			System.out.println("출력 완료!");
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {	// try에서 예외 발생 여부와 관계 없이 무조건 수행할 코드 작성하는 구간
			
			// 메모리 누수를 방지하기 위해서
			// 사용 완료한 스트림을 제거(==닫기, 메모리 반환)하는 코드 작성
			try {
				// close() 메서드도 IOException을 발생시킴
				// -> null일 경우 닫으면 nullpontException 예외 발생함.
				// -> try-catch 이용하여 예외 처리 필수!
				if(fos != null) fos.close();	//-> 따라서 : fos가 null이 아닐 경우(==스트림이 정상 생성된 경우)에만 닫아라
											
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		// Stream을 사용했다면 메모리 누수를 방지하기 위해서 반드시 닫아줘야 함. 
		
		
		
	}

	
	/**
	 * 버퍼를 이용한 파일 출력
	 * + BufferedOutputStream 보조 스트림 이용
	 */
	public void bufferedFileByteOutput() {
		/*
		 * 버퍼(Buffer)란?
		 * - 데이터를 모아두는 공간, 마치 바구니 같은 공간
		 * 
		 * BufferedOutputStream / BufferedInputStream
		 * 출력용 보조 스트림(바이트 기반) / 입력용 보조 스트림(바이트 기반)
		 * 
		 * - FileOutputStream은 1바이트씩 데이터를 입출력
		 * -> 통로가 좁아서 데이터 입출력 시 속도가 느림.
		 * -> 이럴 때 보조스트림 이용 시 버퍼에 입출력할 내용을 모아서 한 번에 입출력 할 수 있다!
		 * (내부 버퍼에 데이터를 모아뒀다가 일정 크기가 되면 한 번에 출력)
		 * --> 기반 스트림을 이용하는 횟수가 적어짐
		 * --> 성능, 시간 효율 상승
		 * 
		 * */
		
		FileOutputStream fos = null; 	// 기반 스트림 참조변수 선언
		BufferedOutputStream bos = null;	// 보조 스트림 참조 변수 선언
		
		try {
			
			fos = new FileOutputStream("/io_test/20250305/바이트기반_테스트_Buffered.txt");
			
			// 기반스트림인 fos를 이용해 보조스트림인 bos를 생성
			bos = new BufferedOutputStream(fos);
			
			StringBuilder sb = new StringBuilder();
			sb.append("Hellow World!!\n");
			sb.append("123456789\n");
			sb.append("~!@#$%^&*()_+<>?\n");
			sb.append("가나다라마바사아\n");
			sb.append("자고싶다\n");
			sb.append("잠이 부족하다.\n");
			sb.append("잠 못자서 우울하다\n");
			
			String content = sb.toString();
			
			// 이전
			long startTime = System.nanoTime();
			
			bos.write(content.getBytes());	// byte[]로 만들어 반환
			
			// 이후
			long endTime = System.nanoTime();
			
			System.out.println("[수행 시간] : " + (endTime - startTime) + "ns"); // 29200ns
			
			bos.write(content.getBytes());	// 버퍼에 저장하는 행위(파일에 즉시 기록X)
			
			bos.flush();	// 스트림 안에 남아있는 모든 데이터를 밀어냄.
						// =>  버퍼 내용을 강제로 파일에 기록
						// ==> 보조 스트림인 BufferedOutputStream 사용 시 flush() 필수!
			System.out.println("출력 완료!");
			
		} catch (Exception e) {

			e.printStackTrace();
		
		} finally {
			
			try {
				if(bos != null) bos.close(); // bos가 null이 아니라면 bos를 닫겠다.
				// 보조스트림(bos) close() 시
				// 보조스트림 생성에 사용된 기반  스트림 (fos)도 같이 close() 됨.
				
				
			} catch (Exception e) {
				e.printStackTrace();
				
			
			}
		}
		
		
		
	}


	/**
	 *  바이트 기반 파일 입력
	 *  방법 1
	 */
	public void fileByteInput() {
		
		// 파일 입력용 바이트 기반 스트림 선언
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("\\io_test\\20250305\\노래가사.txt");
			// FileInputStream 이용시 해당 경로에 반드시 실제 파일이 존재해야 한다.
			// -> 존재하지 않으면 FileNotFoundException 발생
			
			// 방법1. 파일 내부 내용을 1byte씩 끊어서 가져오기
			// -> 2byte 범주의 글자들은 깨지는 문제 발생함.
			
			// byte -> 자바에서 정수형
			// 다루기 힘들기 때문에 같은 정수형 기본형인 int로 변환해서 사용해보려고 함.
			
			int value = 0;	// 읽어온 바이트 값을 저장할 변수
			
			StringBuilder sb = new StringBuilder();
			
			while(true) {
				
				value = fis.read(); // read() : 1byte씩 끊어서 읽어오는 메서드
				// 단, 더이상 읽어올 값이 없으면 -1 반환
				
				if(value == -1) break;	// 다 읽어왔으면 반복 멈춤
				
				sb.append((char)value);	// char로 강제 형변환해서 글자 형태로 sb 추가
				
			}
			
			System.out.println(sb.toString()); // 읽어온 내용을 콘솔에 출력
			
			// InputStream은 flush() 없음
			// flush() 는 출력 스트림에만 관련된 동작
			
		} catch (Exception e) {
			e.printStackTrace();
		
		} finally {
			// 사용 완료된 Stream 메모리 반환
			try {
				if(fis != null) fis.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			
			}
			
			
		}
		
	}

	/**
	 * 바이트 기반 파일 입력 
	 * 방법 2
	 */
	public void fileByteInput2() {
			FileInputStream fis = null;
			
		try {
			fis = new FileInputStream("\\io_test\\20250305\\노래가사.txt");
			
			// 방법 2. 파일에 저장된 모든 byte 값을 다 읽어와
			//			byte[] 형태로 반환 받기
			// ex 안 ->  ㅇ:20, ㅏ:97, ㄴ:34   => [20, 97, 34]
			// 	-> byte[] 배열을 이용해서 String 객체 생성
			
			byte[] bytes = fis.readAllBytes(); // 노래가사.txt에 있는 글자들을 byte 배열로 묶어서 반환
			
			String content = new String(bytes);	
			
			System.out.println(content);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		
		} finally {
			// 사용 완료된 Stream 메모리 반환
			try {
				if(fis != null) fis.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			
			}
			
			
		}
		
	}
		
	/**
	 * BufferedInputStream 보조 스트림을 이용한 성능 향상
	 * 
	 * InputStream의 경우 외부 파일의 데이터를 읽어올 때 사용
	 * -> 읽어오는 파일의 크기가 작으면 
	 * 	  보조 스트림의 성능 이점이 크게 눈에 띄지는 않음.
	 * 
	 */
	public void bufferedFileByteInput() {
		
		// 파일 입력용 바이트 기반 스트림 선언
		FileInputStream fis = null;
		
		
		// 파일 입력용 바이트 보조 스트림 선언
		BufferedInputStream bis = null;
		
		try {
			
			// 기반 스트림 생성
			fis = new FileInputStream("\\io_test\\20250305\\노래가사.txt");
			
			// 보조 스트림 생성
			bis = new BufferedInputStream(fis);
			
			byte[] bytes = bis.readAllBytes();
			
			String content = new String(bytes);
			
			System.out.println(content);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		
		} finally {
			
			try {
				// 보조 스트림만 close()해도 기반  스트림도 같이 close() 됌.
				if(bis != null) bis.close();
				
			} catch (Exception e) {
				e.printStackTrace();
				
			
			}
			
		}
		
		
		
	}

	/**
	 * 외부에 있는 config.properties 파일 입출력하기
	 * -> Map 계열인 Properties 클래스 사용하기 
	 * 
	 */
	public void readProperties() {
		
	// Properties 클래스는 Hashtable의 하위 클래스로 Map 계열 클래스 중 하나임.
	// Key와 Value 모두 String 타입으로 이루어짐.
		
	// Properties 객체 생성	
		Properties properties = new Properties();
		
	// 바이트 기반 파일 입력 스트림 참조변수 선언	
		FileInputStream fis = null;
		
		
		// 바이트 기반 파일 출력 스트림 참조변수 선언
		FileOutputStream fos = null;
		
		try {
			
			fis = new FileInputStream("/io_test/20250305/config.properties");
			
			properties.load(fis); // 파일 로드
			
			// Properties.getProperty(key) : key에 대응되는 value 값 반환
			System.out.println("username : " + properties.getProperty("username"));
			System.out.println("password : " + properties.getProperty("password"));
			System.out.println("language : " + properties.getProperty("language"));
			// System.out.println("language : " + properties.getProperty(""));	// 없는 키를 넣으면  Properties 클래스에서는 키 밸류 모두 String형이기 때문에 null 반환
			
			// 쓰기
			fos = new FileOutputStream("/io_test/20250305/config.properties");
			
			properties.setProperty("theme", "dark");	// 새로운 속성(설정) 추가
			// theme=dark
			
			properties.store(fos, "Update"); // 저장
								  // #코멘트	// properties 파일에서 #은 주석(해석하지 않는 부분)을 의미
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {	
			
			try {
				if(fis != null) fis.close();
				if(fos != null) fos.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	

	/**
	 * 파일 복사
	 * 
	 * 파일 경로를 입력받아
	 * 지정된 파일과 같은 경로에 복사된 파일출력하기
	 * 
	 * [실행화면]
	 * 파일 경로 입력 : /io_test/20250305/노래가사.txt
	 * 복사 완료 : /io_test/20250305/노래가사_copy.txt
	 * 
	 * 1) 입력된 경로에 파일이 있는지 검사
	 * 2) 있으면 파일 안의 내용을 모두 읽어오기 : FileInputStream + BufferedInputStream
	 * 3) 읽어온 내용을 같은 경로 위치에 "파일명_copy.확장자" 이름으로 출력
	 * 		: FileOutputStream + BufferedOutputStream
	 * 
	 * + Scanner 대신 BufferedReader(문자열 입력용 스트림) 이용
	 * -> BufferedReader는 보조스트림으로 단독 사용 불가능!
	 * -> BufferedReader 생성 시 보조스트림인 InputStreamReader도 사용할 예정(InputStreamReader는 InputStream의 보조스트림)
	 * 
	 */
	public void fileCopy() {
		
		// 스트림 참조변수 선언
		BufferedReader br = null; 			// 문자열 입력용 스트림
		
		FileInputStream fis = null; 		// 파일 입력 기반 스트림
		BufferedInputStream bis = null;		// 파일 입력 보조 스트림
		
		FileOutputStream fos = null;		// 파일 출력 기반 스트림
		BufferedOutputStream bos = null;	// 파일 출력 보조 스트림
		
		try {
			
			// 키보드 입력을 받기 위한 스트림 객체 생성
			br = new BufferedReader(new InputStreamReader(System.in));	// System.in : 1바이트씩 읽어오는 바이트 스트림을 의미
																		// InputStreamReader의 매개변수에 System.in이 들어오면 InputStreamReader은 문자 스트림으로 변환
			// 경로 입력 받기
			System.out.print("파일 경로 입력 : ");
			String target = br.readLine();	// 입력된 한 줄 읽어오기
			
			// 해당 경로에 파일이 존재하는지 확인
			File file = new File(target);
			
			if(!file.exists()) {	// 해당 경로에 파일이 존재하지 않으면
				// 프린트 구문 출력
				System.out.println("[해당 경로에 파일이 존재하지 않습니다]");
				return;
			}
			
			// 해당 경로에 파일이 존재하면 
			// target이 가리키는 파일을 입력받을 수 있도록 
			// 입력용 스트림 생성
			fis = new FileInputStream(target);
			bis = new BufferedInputStream(fis);
			
			// 입력용 스트림을 이용해서 target 파일의 내용 입력받기
			byte[] bytes = bis.readAllBytes();
			
			//--------------------------------------------------
			
			// 출력할 파일의 경로 + _copy 가 붙은 파일 이름
			// target : /io_test/20240926/노래가사.txt
			// copy	  : /io_test/20240926/노래가사_copy.txt
			
			StringBuilder sb = new StringBuilder();
			sb.append(target);	// /io_test/20250305/노래가사.txt
			
			// int String.lastIndexOf("문자열")
			// - 주어진 문자열이 마지막으로 등장하는 인덱스를 찾아
			// int 값으로 반환. 찾지 못하면 -1 반환
			int insertPoint = target.lastIndexOf(".");
			
			// System.out.println(insertPoint);	// 22
			
			sb.insert(insertPoint, "_copy");	// 22번 인덱스 자리에 "_copy" 문자열 추가
			
			String copy = sb.toString(); // 복사할 파일의 경로를 String으로 변환
			// /io_test/20250305/노래가사.txt
			
			// 출력용 스트림 생성
			fos = new FileOutputStream(copy);	// /io_test/20250305/노래가사.txt
			bos = new BufferedOutputStream(fos);
			
			// 원본에서 읽어온 내용 bytes를 bos를 이용해서 쓰기(출력)
			bos.write(bytes);
			bos.flush();	// 스트림에 남아있는 데이터 모두 밀어내기
			
			System.out.println("복사완료 : " + copy);

			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				// 사용한 스트림 메모리 모두 반환
				if(br != null) br.close();
				if(bis != null) bis.close(); // fis도 닫힘
				if(bos != null) bos.close(); // fos도 닫힘
				
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
		
	}

}
	


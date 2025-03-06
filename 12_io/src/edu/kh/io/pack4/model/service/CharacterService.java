package edu.kh.io.pack4.model.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CharacterService {

	/*
	 * 문자 기반 스트림
	 * 
	 * - 2byte 문자 단위로 입/출력 하는 스트림이다.
	 * 
	 * - Reader (입력) , Writer(출력) 최상위 클래스를 가지고 있음.
	 * 
	 * - 문자만 작성된 파일, 채팅, 인터넷 요청 시 데이터 전달
	 * 
	 * 
	 * 
	 * 
	 * */
	
	/**
	 * 문자 기반 파일 입력(파일 읽어오기)
	 * + 보조 스트림 Buffered 사용
	 * 
	 * 
	 */
	public void fileInput() {
		
		// 스트림 참조 변수 선언
		FileReader fr = null; // 문자 기반 파일 입력 스트림
		BufferedReader br = null;	// 문자 기반 보조 스트림
		
		try {
			
			// 문자 기반 스트림 생성
			fr = new FileReader("/io_test/20250305/노래가사.txt");
			
			// 보조 스트림 생성
			br = new BufferedReader(fr); // 기반스트림인 fr 전달
			
			String line = null; // 한줄을 읽어와 저장할 변수
			
			while(true) {
				
				// String BufferdReader.readLine() : 한 줄씩 문자열을 읽어와 반환하는 역할.(줄단위)
				// -> 개행문자가 나올때까지의 문자열을 읽음.
				line = br.readLine();
				
				if(line == null) { // 더이상 읽어올 내용이 없을 때
					break;	// 반복 종료
					
				}
				
				System.out.println(line);
				
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			
			try {
				if(br != null) br.close();	// 보조만 닫아도 기반이 함께 닫힘.
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	/**
	 * 문자 기반 파일 출력(내보내기)
	 * + 보조 스트림 Buffered 이용
	 */
	public void fileOutput() {
	
		// 스트림 참조변수 선언
		FileWriter fw = null; // 문자 기반 파일 출력 스트림
		BufferedWriter bw = null; // 문자 출력 보조 스트림
		
		try {
			
			StringBuilder sb = new StringBuilder();
			
			sb.append("오늘은 3월 6일 목요일입니다!\n");
			sb.append("벌써 목요일이라니, 기분이 좋네요?\n");
			sb.append("다들 힘내서 공부합시다!\n");
			sb.append("그리고 오늘 쪽지시험 있어요^^");
			
			String content = sb.toString();
			
			// content에 저장된 문자열을
			// /io_test/20250305/출력테스트.txt 파일로 출력하기
			
			// 해당파일과 출력스트림 연결해야함(출력 스트림은 파일이 없으면 생성해줌.)
			fw = new FileWriter("/io_test/20250305/출력테스트.txt");
			
			bw = new BufferedWriter(fw);
			//BufferedWriter는 데이터를 버퍼에 저장하고, 버퍼가 가득 차면 그 데이터를 파일에 한 번에 기록함.
			
			bw.write(content); 	// content에 저장된 내용을 연결된 파일에 출력
			
			// bw.flush(); // Buffered를 이용할 경우 반드시 flush()를 사용해야 하는데
							// try - catch에 if(bw != null) bw.close();해줬으면 사용 안해도 됌.
			// flush(): 버퍼에 남아 있는 데이터를 강제로 파일에 기록합니다. 
			// 하지만 스트림을 닫지는 않습니다. 주로 데이터를 출력한 후 바로 파일에 기록하고 싶을 때 사용
			
			System.out.println("출력 완료!");
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}finally {
			
			try {
				if(bw != null) bw.close();	//q 보조스트림이 비어있지 않으면 스트림(통로) 닫겠다는 의미? 비어있을 때 닫아야 하는거 아닌가?
				// a: BufferedWriter의 close() 메서드는 남아 있는 버퍼의 데이터를 강제로 파일에 쓰고, 스트림을 닫는다.
				// 이 과정은 자동적으로 버퍼에 있는 데이터를 출력하고, 파일을 마무리하는 작업을 포함함.
			} catch (Exception e) {
				e.printStackTrace();
			
			}
			
		}
		
	}
	
}

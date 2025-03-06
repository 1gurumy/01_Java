package edu.kh.network.server.model.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ServerService {
	// TCP Socket 프로그래밍
	// - TCP는 신뢰성 있는 연결을 보장하며
	// 소켓은 이 연결의 끝점 역할을 하며, 데이터 송수신 통로가 됨
	// 즉,  TCP 통신 = 소켓 간 연결 + 데이터 주고받기
		
	/*
	 * TCP
	 * - 서버, 클라이언트간 1:1 소켓통신 (연결 지향적 프로토콜)
	 * - 서버가 먼저 실행되어 있는 상태에서
	 *   클라이언트가 연결해야 함.
	 *  
	 *  
	 * - 데이터 전송 순서가 보장되고,
	 *   수신 여부를 판단하여 오류 발생 시 재전송함.
	 *  
	 *  
	 * * java.net 패키지에서 제공하는
	 *   Socket, ServerSocket 클래스를 사용해야함.
	 *  
	 *   Socket
	 * - 프로세스의 양 끝단(프로세스간의 통신을 담당)
	 * - Input/OutputStream 보유하고 있음.
	 *
	 *
	 *   ServerSocket
	 * - 포트와 연결되어 외부 요청을 기다리는 객체
	 * - 클라이언트의 연결 요청이 들어오면
	 *   클라이언트의 소켓을 얻어와 연결하게 된다.
	 *
	 * - 하나의 포트에는 하나의 ServerSocket만 연결 가능
	 * 
	 *
	 * */

	public void serverStar() {
		
		//1) 서버의 포트번호 정함
		int port = 8500;
		// 포트는 0 ~ 65535 사이를 지정할 수 있으나
		// 단, 1023번 이하는 이미 사용중인 경우가 많으니 피하는 게 좋음.
		
		// 소켓용 참조변수 선언
		ServerSocket serverSocket = null;	// 서버 측에서 사용되는 소켓으로, 특정 포트에서 클라이언트의 연결 요청을 기다리는 역할.
		Socket clientSocket = null; // 서버와 클라이언트 간의 실제 데이터 통신을 담당하는 소켓. 
		// 클라이언트가 서버에 요청을 보내면 서버는 클라이언트와 데이터 통신을 할 수 있도록 클라이언트용 소켓을 담아줄 공간을 마련해줘야함.
		
		// 입/출력용 참조 변수 선언 
		InputStream is = null;	// 바이트 기반의
		OutputStream os = null;	// 최상위 스트림들
		
		
		// 보조스트림 참조변수 선언
		BufferedReader br = null;	// 문자 기반 보조 스트림
		
		PrintWriter pw = null; 
		// PrintWriter : 문자 기반 보조 스트림
		// 파일, 콘솔, 네트워크 소켓 등 다양한 출력 스트림에서
		// 데이터를 쉽게 출력할 수 있게 해주는 기능을 가진 스트림.
		
		try {
			//2) 서버용 소켓 객체 생성
			serverSocket = new ServerSocket(port);
			
			//3) 클라이언트 쪽에서 접속 요청이 오길 기다림
			System.out.println("[Server]");
			System.out.println("클라이언트의 요청을 기다리고 있습니다...");

			//4) 접속 요청이 오면 요청 수락 후 해당 클라이언트에 대한 소켓 객체 생성
			clientSocket = serverSocket.accept();
			// -> 클라이언트의 요청이 오고, 수락이 될 때까지 무한대기
			// -> 수락 시 클라이언트의 socket 전달 받음
			
			System.out.println("[클라이언트 접속 성공]");
			
			//5) 연결된 클라이언트와 입출력 스트림 생성
			// -> 클라이언트가 서버 요청 시 소켓을 전달
			// -> 클라이언트 소켓에 입/출력 스트림이 담겨있음
			is = clientSocket.getInputStream();
			os = clientSocket.getOutputStream();
			
			
			//6) 보조 스트림을 통해 성능 개선
			br = new BufferedReader(new InputStreamReader(is));
			// 문자 기반 BufferedReader와
			// 바이트 기반인 InputStreamReader을 연결할 수 있도록
			// InputStreamReader 를 함께 사용
			
			pw = new PrintWriter(os);	//q 문자기반 스트림이지만 바이트기반어쩌고 문자기반으로 전환이 됌.
			
			//7) 스트림을 통해 읽고 쓰기
			// 서버 -> 클라이언트 메세지 전송
			
			// 2025년 03월 06일 12:17:30 [서버 접속 성공]
			Date now = new Date(); // java.util.Date : 자바에서 시간을 나타내주는 객체
			//						 new 연산자를 통해 Date 객체 생성 시 현재 시간이 저장되어있다.
			
			//System.out.println(now);
			
			// SimpleDateFormat : 날짜 형식을 간단히 지정하는 객체
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
			
			String str = sdf.format(now) + "[서버 접속 성공]";
			
			//PrintWriter.println(문자열) : 주어진 데이터를 문자 형태로 출력하고, 출력 후 줄바꿈
			pw.println(str); // 서버 -> 클라이언트로 출력
			pw.flush(); // flush() : 스트림을 밀어냄
			
			//--------------------------------------------------------------
			
			// 클라이언트 -> 서버 메세지 전달 받기
			String clientMessage = br.readLine();
			
			
			// 서버의 콘솔창에 클라이언트가 보낸 메시지와 클라이언트의 IP 출력
			String clientIP = clientSocket.getInetAddress().getHostAddress();
			// getInetAddress() : 클라이언트에 대한 IP 주소 정보를 포함하는 InetAddress 객체를 반환해주는 메서드
			// getHostAddress() : InetAddress 객체에서 IP 주소 부분을 문자열 형식으로 반환해주는 메서드.
			
			System.out.println(clientIP + "가 보낸 메시지 : " + clientMessage);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		
		} finally {
			//8) 통신 종료
			try {
				// 스트림/소켓 닫기			// 기반스트림들도 닫힘
				if(br != null) br.close(); // + is.close();
				if(pw != null) pw.close(); // + os.close();
				
				if(serverSocket != null) serverSocket.close();
				if(clientSocket != null) clientSocket.close();
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			
			}
			
		}
		
		
		
		
		
		
		
		
	}
	
}

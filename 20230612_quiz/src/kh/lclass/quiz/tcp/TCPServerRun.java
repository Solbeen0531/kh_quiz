package kh.lclass.quiz.tcp;

public class TCPServerRun {

	public static void main(String[] args) {
		new TCPServer().testTCPServer(9011);
		// 1. 서버의 포트번호 정함 ==> 프로그램의 포트번호

	}

}

/* TCP 소켓 프로그래밍(ppt 18_네트워크(Network)4.pdf 7page)

서버용 TCP 소켓 프로그래밍 순서

1. 서버의 포트번호 정함
2. 서버용 소켓 객체 생성
3. 클라이언트 쪽에서 접속 요청이 오길 기다림
4. 접속 요청이 오면 요청 수락 후 해당 클라이언트에 대한 소켓
객체 생성
5. 연결된 클라이언트와 입출력 스트림 생성
6. 보조 스트림을 통해 성능 개선
7. 스트림을 통해 읽고 쓰기
8. 통신 종료 
 
 */
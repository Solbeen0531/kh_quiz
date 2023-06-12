package kh.lclass.quiz.tcp;

public class TCPClientRun {

	public static void main(String[] args) {
		new TCPClient().testTCPClient("127.0.0.1",9011);
		// 1. 서버의 포트번호 정함 ==> 프로그램의 포트번호

	}

}
/*
TCP 소켓 프로그래밍(ppt 18_네트워크(Network)4.pdf 8page)

클라이언트용 TCP 소켓 프로그래밍 순서

1. 서버의 IP주소와 서버가 정한 포트번호를 매개변수로 하여
클라이언트용 소켓 객체 생성
2. 서버와의 입출력 스트림 오픈
3. 보조 스트림을 통해 성능 개선
4. 스트림을 통해 읽고 쓰기
5. 통신 종료

*/

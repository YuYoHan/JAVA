package day20;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExam {

	public static void main(String[] args) {
		Socket client = null;
		
		try {
			// 클라이언트 소켓 객체 생성
			client = new Socket();
			System.out.println("[연결 요청]");
			
			// 서버의 주소와 포트로 클라이언트 소켓 연결
			client.connect(new InetSocketAddress("localhost", 5001));
			
			// 소켓의 입력 스트림을 얻는다.
			InputStream in = client.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			// 소켓으로 부터 받은 데이터를 출력
			String data = dis.readUTF();
			System.out.println("[Notice] 서버에서 수신 : " + data);
			
			// 소켓으로 출력 스트림을 얻는다.
			OutputStream out = client.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			
			// 원격 서버로 데이터를 보낸다.
			dos.writeUTF("클라이언트에서 메시지를 보냅니다.");
			
			System.out.println("[클라이언트 연결 종료]");
		} catch (Exception e) {
			// TODO: handle exception
			if(!client.isClosed()) {
				try {
					client.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	}

}

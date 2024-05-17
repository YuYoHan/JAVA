package day20;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {

	public static void main(String[] args) {
		ServerSocket server = null;
		
		try {
			// 서버 소켓 객체 생성
			server = new ServerSocket();
			// 서버 소켓에 ip/port 할당
			server.bind(new InetSocketAddress("localhost", 5001));
			
			System.out.println("[소켓 연결을 기다립니다]");
			// 클라이언트 연결 수락 대기
			Socket socket = server.accept();
			
			// 연결된 소켓의 주소 얻기
			InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();
			System.out.println("[연결 수락됨]" + isa.getHostName());
			
			// 소켓의 출력 스트림을 얻는다.
			OutputStream out = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			
			// 원격 클라이언트로 데이터를 보낸다.
			dos.writeUTF("서버에서 메시지를 보냅니다.");
			
			// 소켓의 입력 스트림을 얻는다.
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			// 소켓으로부터 받은 데이터를 출력한다.
			String data = dis.readUTF();
			System.out.println("[Notice] 클라이언트에서 수신 : " + data);
			
			System.out.println("[서버 연결 종료]");			
		} catch (Exception e) {
			e.printStackTrace();
			
			if(!server.isClosed()) {
				try {
					server.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			// TODO: handle exception
		}
	}

}

package ex02;

import java.io.InputStream;
import java.net.Socket;

public class TcpClient01 {
    public static void main(String[] args) {
        try {
            // 3. Socket 객체를 생성하여 통신을 요청
            Socket socket = new Socket("172.30.1.55", 9001);
            // 서버에서 받은 데이터를 받기 위한 스트림
            InputStream is = socket.getInputStream();
            for (int i = 0; i < 10; i++) {
                System.out.println("서버로 부터 받은 데이터 : " + is.read());
            }
            is.close();
            socket.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

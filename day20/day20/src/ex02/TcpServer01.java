package ex02;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

// TCP 방식의 프로그래밍 절차
public class TcpServer01 {
    public static void main(String[] args) {
        Random rs = new Random();
        try {
            // 1. ServerSocket 생성
            ServerSocket server = new ServerSocket(9001);
            System.out.println("통신 준비 완료!!");
            // 2. 클라이언트의 접속을 무한 대기 상태로 대기
            while (true) {
                // 4. accept 메서드가 호출되어 통신을 수락하는데 이 때 Socket을 반환
                Socket socket = server.accept();
                System.out.println("------- 클라이언트가 연결하였습니다. --------");
                // 클라이언트에게 데이터를 내보내기 위한 스트림
                OutputStream os = socket.getOutputStream();


                for (int i = 0; i < 10; i++) {
                    int re = rs.nextInt(100) + 1;
                    os.write(re);

                    Thread.sleep(200);
                }
                System.out.println("데이터 전송 완료!");
                os.close();
                socket.close();
            }

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

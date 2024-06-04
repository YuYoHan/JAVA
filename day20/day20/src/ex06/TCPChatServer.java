package ex06;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

class ServerThread extends Thread {
    Socket socket;
    InputStream inputStream;
    OutputStream outputStream;


    public ServerThread(Socket socket) {

        // 연결된 클라이언트와 데이터를 주고받기 위한 입출력 스트림 생성
        try {
            inputStream = socket.getInputStream();
            outputStream = socket.getOutputStream();
        } catch (Exception e) {
            throw new RuntimeException("예외처리 : " + e.getMessage());
        }
    }
    // 나와 연결된 클라이언트에게 메시지를 보내는 메서드
    public void send(byte[] arr) throws Exception {
        outputStream.write(arr);
    }

    // 연결되어진 모든 클라이언트들에게 메시지를 방송하는 메서드
    public void sendAll(byte[] arr) throws Exception {
        for (ServerThread st : TCPChatServer.list) {
            st.send(arr);
        }
    }

    public void run() {
        // 클라이언트로 부터 수신된 데이터를 받기 위한 배열을 만든다.
        byte[] data = new byte[100];
        try {
            // 연결된 클라이언트와 계속 통신
            while (true) {
                inputStream.read(data);
                sendAll(data);
                outputStream.write(data);
                String msg = new String(data, StandardCharsets.UTF_8);
                System.out.println("수신된 데이터 : " + msg);
                Arrays.fill(data, (byte) 0);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class TCPChatServer {
    // 연결된 클라이언트를 상대할 ServerThread의 리스트를 선언
    public static ArrayList<ServerThread> list;
    public static void main(String[] args) {
        // 리스트를 생성
        list = new ArrayList<ServerThread>();
        try {
            // 서버 소켓 생성
            ServerSocket server = new ServerSocket(9003);

            // 무한 대기 상태로 클라이언트 접속 대기
            while (true) {
                // 클라이언트 접속을 수락
                Socket socket = server.accept();
                System.out.println(socket);

                // 연결한 클라이언트를 상대하여 계속 통신할 쓰레드를 생성
                ServerThread st = new ServerThread(socket);
                // 쓰레드 가동
                st.start();
                // 리스트에 담아준다.
                list.add(st);
            }
        } catch (Exception e) {
            System.out.println("예외 발생 : " + e.getMessage());
        }
    }
}

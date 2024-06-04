package ex03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
*   java UDPSender 172.30.1.55 hello?
*
* */
public class UDPSender {
    public static void main(String[] args) {
        try {
            // 1. DatagramSocket 생성
            DatagramSocket socket = new DatagramSocket();
            InetAddress addr = InetAddress.getByName(args[0]);
            int port = 9002;
            byte[] data = args[1].getBytes();

            // 2. DatagramPacket 생성
            DatagramPacket packet =
                    new DatagramPacket(data, data.length, addr, port);

            // 3. send에 packet을 담아서 보낸다.
            socket.send(packet);

            // 4. 사용했던 자원 닫기
            socket.close();

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}

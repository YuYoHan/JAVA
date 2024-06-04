package ex03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class UDPReceiver {
    public static void main(String[] args) {
        byte[] data = new byte[100];
        try {
            // 1. DatagramSocket 생성
            DatagramSocket socket = new DatagramSocket(9002);
            // 2. DatagramPacket 생성
            DatagramPacket packet =
                    new DatagramPacket(data, data.length);

            while (true) {
                // 3. receive를 통해 데이터를 수신
                socket.receive(packet);
                // packet을 만들 때 만들어준 byte[] data에 담아준 것을
                // 문자열로 바꾼다.
                String str = new String(data, StandardCharsets.UTF_8);
                System.out.println(str);
                Arrays.fill(data, (byte) 0);
            }

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}

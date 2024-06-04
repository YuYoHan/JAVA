package ex01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) {
        try {
            InetAddress adr = InetAddress.getByName("www.naver.com");
            System.out.println(adr); // www.naver.com/223.130.192.247
            System.out.println("주소 : " + adr.getAddress());
            System.out.println("호스트 네임 : " + adr.getHostName()); // www.naver.com

            InetAddress[] adr2 = InetAddress.getAllByName("www.naver.com");
            for (InetAddress addr : adr2) {
                System.out.println(addr);
            }
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}

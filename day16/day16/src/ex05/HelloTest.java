package ex05;

import java.time.LocalDateTime;
import java.util.Date;

public class HelloTest {
    public static void main(String[] args) {
        SayHello sh = new SayHello();
        while (true) {
            sh.start();
            System.out.println("전체시간 : " +LocalDateTime.now());
            System.out.println(LocalDateTime.now().getMinute() + "분");
            System.out.println(LocalDateTime.now().getSecond()+ "초");
        }
    }
}

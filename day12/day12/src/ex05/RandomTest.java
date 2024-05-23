package ex05;

import java.util.Random;
import java.util.Set;

public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random();
        // int의 범위 내에서 무작위로 뽑아준다.
        int data = r.nextInt();
        System.out.println(data);
        int data2 = r.nextInt(10);
        System.out.println(data2);
        int data3 = r.nextInt(10)+1;
        System.out.println(data3);

    }
}

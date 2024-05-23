package ex05;

import java.util.Random;

public class RandomTest02 {
    public static void main(String[] args) {
        // 1~10사이의 난수 만들기
        Random r = new Random();
        int data = r.nextInt();
        if(data < 0) {
            data = data * -1;
        }
        data = data % 10 + 1;
        System.out.println(data);


//        Random r = new Random();
//        int data1 = r.nextInt(10) + 1;
//        System.out.println(data1);
    }
}

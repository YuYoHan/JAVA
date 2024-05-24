package file;

import java.util.Scanner;

// 어떤 사람의 이름, 주소, 전화를 입력받아 출ㄺ하는 프로그램
public class FileTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, addr, phone;
        System.out.println("이름 입력 : ");
        name = sc.next();
        System.out.println("주소 입력 : ");
        addr = sc.next();
        System.out.println("폰 번호 입력 : ");
        phone = sc.next();

        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("번호 : " + phone);
    }
}

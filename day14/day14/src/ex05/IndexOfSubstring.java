package ex05;

import java.util.Scanner;

// 어떤 사람의 이메일을 입력받아서
// 아이디만 추출하여 출력하는 프로그램을 작성
public class IndexOfSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이메일 입력 : ");
        String email = sc.next();

        int i = email.indexOf("@");
        String substring = email.substring(0, i);
        System.out.println(substring);
    }
}

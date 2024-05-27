package ex09;

import java.util.Scanner;

public class CheckEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("이메일 체크 : ");
        String email = sc.next();
        String regex =
                "^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$";

        if(email.matches(regex)) {
            System.out.println("올바른 이메일 형식입니다.");
        } else {
            System.out.println("올바른 이메일 형식이 아닙니다.");
        }
    }
}

package ex06;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import static java.time.LocalDate.*;

// 사용자한테 주민번호를 입력받아서
// 나이를 계산하여 출력하는 프로그램을 작성
public class AgeFromJumin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("주민번호 입력 : ");
        String ageYear = sc.next();
        String substring = ageYear.substring(0, 2);
        String year = "19" + substring;
        System.out.println(year);
        int a = now().getYear() - Integer.parseInt(year);
        System.out.println(a);

    }
}

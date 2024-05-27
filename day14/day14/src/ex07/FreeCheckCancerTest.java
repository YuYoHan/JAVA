package ex07;

import java.time.LocalDate;
import java.util.Scanner;

public class FreeCheckCancerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("주민번호 입력 : ");
        String ageYear = sc.next();
        // 나이 구하기 위해서
        String substring = ageYear.substring(0, 2);
        String year = "19" + substring;
        System.out.println("출생년도 check : " +year);
        // 성별 구하기 위해서
        int i = ageYear.indexOf("-");
        String sex = ageYear.substring(i, 1);
        int toIntYear = Integer.parseInt(year);
        System.out.println("성별체크 : " +sex);
        String result = "", result2="";

        int thisYear = LocalDate.now().getYear();
        System.out.println("현재년도 체크 : " + thisYear);
        int age = thisYear - toIntYear;
        System.out.println("나이 체크 : " + age);

        if(age < 40) {
            System.out.println("나이가 어려서 무료 검사가 아닙니다.");
        }

        if(toIntYear % 2 ==0) {
            result = "짝수 연도에 태어난 사람입니다.";
        }
        if(toIntYear % 2 == 1) {
            result = "홀수 연도에 태어난 사람입니다.";
        }
        if(age >= 40 && sex.equals("1")) {
            result2 = "40세 이상 남자 위암, 간암, 일반암";
        } else if (age >= 50 && sex.equals("1")) {
            result2 = "50세 이상 남자 위암, 간암, 일반암, 대장암";
        }

        if(age >= 40 && sex.equals("2")) {
            result2 = "40세 이상 여자 위암, 간암, 일반암, 자궁암, 유방암";
        } else if (age >= 50 && sex.equals("2")) {
            result2 = "50세 이상 여자 위암, 간암, 일반암, 대장암, 자궁암, 유방암";
        }

        System.out.printf("현재 나이는 %d이고 %d에 태어났으므로 %s이고 검사 항목은 %s입니다."
        ,age, toIntYear, result, result2);

    }
}

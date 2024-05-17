
import java.util.Date;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date d = new Date();
        String name, sex, str, result = "";
        int bornYear, thisYear, age;
        String regex = "^[ㄱ-ㅎ|가-힣]*$";

        System.out.println("이름을 입력하세요 ");
        name = sc.next();
        System.out.println("출생연도를 입력하세요");
        bornYear = sc.nextInt();
        System.out.println("성별을 입력하세요");
        sex = sc.next();

        thisYear = (d.getYear() + 1900);
        age = thisYear - bornYear;
        Math
        if (!name.matches(regex)) {
            System.out.println("한글만 가능합니다.");
            return;
        } else if (sex.matches(regex)) {
            System.out.println("한글만 가능합니다.");
            return;
        }


        if (age < 40) {
            System.out.printf("나이가 %s라서 아직 검사받을 나이가 아닙니다.", age);
            return;
        }
        if (bornYear % 2 == 0) {
            str = "짝수";
        } else {
            str = "홀수";
        }

        if (age >= 40 && age < 50) {
            if (sex.equals("남자")) {
                result = "위암, 간암";
            } else {
                result = "위암, 간암, 유방암, 자궁암";
            }
        } else if (age >= 50) {
            if (sex.equals("남자")) {
                result = "위암, 간암, 대장암";
            } else {
                result = "위암, 간암, 대장암, 유방암, 자궁암";
            }
        }

        System.out.printf("이름은 %s이고 \n" +
                        "%d년생으로 나이는 %d여서 %s연도에 태어나셨고 " +
                        "검사항목은 다음과 같습니다. \n" +
                        "%s"
                , name, bornYear, age, str, result);
    }


}

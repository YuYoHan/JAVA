package ex08;

import java.util.Scanner;

public class CheckTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = {2,3,4,5,6,7,0,8,9,2,3,4,5};
        int r = 0;
        int check = 0;
        String jumin;
        System.out.println("주민 입력 : ");
        jumin = sc.next();
        // 사용자가 입력한 주민번호의 맨 마지막 자리를 check에 저장
        check = Integer.parseInt(jumin.charAt(jumin.length()-1) + "");
        // 반복문 0부터 주민번호 길이 -1보다 적을 때 까지 수행하여
        // 각자리에 해당하는 곱하기를 수정하여 누적
        for (int i = 0; i < jumin.length() -1; i++) {
            if(i == 6) {
                continue;
            }
            r = r + n[i] * Integer.parseInt(jumin.charAt(i) +"");
        }
        // 누적된 결과에 11로 나눈 나머지를 구합니다.
        r = r % 11;
        // 11에서 그결과를 빼준다.
        r = 11 - r;

        if(r == 10) {
            r = 0;
        }
        if(r == 11) {
            r = 1;
        }

        if(r == check) {
            System.out.println("올바른 주민번호입니다.");
        } else {
            System.out.println("올바른 주민번호가 아닙니다.");
        }
    }
}

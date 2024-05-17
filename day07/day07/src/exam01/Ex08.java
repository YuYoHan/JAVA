package exam01;

import java.util.Scanner;

public class Ex08{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student data = new Student();
        System.out.print("학생 이름 : ");
        data.name = sc.next();
        System.out.print("국어 점수 : ");
        data.kor = sc.nextInt();
        System.out.print("영어 점수 : ");
        data.eng = sc.nextInt();
        System.out.print("수학 점수 : ");
        data.math = sc.nextInt();

        // 총점
        data.tot = data.kor + data.eng + data.math;
        // 평균
        data.avg = (double) data.tot / 3;

        System.out.printf("%s 학생은 \n국어 : %d\n수학 : %d\n" +
                        "영어 : %d\n총점 : %d\n평균 : %.1f\n",
                data.name, data.kor, data.math, data.eng, data.tot, data.avg);
    }
}

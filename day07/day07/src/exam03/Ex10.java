package exam03;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Student 클래스 참조 변수를 5개 만든 것이다.
        Student[] data = new Student[5];

        // 이름, 점수, 총점, 평균 구해서 객체에 넣기
        getScore(data, sc);
        // 내림차순으로 정렬
        getSortByDesc(data);
        // 정렬한 결과값을 출력
        getPrint(data);
    }

    private static void getScore(Student[] data, Scanner sc) {
        for (int i = 0; i < data.length; i++) {
            // 객체 생성
            data[i] = new Student();
            System.out.print("학생 이름 : ");
            data[i].name = sc.next();
            System.out.print("국어 점수 : ");
            data[i].kor = sc.nextInt();
            System.out.print("영어 점수 : ");
            data[i].eng = sc.nextInt();
            System.out.print("수학 점수 : ");
            data[i].math = sc.nextInt();

            // 총점
            data[i].tot = data[i].kor + data[i].eng + data[i].math;
            // 평균
            data[i].avg = (double) data[i].tot / 3;
        }
    }

    private static void getSortByDesc(Student[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = i+1; j < data.length; j++) {
                if(data[j].tot > data[i].tot) {
                    Student temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }

    private static void getPrint(Student[] data) {
        System.out.println("-----------성적 출력-----------");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%d번째 %s 학생은 \n국어 : %d\n수학 : %d\n" +
                            "영어 : %d\n총점 : %d\n평균 : %.1f\n",
                    i+1,
                    data[i].name,
                    data[i].kor,
                    data[i].math,
                    data[i].eng,
                    data[i].tot,
                    data[i].avg);
            System.out.println("---------------------------");
        }
    }
}

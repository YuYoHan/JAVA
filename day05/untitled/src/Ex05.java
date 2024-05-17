import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = new String[5];
        int[] score = new int[5];

        for (int i = 0; i < name.length; i++) {
            System.out.print(i+1 + "번째 학생 이름 : ");
            name[i] = sc.next();
            System.out.print(i+1 + "번째 학생 점수 : ");
            score[i] = sc.nextInt();
        }

        int max = score[0];
        int maxPosition = 0;
        int min = score[0];
        int minPosition = 0;
        for (int i = 1; i < score.length; i++) {
            if(score[i] > max) {
                max = score[i];
                minPosition = i;
            } else if(score[i] < min) {
                min = score[i];
                minPosition = i;
            }
        }
        System.out.printf("최고점수의 학생은 %d점으로 %s입니다.", max, name[minPosition]);
        System.out.printf("최저점수의 학생은 %d점으로 %s입니다.", min, name[minPosition]);

    }
}

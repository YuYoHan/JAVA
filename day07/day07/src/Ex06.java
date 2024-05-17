import java.util.Arrays;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = new String[5];
        int[] kor = new int[5];
        int[] eng = new int[5];
        int[] mat = new int[5];
        int[] tot = new int[5];
        double[] avg = new double[5];

        for (int i = 0; i < name.length; i++) {
            System.out.printf("%d번째 학생의 이름을 입력 ==> \n", i + 1);
            name[i] = sc.next();

            // 국어
            System.out.printf("%d번째 학생의 국어 점수 : \n", i + 1);
            kor[i] = sc.nextInt();
            // 수학
            System.out.printf("%d번째 학생의 수학 점수 : \n", i + 1);
            mat[i] = sc.nextInt();
            System.out.printf("%d번째 학생의 영어 점수 : \n", i + 1);
            eng[i] = sc.nextInt();
        }

        for (int i = 0; i < tot.length; i++) {
            tot[i] = eng[i] + mat[i] + kor[i];
            avg[i] = (double) tot[i] / 3;
        }

        for (int i = 0; i < name.length; i++) {
            System.out.printf("%s 학생은 \n국어 : %d\n수학 : %d\n" +
                            "영어 : %d\n총점 : %d\n평균 : %.1f\n",
                    name[i], kor[i], mat[i], eng[i], tot[i], avg[i]);
        }
        // 성적이 높은 순으로 정렬하기
        for (int i = 0; i < tot.length; i++) {
            for (int j = i + 1; j < tot.length; j++) {
                if (tot[j] > tot[i]) {
                    String temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;

                    int temp2 = kor[i];
                    kor[i] = kor[j];
                    kor[j] = temp2;

                    temp2 = mat[i];
                    mat[i] = mat[j];
                    mat[j] = temp2;

                    temp2 = eng[i];
                    eng[i] = eng[j];
                    eng[j] = temp2;

                    temp2 = tot[i];
                    tot[i] = tot[j];
                    tot[j] = temp2;

                    double temp3 = avg[i];
                    avg[i] = avg[j];
                    avg[j] = temp3;
                }
            }
        }
        System.out.println("-----------내림차순 성적순으로 정렬한 결과-----------");
        for (int i = 0; i < name.length; i++) {
            System.out.printf("%s 학생은 \n국어 : %d\n수학 : %d\n" +
                            "영어 : %d\n총점 : %d\n평균 : %.1f\n",
                    name[i], kor[i], mat[i], eng[i], tot[i], avg[i]);
        }
    }
}

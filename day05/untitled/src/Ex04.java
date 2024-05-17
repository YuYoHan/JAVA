import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[5];
        int max;
        int maxPosition = 0;

        for (int i = 0; i < n.length; i++) {
            System.out.println(i+1 + "번째 점수 입력 : ");
            n[i] = sc.nextInt();
        }

        max = n[0];

        for (int i = 0; i < n.length; i++) {
            max = Math.max(max, n[i]);

            maxPosition = Arrays.toString(n).indexOf(max);
        }
        System.out.println("최대값 : " + max);
        System.out.println("최대값 위치 : " + maxPosition);

    }
}

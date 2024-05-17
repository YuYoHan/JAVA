import java.util.Scanner;

// 사용자한테 N을 입력받고 1~N까지의 합을 누적하여 출력
public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, n2=1, n3= 1,sum;
        System.out.println("N의 숫자를 입력하세요 ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);

        while (n2 <= n) {
            System.out.println(sum);
            sum += n2;
            n2++;
        }

        do {
            System.out.println(sum);
            n3++;
        } while (n3 <= n);
    }
}

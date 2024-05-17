import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int add;

        System.out.println("1번 숫자 입력 : ");
        a = sc.nextInt();
        System.out.println("2번 숫자 입력 : ");
        b = sc.nextInt();

        add = a + b;

        System.out.println("합계 : " + add);


    }
}

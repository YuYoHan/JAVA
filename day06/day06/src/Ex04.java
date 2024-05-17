import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double[] readings;

        System.out.println("배열의 크기를 정해주세요");
        n = sc.nextInt();

        readings = new double[n];
        System.out.println(readings.length);
    }
}

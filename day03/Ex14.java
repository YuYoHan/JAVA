import java.util.Scanner;

class E14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;

		System.out.println("1번 정수");
		a = sc.nextInt();
		System.out.println("2번 정수");
		b = sc.nextInt();

		c = a > b ? a : b;
		System.out.println(c);
	}
}

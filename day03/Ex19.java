import java.util.Scanner;
class Ex19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, n2, n3;
		int result;

		System.out.println("숫자 입력 하세요 ");
		n = sc.nextInt();
		System.out.println("숫자 입력 하세요 ");
		n2 = sc.nextInt();
		System.out.println("숫자 입력 하세요 ");
		n3 = sc.nextInt();

		if(n > n2) {
			if(n > n3) {
				result = n;
			} else {
				result = n3;
			}
		} else {
			if(n2 > n3) {
				result = n2;
			} else {
				result = n3;
			}
		}
		System.out.println(result);
	}
}

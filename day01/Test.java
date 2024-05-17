import java.util.Scanner;
public class Test{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int num2;

		System.out.print("첫 번째 임의의 수 를 입력하세요 : ");
		num = sc.nextInt();
		System.out.print("두 번째 임의의 수 를 입력하세요 : ");
		num2 = sc.nextInt();

		if(num > num2) {
			System.out.print(num);
		} else if(num2 > num) {
			System.out.print(num2);
		} else {
			System.out.print("동일한 값을 입력했습니다.");
		}
	}
}
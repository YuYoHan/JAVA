import java.util.Scanner;
public class EvenOddTest03{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		// 초기값
		String result = "홀수";
	
		System.out.print("임의의 수를 입력하세요 ==> ");
		num= sc.nextInt();
		
		if(num % 2 == 0) {
			result = "짝수";
		}
		System.out.print(result);
		
	}
}
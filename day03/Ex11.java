import java.util.Scanner;
import java.util.Date;
class Ex11 {
	// & 과 |는 논리연산자로 사용할 수 있다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date d = new Date();
		int year;
		int thisYear, check;
		String result = "무료가 아닙니다.";

		thisYear = d.getYear() + 1900;
		System.out.println("출생년도를 입력하세요 ");
		year = sc.nextInt();

		check = thisYear - year;

		if(check >= 40 & check % 2 ==0) {
			result = " 무료입니다.";
		}
		System.out.println(result);

		if(check >= 40 && check % 2 ==0) {
			result = " 무료입니다.";
		}
		System.out.println(result);
	}
}

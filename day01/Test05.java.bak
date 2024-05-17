import java.util.Scanner;
public class Test05{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		int ageYear;
		int age;
		String result = "무료 암검진 대상자가 아닙니다.";

		System.out.print("이름을 입력하세요 ==> ");
		name = sc.next();
		System.out.print("출생연도를 입력하세요 ==> "); 
		ageYear = sc.nextInt();
		age = 2024 - ageYear; 
		if(age >= 40) {
			result = "무료 암검진 대상자 입니다.";
		}

		System.out.println("*** 무료 암검진 판별 결과 *** ");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("결과 : " + result);

	}
}
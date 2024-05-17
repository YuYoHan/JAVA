import java.util.Scanner;
// 가로 길이, 세로 높이를 입력받아서 면적을 구하는데 소숫점 2자리가지만 출력
class Ex01 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double a, b;
		double result;

		System.out.println("가로 길이 : ");
		a = sc.nextDouble();
		System.out.println("세로 길이 : ");
		b = sc.nextDouble();

		result = a * b;
		System.out.printf("사각형의 면적은 %.2f", result);
		


	}
}
/*
	1. byte
	2. int
	3. char
	4. double
	5. float
	6. boolean
	7. short
	8. long

	산술 연산자 종류
	/ , *, %, +, -

	증감 연산자
	i++, ++i, --i, i--

	비교연산자
	>, <, <=, >=, ==, !=

*/
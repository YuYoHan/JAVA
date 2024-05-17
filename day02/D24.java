import java.util.Scanner;
class D23 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num;
		String result = "6의 배수 아님";

		System.out.println("임의의 수를 입력하세요 ");
		num = sc.nextInt();

		if(num % 6 == 0) {
			result = "6의 배수임";
		}
		System.out.println(result);
	}
}

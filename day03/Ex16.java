import java.util.Scanner;
class Ex16 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("임의의 수를 입력");
		n = sc.nextInt();

		if(n < 0) {
			n = n * n;
		}
		System.out.println(n);
	}
}

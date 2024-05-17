import java.util.Scanner;

class  Ex07
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a;
		a = new int[5];
		int n;

		System.out.println("숫자는 다섯번 입력 가능");
		for (int i = 0; i < 5;i++ ){
			System.out.println("숫자 입력");
			n = sc.nextInt();
			a[i] = n;
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}


		
		

	}
}

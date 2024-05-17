import java.util.Scanner;
class Ex24 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n, n2, n3, result;

		System.out.println("정수 입력 : ");
		n = sc.nextInt();
		System.out.println("정수 입력 : ");
		n2 = sc.nextInt();
		System.out.println("정수 입력 : ");
		n3 = sc.nextInt();

		if(n < n2) {
			if(n < n3) {
				result = n; 
			} else {
				result = n3;
			}
		} else {
			if(n2 < n3) {
				result = n2;
			} else {
				result = n3;
			}
		}
		System.out.println(result);
	}
}

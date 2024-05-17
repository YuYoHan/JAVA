import java.util.Scanner;
class Ex25 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.println("x값을 넣어주세요 ");
		x = sc.nextInt();
		

		double y = (x * x * x) - (9 * x) + 2;
		System.out.println(y);
		double z = (7 *x) + 2;
		System.out.println(z);
	}
}

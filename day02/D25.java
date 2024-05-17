import java.util.Scanner;
class D25
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i;
		int result;

		System.out.print("╪Ж ют╥б : ");
		i = sc.nextInt();

		
		for (int i = 1; 1 <= i; i++){
			if(i % 3 == 0) {
				result += i;
			}
		}
		System.out.printf(result);
	}
}

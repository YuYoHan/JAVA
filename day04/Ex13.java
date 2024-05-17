import java.util.Scanner;
class Ex12
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int dan, i=1;
		System.out.println("몇단을 할꺼?");
		dan = sc.nextInt();

		while(flag) {
			System.out.printf("%d x %d = %d", dan, i, (dan *i));
			i++;
			if(i > 9) {
				flag = false;	
			}	
		}
	}
}

import java.util.Scanner;
class Ex14
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int dan, i=1;
		System.out.println("몇단을 할꺼?");
		dan = sc.nextInt();

		while(true) {
			System.out.printf("%d x %d = %d", dan, i, (dan *i));
			i++;
			if(i > 9) {
				break;	
			}	
		}
	}
}

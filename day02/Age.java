import java.util.Scanner;
class  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int age;
		int age2;
		int age3;
		int avg;

		System.out.println("아빠 나이를 입력하세요 : ");
		age = sc.nextInt();
		System.out.println("엄마 나이를 입력하세요 : ");
		age2 = sc.nextItnt();
		System.out.println("아들 나이를 입력하세요 : ");
		age3 = sc.nextInt();
		avg = (age + age2 + age3)/3;
		System.out.println(avg);

	}
}

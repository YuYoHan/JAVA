import java.util.Scanner;
public class AboutMe2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;

		System.out.print("당신의 이름은 무엇입니까? ");
		name = sc.next();
		System.out.println("나의 이름은 " + name+ "입니다.");

		System.out.print("당신의 나이는 몇살입니까? ");
		age = sc.nextInt();
		System.out.println("나의 나이는 " + age + "입니다.");
	}
} 
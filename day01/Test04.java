import java.util.Scanner;
public class Test04{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age; 
		String result = "입장 불가능";
		System.out.println("몇살이냐?");
		age = sc.nextInt();
		System.out.println(age);
		
		if(age >= 20) {
			result = "입장 가능";
		}
		System.out.println(result);

	}
}
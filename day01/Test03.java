import java.util.Scanner;
public class Test03{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age; 
		String result = "";
		System.out.println("몇살이냐?");
		age = sc.nextInt();
		System.out.println(age);
		
		if(age >= 20) {
			result = "입장가능";
		} else {
			result = "입장불가능";
		}
		System.out.println(result);

	}
}
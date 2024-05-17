import java.util.Scanner;
class E23 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		String result = "당첨되지 않았습니다.";
		System.out.println("1~10사이의 번호를 입력하세요");
		n = sc.nextInt();

		if(n <= 0 || n > 10) {
			System.out.println("잘못된 수를 입력했습니다.");
			return;
		}

		if(n == 2) {
			result = "1등 당첨되었습니다. 축하합니다!!!";
		} else if(n == 5) {
			result = "2등 당첨되었습니다. 축하합니다!!";
		} else if(n ==7) {
			result = "3등 당첨되었습니다. 축하합니다!";
		} 
		System.out.println(result);
	}
}

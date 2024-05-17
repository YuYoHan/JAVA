import java.util.Scanner;
class D09{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		char ch;
		boolean flag = true;
		int i = 0;
		int sum = 0;

		System.out.print("문자열을 입력해주세요 : ");
		str = sc.next();

		while(true) {
			ch = str.charAt(i);
			i += 1;
			if(ch == 'A') {
				sum++;
			}
		
			System.out.println("A의 합계 : " + sum);
		}
	}
}

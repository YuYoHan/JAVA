import java.util.Scanner;
class Ex20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		String str;

		System.out.println("0~9 사이의 숫자를 입력하세요 ");
		n = sc.nextInt();

		if(n == 0) {
			str = "영";
		} else if(n == 1) {
			str = "일";
		} else if(n == 2) {
			str = "이";
		} else if(n == 3) {
			str = "삼";
		} else if(n == 4) {
			str = "사";
		} else if(n == 5) {
			str = "오";
		} else if(n == 6) {
			str = "육";
		} else if(n == 7) {
			str = "칠";
		} else if(n == 8) {
			str = "팔";
		} else if(n == 9) {
			str = "구";
		} else {
			str = "이상한 숫자는 쓰지말아";
		} 
		System.out.println(str);
	}
}

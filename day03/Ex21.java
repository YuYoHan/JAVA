import java.util.Scanner;
class Ex21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int month;
		String str;

		System.out.println("월을 입력해주세요");
		month = sc.nextInt();

		if(month == 1 ||
			month == 3 ||
			month == 5 ||
			month == 7 ||
			month == 8 || 
			month == 10 || 
			month == 12) {
			str = "31일 까지 있어요";
		}  else if(month == 4 || month == 6 || month == 9 || month == 11) {
			str = "30일 까지 있어요";
		} else if(month == 2) {
			str = "28일까지 있어요";
		} else {
			str = "달력모름?";
		}
		System.out.println(str);
	}
}

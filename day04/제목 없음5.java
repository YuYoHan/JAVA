import java.util.Scanner;
class Ex05{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int month, day;
		String result;

		System.out.println("이름을 입력 : ");
		name = sc.next();
		System.out.println("출생월 : ");
		month = sc.nextInt();
		System.out.println("출생일 : ");
		day = sc.nextInt();

		if(month < 1 || month > 12) {
			System.out.println("잘못입력");
			return;
		}

		if(day < 1 || day > 31) {
			System.out.println("잘못입력");
			return;
		}


		switch(month) {
		case 1: case 2:
			if(day >= 1 || day <= 20) {
				result = "물병자리";
				break;
			} else if(month == 2 && day >= 19) {
				result = "물고기자리";
				break;
			}
		case 2 : case 3 :
			if(day >= 
		
		}
	}
}

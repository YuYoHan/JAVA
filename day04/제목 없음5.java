import java.util.Scanner;
class Ex05{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int month, day;
		String result;

		System.out.println("�̸��� �Է� : ");
		name = sc.next();
		System.out.println("����� : ");
		month = sc.nextInt();
		System.out.println("����� : ");
		day = sc.nextInt();

		if(month < 1 || month > 12) {
			System.out.println("�߸��Է�");
			return;
		}

		if(day < 1 || day > 31) {
			System.out.println("�߸��Է�");
			return;
		}


		switch(month) {
		case 1: case 2:
			if(day >= 1 || day <= 20) {
				result = "�����ڸ�";
				break;
			} else if(month == 2 && day >= 19) {
				result = "������ڸ�";
				break;
			}
		case 2 : case 3 :
			if(day >= 
		
		}
	}
}

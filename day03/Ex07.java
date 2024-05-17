import java.util.Scanner;
class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pw, checkPw;
		String result = "일치하지 않습니다.";

		System.out.println("비밀번호 : ");
		pw = sc.next();
		System.out.println("비밀번호 체크 : ");
		checkPw = sc.next();
		boolean check = pw.length() >= 8 && checkPw.length() >= 8;


		if(pw.equals(checkPw) && check) {
			result = "비밀번호가 일치합니다.";
		}

		
		System.out.println(result);
	}
}

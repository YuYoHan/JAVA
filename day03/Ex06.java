import java.util.Scanner;
class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pw, checkPw;
		String result = "일치하지 않습니다.";

		System.out.println("비밀번호 : ");
		pw = sc.next();
		System.out.println("비밀번호 체크 : ");
		checkPw = sc.next();


		if(pw.equals(checkPw)) {
			result = "비밀번호가 일치합니다.";
		}

		
		System.out.println(result);
	}
}

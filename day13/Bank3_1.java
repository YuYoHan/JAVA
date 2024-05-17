package J2day4;
// 3-1
public interface Bank3_1 {
	// 상수(최대 고객에게 인출해 줄 수 있는 금액 명시)
	public static final int MAX_INTEGER = 1000000;
	
	// 추상메소드(인출하는 메소드)
	public abstract void withDraw(int price);
	
	// 추상메소드(입금하는 메소드)
	public abstract void deposit(int price);
	
	// JAVA8에서 가능한 defualt 메소드(고객의 휴면계좌 찾아주는 메소드)
	default String findDormancyAccount(String custId) {
		System.out.println("**금융개정법안 00이후 고객의 휴면 계좌 찾아주기 운동**");
		System.out.println("**금융결제원에서 제공하는 로직**");
		return "00은행 000-000-0000-00";
	}	
//	 JAVA8에서 가능한 정적 메소드(블록체인 인증을 요청하는 메소드)
	public static void BCAuth(String bankName){
		System.out.println(bankName+" 에서 블록체인 인증을 요청합니다.");
		System.out.println("전 금융사 공통 블록체인 로직 수행");
		}
	
}

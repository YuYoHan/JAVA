package J2day4;
// 3-3
public class SHBank3_3 implements Bank3_1 {

	@Override
	public void withDraw(int price) {
		System.out.println("SH은행만의 인출 로직---");
		if(price < Bank3_1.MAX_INTEGER) {
			System.out.println(price + " 원을 인출합니다.");
		} else {
			System.out.println(price+" 원을 인출실패.");
		}
		
	}

	@Override
	public void deposit(int price) {
		System.out.println("SH은행만의 입금 로직..."+price+" 원을 입금한다.");
		System.out.println("SH은행은 별도의 후행처리 작업을 따로 한다.");
	}
	//JAVA8에서 가능한 defualt 메소드(고객의 휴면계좌 찾아주는 메소드)
	@Override
	public String findDormancyAccount(String custId) {
		System.out.println("**금융개정법안 00이후 고객의 휴면계좌 찾아주기 운동**");
		System.out.println("*SH은행만의 로직 적용*");
		return "00은행 000-000-0000-00";
		// SH은행은 휴면계좌 찾아주기 메소드를 재정의하여 SH은행사 만의 휴면계좌 찾아주기 로직을 재구현했다.
	}
	
	
	
}

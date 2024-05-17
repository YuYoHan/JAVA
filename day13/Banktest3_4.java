package J2day4;

public class Banktest3_4 {

	public static void main(String[] args) {
		Bank3_1 bank = new KBBank3_2();
		bank.withDraw(100);
		bank.deposit(100);
		bank.findDormancyAccount("763231");
		Bank3_1.BCAuth("KBBank");
		
		System.out.println("\n*************인스턴스 교체!!***************\n");
		
		bank = new SHBank3_3();
		bank.withDraw(100);
		bank.deposit(100);
		bank.findDormancyAccount("4311");
		Bank3_1.BCAuth("SHBank");
		
		System.out.println("\n*************대학교 주은행  교체!!***************\n");
		
		bank = new KBBank3_2();	// new KBBank();
		bank.withDraw(20000);
		bank.deposit(1000);
		bank.findDormancyAccount("855512");

	}

}

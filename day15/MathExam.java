package j2day6;

public class MathExam {

	public static void main(String[] args) {
		System.out.println("abs 절대값 ========");
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(-10));
		System.out.println(Math.abs(-10.1));
		
		System.out.println("ceil 올림 ========");
		System.out.println(Math.ceil(10.1));
		System.out.println(Math.ceil(10.7));
		System.out.println(Math.ceil(10.456));
		// 소수 2째자리에서 올림하는 방법은?
		System.out.println(Math.ceil(10.456 * 100) / 100.0);		// 소수점 2째자리
		System.out.println(Math.ceil(10.45645 * 1000) / 1000.0);		// 소수점 3째자리
		
		
		System.out.println("floor 버림 =======");
		System.out.println(Math.floor(10.1));
		System.out.println(Math.floor(10.7));
		System.out.println(Math.floor(10.456));
		// 소수 2째자리에서 버림하는 방법은?
		System.out.println(Math.floor(10.456 * 100) / 100.0);
		
		System.out.println("round 반올림 ======");
		System.out.println(Math.round(10.1));
		System.out.println(Math.round(10.5));
		System.out.println(Math.round(10.456));
		// 소수 2째자리에서 반올림하는 방법은?
		System.out.println(Math.round(10.456 * 100) / 100.0);
		
		System.out.println("max 비교후 큰 쪽 반환 ======");
		System.out.println(Math.max(10, 20));
		System.out.println(Math.max(10.1, 10.2));
		
		System.out.println("min 비교후 큰 쪽 반환 ======");
		System.out.println(Math.min(10, 20));
		System.out.println(Math.min(10.1, 10.2));
		
		System.out.println("random 랜덤한 값을 반환 ======");
		System.out.println(Math.random());
		System.out.println((int)Math.floor(Math.random() * 10));
		System.out.println(random(10));
	
		
	}
	public static int random(int value) {
		return (int)Math.floor(Math.random() * value);
	}
}

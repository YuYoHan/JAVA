package j2day6;

public class WrapperExam {
	public static void main(String[] args) {
		// Boxing
		Integer a1 = new Integer(10);
		Integer a2 = new Integer(100);
		
		// version 9 부터 추천 방식
		Integer a3 = Integer.valueOf(10);
		Integer a4 = Integer.valueOf(100);
		Integer a5 = Integer.valueOf("100");
		
//		int aa = 100; 4byte
//		String ab = "100";
//		System.out.println(aa == ab);
		
		System.out.println(a3);
		System.out.println(a4);
		
		System.out.println(a4 == a5);
		System.out.println(a4 + a5);

		// 만약 문자열에 문자가 포함된다면
//		System.out.println(Integer.valueOf("123a"));	// 오류
		
		// Unboxing
		int ab3 = a3.intValue();
		String ab4 = a3.toString();
		
		System.out.println(ab3);
		System.out.println(ab4);
		
		// 실수형 wrapper
		Double d1 = new Double(10.1);
		
		Double d2 = Double.valueOf(10.1);
		Double d3 = Double.valueOf("10.2");
		
		System.out.println(d2);
		System.out.println(d3);
		
		int ad1 = d2.intValue();
		double ad2 = d2.doubleValue();
		
		System.out.println(ad1);
		System.out.println(ad2);
		
		// 오토 박싱 & 언박싱
		// Integer a3 = Integer.valueOf(10); // 명시적 박싱
		// String a = "123";
		Integer au3 = 10;		// Integer a5 = Integer.valueOf("100"); // 명시적 문자열 박싱
		// Integer au4 = "100";	// 문자열로 오토 박싱 불가
		
		int au5 = au3; // 오토 언박싱
		int au6 = au3 + 100;
		
		System.out.println(au5);
		System.out.println(au6);
	}
}

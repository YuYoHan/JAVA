package j2day5;

import java.util.Arrays;

public class StringExam {

	public static void main(String[] args) {
		// 일반적으로  String 클래스 사용시 가장 많이 사용하는 자동 생성 방식
		String str1 = "Hello";
		String str2 = "Hello";
		
		// 클래스 객체 생성 방식대로 new 연산자를 이용한 객체 생성 방식
		String nstr1 = new String("Hello");
		String nstr2 = new String("Hello");
		
		// 메모리 주소 비교
		System.out.printf("str1 addr : 0x%x\n", System.identityHashCode(str1));
		System.out.printf("str2 addr : 0x%x\n", System.identityHashCode(str2));
		
		System.out.printf("nstr1 addr : 0x%x\n", System.identityHashCode(nstr1));
		System.out.printf("nstr1 addr : 0x%x\n", System.identityHashCode(nstr2));
		
		System.out.println("=======================================");
		
		// String 객체 변수의 값을 비교하기 위해 equals를 사용한다.
		System.out.println(str1.equals(str2)); 		// 값동일
		System.out.println(str1.equals(nstr1)); 	// 값동일
		System.out.println(str1.equals(nstr2)); 	// 값동일
		System.out.println(nstr1.equals(nstr2)); 	// 값동일
		System.out.println("=======================================");
		
		// char charAt(int index) 지정된 위치(index)의 문자를 반환한다.
		System.out.println(str1.charAt(1));
		System.out.println(str1.charAt(3));
		
		// int compareTo(String str) 매개변수로 받은 문자열(str)과 사전순 비교
		// 비교해서 동일하면 0을 반환, 앞으면 음수, 뒤면 양수
		System.out.println(str1.compareTo("Hello"));
		System.out.println(str1.compareTo("Gello"));
		System.out.println(str1.compareTo("Iello"));
		System.out.println(str1.compareTo("Hallo"));
		System.out.println(str1.compareTo("hallo"));
		System.out.println("=======================================");
		
		// int indexOf(int ch) 주어진 문자(ch)가 문자열에 존재하는 확인
		// 그리고 위치(index)를 반환한다, 없으면 -1 반환
		System.out.println(str1.indexOf("H"));
		System.out.println(str1.indexOf("I"));
		System.out.println(str1.indexOf("L"));
		System.out.println(str1.indexOf("llo"));
		System.out.println(str1.lastIndexOf("lo"));
		System.out.println("=======================================");
	
		// String substring(int begin)
		// 주어진 시작위치(begin)부터 끝까지 문자열을 반환
		// String substring(int begin, int end);
		// 주어진 begin 부터 끝 end 까지 문자열을 반환
		// 단, 끝위치의 문자는 포함되지 않는다.
		System.out.println(str1.substring(1));
		System.out.println(str1.substring(1,3));
		System.out.println(str1.substring(2,3));
		System.out.println("=======================================");
		
		// int length() 문자열 길이 반환
		System.out.println(str1.length());
		// length와 substring 응용
		System.out.println(str1.substring(1, str1.length()));
		System.out.println(str1.substring(0, str1.length() -1));
		System.out.println("=======================================");
		
		// String replace(char old, char new) 문자열 안 문자(old)를 새로운 문자(new)로 바꿈
		System.out.println(str1.replace("l", "L"));
		System.out.println("=======================================");
		
		// String replaceAll(String regex, String replacement)
		// 일치하는 모든 문자열 치환
		String text = "Welcom Hello Hello Hello";
		System.out.println(text);
		System.out.println(text.replaceAll("Hello", "안녕하세요"));
		System.out.println("=======================================");
		
		// String toUpperCase()
		// 문자열을 전부 대문자로 교체
		System.out.println(str1.toUpperCase());
		System.out.println("=======================================");
		
		// String toLowerCase()
		// 문자열을 전부 소문자로 교체
		System.out.println(str1.toLowerCase());
		System.out.println("=======================================");
		
		// 대소문자가 마구 섞여 있는 경우 맨 앞글자만 대문자로 만들고 싶다.
		String a = "heLlo".toLowerCase();
		a.replace("h", "H");
		// 위에 두 문장을 하나로 하는 법
		System.out.println("heLlo".toLowerCase().replace("h", "H"));
		System.out.println("=======================================");
		
		// String trim()
		// 문자열 앞뒤에 있는 공백을 제거한다.( 단, 중간은 제외)
		System.out.println(" 안녕 하세요 ".trim());
		// 모든 공백 제거
		System.out.println(" 안녕 하세요 ".replaceAll(" ", ""));
		System.out.println("=======================================");
		
		// String[] split(String regex)
		// regex 구분자를 기준으로 문자열을 앞뒤로 쪼개어 배열로 반환
		String sp = "어머나#땅콩#놀이#반갑다!";
		String arr[] = sp.split("#");
		System.out.println(Arrays.toString(arr));
		
		// String join(String delimiter, CharSequence... elements)
		// 문자열 배열을 하나의 문자열로 합쳐 반환한다.
		String jointxt = String.join("#", arr);
		System.out.println(jointxt);
		System.out.println("=======================================");
		
		String retext = String.join(", ", sp.split("#"));
		System.out.println(retext);
		System.out.println(sp.replaceAll("#", ", "));
		System.out.println("=======================================");
	}

}

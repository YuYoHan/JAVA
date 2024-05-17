package day18;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
	public static void main(String[] args) {
		// Set 컬렉션에서 자료형은 Double 실수형으로 예제를
		// Set은 순서가 없고, 중복이 허용되지 않는다
		HashSet<Double> set = new HashSet();
		
		// 값을 추가해보자
		set.add(10.1);	// 오토박싱
		set.add(Double.valueOf(10.2));
		System.out.println(set.toString());
		
		set.add(10.4);
		System.out.println(set.toString());
		
		// 중복이 가능한지 확인
		set.add(10.1);
		System.out.println(set.toString());
		
		// set의 개수 확인
		System.out.println(set.size());
		
		// 일반적으로는 index 형식의 for문을 사용할 수 없다.
//		for (int i = 0; i < set.size(); i++) {
//		}
		
		System.out.println("============================");
		// Iterator을 통한 반복문
		for (Iterator iter = set.iterator(); iter.hasNext();) {
			Double item = (Double) iter.next();
			System.out.println(item);
		}
		
		System.out.println("============================");
		// foreach를 통한 반복문
		for (Double item : set) {
			System.out.println(item);
		}
		
		System.out.println("============================");
		set.remove(10.1);
		
		set.clear();
//		set.removeAll(set);
		System.out.println("============================");
		System.out.println(set.toString());
		
		// 사용 방법 및 메소드 정리
		// 객체 생성(Set는 인터페이스이므로 상속한 자식 클래스로 객체를 생성해야 한다.)
		//Set<Double> set = new HashSet<>();
		set.add(1.1);		// 데이터 추가(무작위 추가됨)
		set.remove(1.1);	// 해당 데이터 삭제
		set.size();			// 컬렉션의 요소(아이템) 개수 확인
		set.clear();		// 모든 데이터 삭제(클리어)
		set.toString();		// 컬렉션의 값을 문자열로 출력
		
		
		System.out.println("============================");
		String[] temps = {"A", "B", "C", "A", "B", "D", "A", "B", "F"};
		System.out.println(temps.length);
		
		// 위의 배열에서 중복을 제거하는 방법
		HashSet<String> ds = new HashSet<>();
		for (String item: temps) {
			ds.add(item);
		}
		
		System.out.println(ds.toString());
	}
}

















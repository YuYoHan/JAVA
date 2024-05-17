package j2day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ListExam {

	public static void main(String[] args) {
		// 기본 배열을 살펴보자
		int[] arr = new int[5];
		arr = new int[] {1,2,3,4,5};
		
		System.out.println(Arrays.toString(arr));
		
		// 위와 같이 5개의 배열을 실행중에 추가하고 싶어도 불가
//		arr[5] = 10;
		
		// 자료구조가 생겨났다. 원시타입 변수는 자료구조로 사용할 수 없다.
		// 클래스 자료만 넣을 수 있다.
//		ArrayList<int> list = new ArrayList<>();
		
		// 그래서 원시타입 변수를 사용하고 싶으면 대신 Wrapper 클래스를 이용한다.
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list.size()); 	// 출력 : 0 ← 데이터는 없음
		
		// 리스트에 값을 추가하여 크기가 자동으로 늘어난다.
		list.add(Integer.valueOf(10));  	// 정석
		list.add(20);						// 자동형변환
		
		System.out.println(list.size());   	// 출력 : 2
		System.out.println(list.toString());// 출력 : [10, 20]
		
		// 현재 크기 내의 인덱스 값을 변경하는 것이 가능하다.
		list.set(0, 50);		// 첫번째 값을 50으로 바꾼다.
		System.out.println(list.toString());
		
		
//		list.set(2, 100);	// 범위를 벗어나서 오류
		System.out.println(list.toString());
		
		// 리스트의 특정 index의 값을 읽어오는 방법
		System.out.println(list.get(0));
		
		System.out.println("====================");
		// 리스트의 값을 순서대로 읽기
		// 컬렉션을 반복하는 방법1
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 컬렉션을 반복하는 방법2(Iterator 이용한 방법)
		for (Iterator iterator = list.iterator(); iterator.hasNext() == true;) {
			Integer item = (Integer) iterator.next();
			System.out.println(item);
		}
		// 컬렉션을 반복하는 방법3(for each)
		for(Integer item : list) {
			System.out.println(item);
		}
		
		// 그리고 삭제도 가능하다.
		list.remove(1);
		System.out.println(list);
		
		// 마지막으로 저장된 모든 객체를 삭제(클리어)
		list.add(30);
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
	}

}

package j2day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class List {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();	// List 선언(ArrayList)
		LinkedList<String> list2 = new LinkedList<String>();// List 선언(LinkedList)
		
		list2.add("E");
		list.add("A");
		list.add("B");
		list.add("C");		// List 추가
		list.add(0, "D");	// 0번째에 D값을 추가(동일한 것이 있을 경우 밀어냄)
		System.out.println("List 값 확인 : " + list);
		System.out.println("List 인덱스 값 확인 : " + list.get(0));
		
		list.remove(2);		// List 삭제(인덱스)
		list.remove("B");	// List 삭제(값으로)
		
		list.set(0, "Z");	// List 값 변경(인덱스, "변경할 값")
		
		System.out.println("List 크기 확인 : " + list.size());
		System.out.println("List 안에 특정 값 들었는지 확인 : " + list.contains("B"));
		System.out.println("List 안에 아무것도 들지 않았는지 확인 : " + list.isEmpty());
		
		list.addAll(list2);	// List에 다른 List 더하기
		String[] arr = {"ARRAY"};
		list.addAll(Arrays.asList(arr));	// 배열을 리스트로 더하기
		System.out.println("List 안에 다른 리스트 더하기 : " + list);
	}

}

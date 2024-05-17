package j2day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExam {
	public static void main(String[] args) {
		// 해시맵은 <key, value>의 한 쌍으로 자료구조가 생성된다.
		HashMap<String, String> map = new HashMap<>();
		
		map.put("no1", "Hello");
		System.out.println(map.toString());
		
		map.put("no2", "안녕하세요");
		System.out.println(map.toString());
		
		// 맵은 키는 중복 불가, 값은 중복 가능
		map.put("no1", "HelloWolcome");
		System.out.println(map.toString());
		map.put("no3", "HelloWolcome");
		System.out.println(map.toString());
		
		System.out.println(map.get("no2"));
		
		// map for문은 한번에 가져오는것도 가능하지만 
		// 아래의 일반적인 방법으로 for문을 사용한다.
		// 1. Set을 통해 keyset을 먼저 가져온다.
		Set<String> keyset = map.keySet();
		System.out.println(keyset);
		
		// 2. keyset을 for문으로 반복하여 값을 가져온다.
		for (String key : keyset) {
			System.out.println(map.get(key));
		}
		
		System.out.println("=============================");
		// 결론은 formap을 통해 key,value를 한번에 가져올수 있다.
		for (Map.Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println("key = " + key + ", value = " + val);			
		}
		System.out.println("=============================");
		
		map.remove("no1");
		map.clear();
		
		System.out.println(map.toString());
		
		// 사용 방법 및 메소드 정리
		// 객체 생성(Set는 인터페이스이므로 상속한 자식 클래스로 객체를 생성해야 한다.)
		//Map<String, String> map = new HashMap<>();
		map.put("1", "Hello");	// 데이터 추가(무작위 추가됨)
		map.remove("1");		// 해당 데이터 삭제
		map.size();				// 컬렉션의 요소(아이템) 개수 확인
		map.clear();			// 모든 데이터 삭제(클리어)
		map.toString();			// 컬렉션의 값을 문자열로 출력	
		
		// 맵을 사용한 일반적인 예제
		// 아이템 빈도수 카운팅
		String[] temps = {"A", "B", "C", "A", "B", "D", "A", "B", "F"};
		HashMap<String, Integer> dm = new HashMap<>();
		for(String item: temps) {
			// item(key) 에 해당하는 아이템이 맵에 있으면
			// 해당 키의 맵의 value에 개수를 하나 증가
			if(dm.containsKey(item)) {
				Integer count = dm.get(item);
				dm.put(item, count + 1);
			} else {
				dm.put(item, 1);
			}
		}
		System.out.println(dm);
	}
}

















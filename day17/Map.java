package j2day8;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		
		// xx.put(key. value);
		map.put("people", "사람");		// 데이터 추가
		map.put("baseball", "야구");		// 데이터 추가
		
		// xx.get(key);
		// key에 해당되는 value 값을 얻기 위해서는 다음과 같이 한다.
		System.out.println(map.get("people"));		// "사람"출력
		// 맵의 key에 해당하는 value가 없을 경우에 get 메서드를 사용하면 다음처럼 null이 리턴된다.
		System.out.println(map.get("java")); 		// null 출력
		// 이때 null 대신 디폴트 값을 얻고 싶은 경우에는 getOrDefault 메서드를 사용한다.
		System.out.println(map.getOrDefault("java", "자바")); 		// "자바"출력
		
		// xx.containsKey(key);
		// containsKey 메소드는 맵(Map)에 해당 키(key)가 있는지를 조사하여 그 결과값을 리턴한다.
		System.out.println(map.containsKey("people"));  // true 출력
		
		// xx.remove(key);
		// remove 메소드는 맵(Map)의 항목을 삭제하는 메소드로 key값에 해당되는 아이템(key, value)을 삭제한 후 그 value 값을 리턴한다.
		// "people"에 해당되는 아이템(people:사람)이 삭제된 후 "사람"이 출력될 것이다.
		System.out.println(map.remove("people"));  // "사람" 출력
		
		// xx.size()
		// size 메소드는 Map의 갯수를 리턴한다.
		System.out.println(map.size());  // 1 출력
		// "people", "baseball" 두 값을 가지고 있다가 "people"항목이 삭제되었으므로 1이 출력될 것이다.
		
		// xx.keyset()
		// keySet은 맵(Map)의 모든 Key를 모아서 리턴한다.
		map.put("football", "축구");
		 System.out.println(map.keySet());  // [baseball, football] 출력
		
	}

}

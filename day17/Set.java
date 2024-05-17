package j2day8;

import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) {
		// 객체 선언
		HashSet<String> set = new HashSet<String>();
		
		// 데이터 삽입 - set.add()
		set.add("apple");
        set.add("banana");
        set.add("pyopyo");
        set.add("kiwi");
        
        // 데이터 삭제 - set.remove(Object e);
        set.remove("apple");
        
        // 값 출력 1(Iterator 사용)
        Iterator<String> iterSet = set.iterator();
        while(iterSet.hasNext()) {
        	System.out.print(iterSet.next() + " ");
        }
        System.out.println();
        // 값 출력 2
        System.out.println(set.toString());
        
        // 값 출력 3
        for(String iter : set) {
        	System.out.println();
        }
        
        // 값 포함 유무 - set.contains(object e)
        System.out.println(set.contains("apple"));		// true
        System.out.println(set.contains("hi"));			// false
        
        //  전체 데이터 삭제 - set.clear()
        set.clear();
        System.out.println(set.toString());				// []

        //  값 존재 유무 - set.isEmpty()
        set.add("apple");
        set.add("banana");
        set.add("pyopyo");
        set.add("kiwi");
        set.add("a");
//        set.add("a");  set에 중복x
        
        System.out.println(set.isEmpty());				// false
        
        //  Set 데이터 크기 - set.size()
        System.out.println(set.size());

	}

}

package ex02;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("사과");
        set.add("수박");
        set.add("오렌지");
        set.add("메론");
        System.out.println(set);

        // set 자체에는 반복 실행할 수 있는 기능이 없다.
        // Iterator : 반복자
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}

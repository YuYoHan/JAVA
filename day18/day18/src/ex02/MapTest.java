package ex02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "A");
        map.put("2", "B");
        map.put("3", "C");
        map.put("4", "D");
        map.put("5", "E");

        for (String key : map.keySet()) {
            System.out.println(key);
            System.out.println("1번 패턴 : " + map.get(key));
        }
        System.out.println("--------------------------------");
        Set<String> keyList = map.keySet();
        Iterator<String> iterator = keyList.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println("2번 패턴 : " + map.get(next));

        }
    }
}

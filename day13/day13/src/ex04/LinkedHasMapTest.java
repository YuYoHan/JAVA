package ex04;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHasMapTest {
    public static void main(String[] args) {
        Map<String, String> data = new LinkedHashMap<>();
        data.put("name", "홍길동");
        data.put("addr", "서울시 종로구 종로2가");
        data.put("phone", "010-0000-0000");

        String addr = data.get("addr");
        System.out.println(addr);
        System.out.println(data);
    }
}

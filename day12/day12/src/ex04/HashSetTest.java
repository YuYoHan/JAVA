package ex04;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set data = new HashSet();
        boolean f1 = data.add(100);// 자동으로 객체로 만들어 준다. → auto Boxing
        boolean f2 = data.add("사과");
        boolean f3 = data.add(56.7);
        data.add(true);
        boolean f4 = data.add(100);
        System.out.println(data);
    }
}

package ex03;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListAndLinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> data = new LinkedList<>();
        data.add("사과");
        data.add("수박");
        data.add("멜론");
        System.out.println(data);
        data.add(1, "포도");
        data.remove(2);
    }
}

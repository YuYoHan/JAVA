package ex08;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList data = new ArrayList();
        data.add("된장찌개");
        data.add("돈까스");
        data.add("갈비탕");
        data.add("갈비탕");
        data.add(7);
        System.out.println(data);
        // List는 인덱스에 의해 데이터에 접근합니다.
        String food = (String) data.get(1);
        int num = (Integer) data.get(4);
        System.out.println(food);
        System.out.println(num);
    }
}

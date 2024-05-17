import java.util.Arrays;

public class Ex05 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        add(a);
    }
    // 정수형 배열을 매개변수로 전달받아 배열의 요소를 모두 1씩 증가하는 메소드
    public static void add(int[] n) {
        for (int i = 0; i < n.length; i++) {
            n[i]++;
        }
        System.out.println(Arrays.toString(n));
    }
}

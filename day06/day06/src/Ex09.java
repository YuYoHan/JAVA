import java.util.Arrays;

public class Ex09 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        printArray("a배열의 요소 : ", a);
        printArray("b배열의 요소 : ", b);

        a[0] = 100;
        printArray("a배열의 요소 : ", a);
        printArray("b배열의 요소 : ", b);
    }

    public static void printArray(String str, int[] arr) {
        System.out.println(str + Arrays.toString(arr));
    }
}

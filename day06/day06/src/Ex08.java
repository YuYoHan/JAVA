import java.util.Arrays;

public class Ex08 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        printArray(a);
        printArray(b);

        a[0] = 100;
        printArray(a);
        printArray(b);
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}

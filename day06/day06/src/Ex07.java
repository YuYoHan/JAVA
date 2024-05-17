import java.util.Arrays;

public class Ex07 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = a;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        a = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}

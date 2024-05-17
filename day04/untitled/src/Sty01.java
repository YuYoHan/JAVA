import java.util.Arrays;

public class Sty01 {
    public static void main(String[] args) {
        int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(numArr));

        for (int i = 0; i < numArr.length; i++) {
            int n = (int)(Math.random() * 8);
            int tmp = numArr[i];
            numArr[i] = numArr[n];
            numArr[n] = tmp;
        }
        System.out.println(Arrays.toString(numArr));
    }
}

import java.util.Arrays;

public class Ex21 {
    public static void main(String[] args) {
        double[] d1 = {1.2, 1.3, 7.7};
        double[] d2 = {1.2, 1.3, 7.7};
        boolean check = getCheck(d1, d2);
        System.out.println(check);
    }
    public static boolean getCheck(double[] d1, double[] d2) {
        return Arrays.equals(d1, d2);
    }
}

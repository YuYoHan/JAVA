public class Ex20 {
    public static void main(String[] args) {
        int print = getPrint(5);
        System.out.println(print);
    }
    public static int getPrint(int n) {
        int n2 = 1;
        for (int i = n; i >= 1; i--) {
            n2 *= i;
        }
        return n2;
    }
}

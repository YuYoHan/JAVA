public class Ex15 {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4};

        System.out.println(sum(n));
    }
    public static int sum(int[] n) {
        int sum =0;
        for (int i = 0; i < n.length; i++) {
            sum = sum + n[i];
        }
        return sum;
    }
}

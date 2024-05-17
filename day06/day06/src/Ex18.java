public class Ex18 {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};
        max(n);
    }
    public static void max(int[] n) {
        int max = n[0];
        for (int i = 0; i < n.length; i++) {
            if(n[i] > max) {
                max = n[i];
            }
        }
        System.out.println(max);
    }
}

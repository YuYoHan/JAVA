public class Ex16 {
    public static void main(String[] args) {
        double n = 3.13, n2 = 3.77;
        double max = max(n, n2);
        System.out.println(max);
    }
    public static double max(double n, double n2) {
        double max;
//        if(n > n2) {
//            max = n;
//        } else {
//            max = n2;
//        }
        max = Math.max(n, n2);
        return max;
    }
}

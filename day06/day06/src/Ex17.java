public class Ex17 {
    public static void main(String[] args) {
        print(9);
    }
    public static void print(int n) {
        if(n < 2 || n > 9) return;
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, (n *i));
        }
    }
}

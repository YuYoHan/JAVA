public class Ex12 {
    public static void main(String[] args) {
        hello("시우",1);
        String title = "KOSTA 교육센터";
        System.out.println(title);
        hello("시우",2);
        int year = 2024;
        System.out.println(year);
        hello("시우", 3);
    }

    private static void hello(String name, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(name + ", 안녕!!!");
        }
    }
}

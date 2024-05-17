// Call by Value(값에 의한 호출)
public class Ex04 {
    public static void main(String[] args) {
        int a = 5;
        add(a); // 6
        System.out.println("a : " + a); // 5
    }
    // 정수형 변수 하나를 매개변수로 전달받아 1증가하여 출력하는 메소드
    public static void add(int n) {
        n = n + 1;
        System.out.println("n : " + n);
    }
}

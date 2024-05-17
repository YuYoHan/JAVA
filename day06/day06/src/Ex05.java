import java.util.Arrays;

// 두개의 배열의 원소가 모두 동일한지 판별하는 프로그램 작성
public class Ex05 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 4, 5};
        int[] c = {6, 7, 8, 9, 10};

//        if (a == b) {
//            System.out.println("같다");
//        } else {
//            System.out.println("같지 않다.");
//        }
        if(a.length != b.length) {
            return;
        }

        for (int i = 0; i < a.length; i++) {
            if(a[i] == b[i]) {
                System.out.println("같다");
                break;
            } else {
                System.out.println("같지 않다.");
                break;
            }
        }

        // 배열 비교
        if(Arrays.equals(a, c)) {
            System.out.println("같다");
        } else {
            System.out.println("같지 않다.");
        }
    }
}

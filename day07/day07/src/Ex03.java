import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        int[] a  = {17, 16, 15, 7, 9, 11};

        // 오름차순 정리
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[j] < a[i]) {
                    int temp =  a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("----- 이번주 추천번호 -----");
        System.out.println(Arrays.toString(a));
        System.out.println("-------------------------");
    }
}

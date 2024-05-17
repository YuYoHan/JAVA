import java.util.Arrays;

public class Ex22 {
    public static void main(String[] args) {
        /*
        *   0  1  2
        *   [] [] []
        *   [] [] []
        *   [] [] []
        *   [] [] []
        * */
        int[][] a = new int[4][3];
        int n = 1;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                // i가 0이고 j가 0이면 첫번째 칸에 1이 들어감
                // n이 증가함에 따라
                /*
                *   0   1   2
                *   [1] [2] [3]
                *   [4] [5] [6]
                *   [7] [8] [9]
                *  [10] [11] [12]
                * */
                a[i][j] = n++;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%5d", a[i][j]);
            }
            System.out.println();
        }
    }
}

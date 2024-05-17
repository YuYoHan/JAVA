public class Ex26 {
    public static void main(String[] args) {
        int[][] b =
                {
                        {10, 20, 30},
                        {40, 50, 60},
                        {70, 80, 90},
                        {100, 110, 120}
                };
        int[][] c =
                {
                        {1, 2, 3, 4, 5},
                        {6, 7},
                        {8, 9, 10}
                };

        print(b);
        print(c);
    }
    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%5d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}

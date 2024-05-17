public class Ex02 {
    public static void main(String[] args) {
        int[] a  = {17, 16, 15, 7, 9, 11};

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[j] < a[i]) {
                    int temp;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}

public class Ex06 {
    public static void main(String[] args) {
        int age1 = 20;
        int age2 = 20;
        int[] data1 = {10, 20, 30, 40, 50};
        int[] data2 = {10, 20, 30, 40, 50};

        if(age1 == age2) {
            System.out.println("나이가 같아요");
        } else {
            System.out.println("나이가 달라요");
        }

        if (data1 == data2) {
            System.out.println("배열이 같아요");
        } else {
            System.out.println("배열이 달라요");
        }
    }
}

public class Ex06 {
    public static void main(String[] args) {
        int data = 65;
        System.out.println(data);
        System.out.println((char) data); // A
        System.out.println((char) data + 1); // B
        System.out.println((char) data + 2); // C
        System.out.println("========================");
        int data2 = 97;
        System.out.println(data2);
        System.out.println((char) data2); // a
        System.out.println("========================");

        char ch = 'A';
        System.out.println(ch);
        System.out.println((int) ch);
        System.out.println(ch + 1); // 66
        System.out.println((char) (ch+1)); // B
    }
}

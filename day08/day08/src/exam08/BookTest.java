package exam08;

public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book("재미있는 자바", "임유나");
        Book b2 = new Book();
        System.out.println(b1.getTitle());
        System.out.println(b1.getAuthor());
        System.out.println("-------------------");
        System.out.println(b2.getTitle());
        System.out.println(b2.getAuthor());
    }
}

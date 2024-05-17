package exam02;

public class BookTest {
    public static void main(String[] args) {
        Book b = new Book();
            Book b2 = new Book();

            // private에 직접 접근하지 않고
            // public 메소드로 접근해서 값을 넣거나 가져와야 한다.
            // 값 넣기 기능 : setter → 참조되고 있는 속성을 바꿈
            // 값 가져오기 기능 : getter
            b.setTitle("해리포터");
            b.setAuthor("몰름");

        String title = b.getTitle();
        String author = b.getAuthor();
        System.out.println(title);
        System.out.println(author);
    }
}

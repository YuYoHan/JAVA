package exam08;

public class Book {
    // private는 은닉화로 외부에서 접근을 차단
    private String title;
    private String author;

    // 생성자가 중복정의 되어 있을 떄 생성자 안에서 또 다른 생성자를 동작하고자 할 때
    // 사용하는 문장이고 반드시 생성자 첫번째 문장에 들어가야 한다.
    public Book() {
        this("제목없음", "저자없음");
    }

    public Book(String title) {
        this.title = title;
        this.author = "김유나";
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

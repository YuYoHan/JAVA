package exam03;

public class Book {
    // private는 은닉화로 외부에서 접근을 차단
    private String title;
    private String author;

    public Book() {
        this.title = "재미있는 자바";
        this.author = "임유나";
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

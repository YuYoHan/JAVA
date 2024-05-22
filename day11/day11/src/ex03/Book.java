package ex03;

public class Book {
    protected int number;
    protected String title;
    protected String author;

    public Book() {
    }

    public Book(int number, String title, String author) {
        this.number = number;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

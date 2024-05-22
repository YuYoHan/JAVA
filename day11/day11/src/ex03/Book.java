package ex03;

import java.util.Objects;

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
    public boolean equals(Object obj) {
        boolean re = false;
        // 다운캐스팅
        Book b = (Book) obj;
        if (title.equals(b.title) &&
                author.equals(b.author) &&
                number == b.number) {
            re = true;
        }
        return re;
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

package ex04;

public abstract class Book {
    protected String number;    // 도서 관리 번호
    protected String title;     // 제목
    protected String author;    // 저자

    public Book() {
    }

    public Book(String number, String title, String author) {
        this.number = number;
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        boolean re = false;
        Book b = (Book) o;
        if (number.equals((b).number) &&
                title.equals((b).title) &&
                author.equals((b).author)) {
            re = true;
        }
        return re;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // 메서드
    public abstract int getLateFees(int day);

}

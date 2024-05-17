package test01;

public class Movie {
    private String title;
    private String person1;
    private String person2;

    public Movie() {
        this("없음", "없음", "없음");
    }

    public Movie(String title,
                 String person1,
                 String person2) {
        this.title = title;
        this.person1 = person1;
        this.person2 = person2;
    }
}

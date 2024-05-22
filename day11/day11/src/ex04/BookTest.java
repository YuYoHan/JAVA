package ex04;

public class BookTest {
    public static void main(String[] args) {
        Book n = new Novel("1", "b", "c");
        Book p = new Poet("1", "a", "b");
        Book s = new ScienceFiction("1", "a", "b");

        System.out.println(n.number);
        System.out.println(n.author);
        System.out.println(n.title);

        int lateFees = n.getLateFees(5);
        System.out.println(lateFees);
    }
}

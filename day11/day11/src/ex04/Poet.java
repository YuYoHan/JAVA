package ex04;

public class Poet extends Book{
    private final int LATE_FEE = 300;
    private int price;

    public Poet() {
        super();
    }

    public Poet(String number, String title, String author) {
        super(number, title, author);
    }

    public int getLATE_FEE() {
        return LATE_FEE;
    }

    public int getPrice() {
        return price;
    }


    @Override
    public int getLateFees(int day) {
        price = LATE_FEE * day;
        return price;
    }
}

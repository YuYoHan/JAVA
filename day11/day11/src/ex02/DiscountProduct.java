package ex02;

public class DiscountProduct extends Product{
    private double rate;


    @Override
    public int getPrice() {
        return price - (int) (price * rate);
    }

    public DiscountProduct() {
        super();
    }

    public DiscountProduct(String name, int price, double rate) {
        super(name, price);
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "DiscountProduct{" +
                "rate=" + rate +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

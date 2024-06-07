package jdbc04.dto;

public class GoodsDTO {
    private int numId;
    private String item;
    private int qty;
    private int price;

    public GoodsDTO() {
    }

    public GoodsDTO(int numId,
                    String item,
                    int qty,
                    int price) {
        this.numId = numId;
        this.item = item;
        this.qty = qty;
        this.price = price;
    }


    public int getNumId() {
        return numId;
    }

    public void setNumId(int numId) {
        this.numId = numId;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "numId=" + numId +
                ", item='" + item + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }
}

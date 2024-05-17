package sty01;

public class Machine {
    private String drinkName;
    private int drinkPrice;
    private int drinkStock;


    public Machine() {
        this.drinkName = "";
        this.drinkPrice = 0;
        this.drinkStock = 0;
    }

    public Machine(String drinkName, int drinkPrice, int drinkStock) {
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
        this.drinkStock = drinkStock;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public int getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(int drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    public int getDrinkStock() {
        return drinkStock;
    }

    public void setDrinkStock(int drinkStock) {
        this.drinkStock = drinkStock;
    }


}

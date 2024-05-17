package test02;

public class BankAccount {
    private String name;
    private String account;
    private int money;
    private double interestRate;

    public BankAccount() {
    }

    public BankAccount(String name, String account, int money, double interestRate) {
        this.name = name;
        this.account = account;
        this.money = money;
        this.interestRate = interestRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}

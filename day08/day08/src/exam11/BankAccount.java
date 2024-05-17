package exam11;

public class BankAccount {
    private int balance;

    public BankAccount() {
    }

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // 잔액보다 더 큰 금액은 인출되지 않는다.
    public void draw(int money) {
        this.balance -= money;
        if(this.balance < money  || this.balance == 0) {
            System.out.println("잔액 부족");
            return;
        }
    }

    public void  deposit(int money) {
        this.balance += money;
    }

    public void printBalance() {
        System.out.println("현재 잔액 : " + this.balance);
    }

    public void addInterest() {
        this.balance += (int)(this.balance * 0.075);
    }
}

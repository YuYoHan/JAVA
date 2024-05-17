package exam11;

public class Print {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        BankAccount bank2 = new BankAccount();
        bank.deposit(100);
        bank.draw(160);
        bank.printBalance();

        bank2.deposit(50);
        bank2.draw(30);
        bank2.printBalance();
    }
}

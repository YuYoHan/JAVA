package ex03;

// 모금액을 위한 클래스
public class Account {
    // 잔액을 위한 변수
    private int balance;

    // 입금을 위한 메서드
    public void call(int amount) {
        // 입금된 금액에 따라 잔액이 추가됨
        balance += amount;
    }

    // 현재 잔액을 반환하는 메서드
    public int getBalance() {
        return balance;
    }
}

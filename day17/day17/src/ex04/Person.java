package ex04;

// 송금자를 위한 클래스(전화를 걸어서 모금액을 증가)
// 다른 송금자와 관계없이 계속하여 입금을 위하여
// 쓰레드를 상속받는다.
public class Person extends Thread{
    // 송금자 이름을 위한 변수
    private String name;
    // 다른 송금자와 모금액을 공유하기 위하여
    // 모금액 클래스인 Account를 변수로 선언
    private Account account;

    public Person() {
    }

    //  생성시에 송금자 이름과 모금액을 초기화해준다.
    public Person(String name, Account account) {
        this.name = name;
        this.account = account;
    }


    @Override
    public void run() {
        // 1000원씩 10번을 입금하도록 합시다.
        for (int i = 1; i <= 10; i++) {
            account.call(1000);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

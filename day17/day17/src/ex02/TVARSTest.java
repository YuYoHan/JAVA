package ex02;

public class TVARSTest {
    public static void main(String[] args) {
        // 모금액을 위한 Account 객체를 생성
        Account account = new Account();

        // 송금자의 이름과 모금액을 위한 account 객체를
        // 매개변수로 하여 5명의 송금자 객체를 생성한다.
        Person p1 = new Person("송금자1", account);
        Person p2 = new Person("송금자2", account);
        Person p3 = new Person("송금자3", account);
        Person p4 = new Person("송금자4", account);
        Person p5 = new Person("송금자5", account);

        // 5명의 송금자가 경쟁적으로 입금을 하기 위하여
        // 쓰레드를 가동시킨다.
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();

        // 전체 모금액을 출력한다.
        // 현재는 0원이 나온다.
        System.out.println(account.getBalance());
    }
}

package ex01;

public class Person extends Thread{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("밥먹자");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Person a = new Person("김유신");
        Person b = new Person("이순신");

        a.setPriority(1);
        // 최고 우선순위
        b.setPriority(Thread.MAX_PRIORITY);

        a.start();
        b.start();
    }
}

package ex03;
// Thread를 확장받음
public class Person extends Thread{
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("hello, " + name + "==> " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

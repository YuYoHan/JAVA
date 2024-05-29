package ex05;

public class SayHello extends Thread{
    @Override
    public void start() {
            try {
                System.out.println("안녕하세요");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }
}

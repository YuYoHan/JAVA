package ex06;

import java.time.LocalDateTime;

public class CountDownEvent extends Thread implements Runnable {
    private int time;
    private String meg;

    public CountDownEvent() {
    }

    public CountDownEvent(int time, String meg) {
        this.time = time;
        this.meg = meg;
    }

    @Override
    public void run() {
            try {
                Thread.sleep(time);
                System.out.println(this.meg);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
}

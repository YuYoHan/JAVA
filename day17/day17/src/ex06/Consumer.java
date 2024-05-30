package ex06;


public class Consumer extends Thread{
    private Product product;

    public Consumer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            product.useNumber();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

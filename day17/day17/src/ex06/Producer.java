package ex06;

// 소비자와 상관없이 계속하여 새로운 제품을
// 생산하게 하기 위해서 Thread를 상속받아
// 멀티 쓰레드가 가능하도록 한다.
public class Producer extends Thread{
    // 제품을 변수로 선언
    private Product product;

    // 생성시에 제품을 매개변수로 전달받아
    // 초기화한다.
    // 이 제품이 소비자와 공유하는 자원입니다.
    public Producer(Product product) {
        this.product = product;
    }

    // 생산자 쓰레드가 해야할 일을 run을 오버라이딩하여 사용

    @Override
    public void run() {
        // 10개의 새로운 제품을 생산하도록 합니다.
        for (int i = 1; i <= 10; i++) {
            // 제품 생성
            product.makeNumber();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

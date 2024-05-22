package ex07;

public class Test {
    public static void main(String[] args) {
        // 추상화 클래스는 메소드가 구체화되지 않는 것이 있기 때문에
        // 객체 생성을 할 수 없다.
//        Bird b = new Bird();

        // 추상 클래스에서 추상 메서드를 만들어 준 것을
        // Dove에서 상속받아서 구현했기 때문에
        // 생성이 가능하며 상속 받아서 부모와 자식 관계이므로
        // 타입이 다르지 않기 때문에 상속이 가능하다.
        // ps) 부모 아래에 자식이 있기 때문
        Bird b = new Dove();
        b.sound();
    }
}

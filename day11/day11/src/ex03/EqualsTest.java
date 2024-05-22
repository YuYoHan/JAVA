package ex03;

public class EqualsTest {
    public static void main(String[] args) {
        Book b1 = new Book(1, "a", "b");
        Book b2 = new Book(1, "a", "b");
        System.out.println(b1);
        System.out.println(b2);

        // 객체잠조 변수는 값을 가지고 있는 것이 아니라
        // 값이 있는 객체 즉 메모리를 참조하기 때문에
        // b1이 참조하고 있는 메모리 주소와 b2가 참조하고 있는 메모리 주소가 다르다.
        // 만약에 두 객체가 서로 동일한 속성값을 가지고 있는지 편별하려면
        // 자바의 조상클래스(Object)의 equals 메서드를 재정의해야한다.
        if(b1.equals(b2)) {
            System.out.println("같아요");
        } else {
            System.out.println("같지 않아요");
        }
    }
}

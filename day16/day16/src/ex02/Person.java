package ex02;

public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("hello, " + name + "==>" + i );
            try {
                // 1초 동안 대기해라
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Person kim = new Person("김유신");
        kim.sayHello();
        // 김유신 작업이 끝나야 이작업을 시작함
        // 그렇기 때문에 동시에 사용할 수 있게 멀티 스레드가 필요하다.
        Person yi = new Person("이순신");
        yi.sayHello();
    }
}

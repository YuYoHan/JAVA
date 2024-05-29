package ex04;

import ex03.Person;

public class PersonTest {
    public static void main(String[] args) {
        ex03.Person name1 = new ex03.Person("김유신");
        name1.start();
        ex03.Person name2 = new Person("이순신");
        name2.start();
    }
}

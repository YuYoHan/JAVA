package ex08;

import java.util.ArrayList;

class Human {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void say() {
        System.out.println("Hello, " + name);
    }
}

/*
 *   ArrayList list = new ArrayList();
 *   같이 리스트를 형성하면 온갖 자료형을 담을 수 있어서
 *   장점이라고 생각했는데 경험해보니 단점이었다.
 *   만약, 리스트에 Person도 담고 Shape도 담고 여러개의 객체를 담을 때
 *   리스트에 담긴 데이터의 수 만큼 반복하여 결국 그 요소에 따라 일처리를 하는데
 *   각각 자료형이 다르면 일일이 instanceof로 물어보고 형변환한 후에
 *   해당 클래스에 메서드를 호출해야하는 것은 상당히 번거롭다.
 *   가능하면 Object보다는 내가 만든 클래스의 상속관계에 범위를 제한하도록
 *   즉, 리스트에 담는 자료형을 제한하는 것입니다. 이것을 "제네릭"이라고 합니다.
 * */
public class ArrayListTest03 {
    public static void main(String[] args) {
        ArrayList<Human> list = new ArrayList<>();
        list.add(new Human("A", 20));
        list.add(new Human("C", 20));
        list.add(new Human("B", 20));

//        for (int i = 0; i < list.size(); i++) {
//            Human h = list.get(i);
//            h.say();
//        }
        for (Human human : list) {
            human.say();
        }
    }
}

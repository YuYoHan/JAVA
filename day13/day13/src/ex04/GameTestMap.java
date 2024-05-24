package ex04;

import java.util.*;

// 컴퓨터와 사용자가 가위, 바위, 보하는 게임을 만들기
public class GameTestMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        Scanner sc = new Scanner(System.in);
        map.put(0, "가위");
        map.put(1, "바위");
        map.put(2, "보");

        System.out.println("사용자는 무엇을 내겠습니까? ");
        System.out.print("가위 : 0 바위 : 1 보 : 2");
        int key = sc.nextInt();

        if (key < 0 || key > map.size()) {
            System.out.println("잘못된 명령어 입니다.");
            return;
        }

        Random r = new Random();
        int i = r.nextInt(3);
        System.out.printf("사용자는 '%s'를 냈습니다.\n", map.get(key));
        System.out.printf("컴퓨터가 '%s'를 냈습니다.\n", map.get(i));

        if (i == key) {
            System.out.println("비겼습니다.");
        } else if ((key == 0 && i == 2) ||
                (key == 1 && i == 0) ||
                (key == 2 && i == 1)) {
            System.out.println("당신이 이겼습니다.");
        } else {
            System.out.println("졌습니다.");
        }
    }
}

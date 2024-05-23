package ex06;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottoTest {
    public static void main(String[] args) {
        Random randomNum = new Random();
        Set lotto = new TreeSet();
        int num;

        for (int i = 0; i < 45; i++) {
            num = randomNum.nextInt(45) + 1;
            lotto.add(num);
            if (lotto.size() > 5) {
                break;
            }
        }
        System.out.println(lotto);
    }
}

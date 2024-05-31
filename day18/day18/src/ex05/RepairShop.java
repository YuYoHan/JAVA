package ex05;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class RepairShop extends JFrame {
    LinkedHashMap<String, Integer> map;
    JCheckBox[] jcb;


    public RepairShop() {
        JPanel p_center = new JPanel();
        p_center.setLayout(new GridLayout(6, 2));
        p_center.add(new JLabel("수리"));
        p_center.add(new JLabel("가격(원)"));

        map = new LinkedHashMap<>();
        map.put("엔진 오일 교환", 45000);
        map.put("자동 변속기 오일 교환", 80000);
        map.put("에어컨 필터 교환", 30000);
        map.put("타이어 교환", 100000);

        jcb = new JCheckBox[map.keySet().size()];
        Iterator<String> iterator = map.keySet().iterator();
        int i = 0;
        while (iterator.hasNext()) {
            String item = iterator.next();
            jcb[i] = new JCheckBox(item);
            p_center.add(jcb[i]);
            p_center.add(new JLabel(map.get(item) + ""));
            jcb[i].addActionListener(e ->{
                // 눌러진 체크박스가 누군지 알아온다.
                String actionCommand = e.getActionCommand();
                System.out.println(actionCommand);
            });
        }
        add(p_center);

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new RepairShop();
    }
}

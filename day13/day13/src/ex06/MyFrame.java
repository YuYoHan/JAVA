package ex06;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends Frame {
    // MyFrame이 LinePanel을 가지고 있다.
    DrawPanel dp;

    public MyFrame() {
        dp = new DrawPanel();
        // 생셩된 LinePanel을 프레임에 담아준다.
        // 담지 않으면 패널이 보이지 않음
        add(dp);

        // 메뉴바를 생성
        MenuBar mb = new MenuBar();

        // 주메뉴 "그리기 도구"를 만듭니다.
        Menu menu_draw = new Menu("그리기도구");
        // 부메뉴 "선", "사각형", "원"을 만들어요
        MenuItem draw_line = new MenuItem("선");
        MenuItem draw_rect = new MenuItem("사각형");
        MenuItem draw_over = new MenuItem("원");
        // 그리기 메뉴에 담기
        menu_draw.add(draw_line);
        menu_draw.add(draw_rect);
        menu_draw.add(draw_over);
        // 메뉴바에 담기
        mb.add(menu_draw);
        this.setMenuBar(mb);

        // 주메뉴 "그리기 색상" 추가
        Menu menu_color = new Menu("그리기 색상");
        MenuItem color_red = new MenuItem("빨강");
        MenuItem color_blue = new MenuItem("파랑");
        MenuItem color_green = new MenuItem("초록");
        menu_color.add(color_red);
        menu_color.add(color_blue);
        menu_color.add(color_green);
        mb.add(menu_color);
        this.setMenuBar(mb);


        // 틀의 사이즈 조절
        setSize(400, 300);
        // 눈에 보여줄 수 있도록 true
        setVisible(true);

        // 각각의 메뉴가 눌러졌을 때 동작하도록 일을 시킵니다.
        // 메뉴 이벤트를 등록한다.

        // 자바에서는 클래스안에 클래스를 만들 수 있다. (Inner Class)
        draw_line.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("선 그리기");
                dp.drawType = 0;
            }
        });
        draw_rect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("사각형 그리기");
                dp.drawType = 1;
            }
        });
        draw_over.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("원 그리기");
                dp.drawType = 2;
            }
        });

        color_red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("빨강색");
                dp.color = Color.RED;
            }
        });
        color_blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("파랑색");
                dp.color = Color.BLUE;
            }
        });
        color_green.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("초록색");
                dp.color = Color.GREEN;
            }
        });
    }
}

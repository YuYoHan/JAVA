package grimpan;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;

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

        // 주메뉴 파일을 만듭니다.
        Menu menu_file = new Menu("파일");
        // 부메뉴
        MenuItem file_open = new MenuItem("열기");
        MenuItem file_save = new MenuItem("저장");
        menu_file.add(file_open);
        menu_file.add(file_save);
        mb.add(menu_file);
        this.setMenuBar(mb);


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
        // 파일 이벤트 처
        file_open.addActionListener(e -> {
            System.out.println("파일 열기");
            try {
                ObjectInputStream ois =
                        new ObjectInputStream(new FileInputStream("c:/data/bus.png"));
                // 파일로부터 객체를 읽어들여 패널의 리스트에 담는다.
                dp.list = (ArrayList<GrapicInfo>) ois.readObject();

                // 패널의 리스트에 담긴만큼 그래픽을 그리기 위하여 repaint를 요청
                dp.repaint();

                ois.close();
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        });
        file_save.addActionListener(e -> {
            System.out.println("파일 저장");
            try {
                // 우리가 그린 그래픽의 모든 정보는 패널의 리스트에 담겨 있다.( LinkedList<GrapicInfo>)
                // 그래서 파일로 출력할 내용은 바로 리스트입니다.
                // 자바에는 객체단위로 입출력을 위하여
                // ObjectInputStream과 ObjectOutputStream을 만들었다.
                // 객체 단위의 출력을 위한 ObjectOutputStream를 생성합니다.
                // 이때 생성시에 FileOutStram의 객체를 매개변수로 전달하여
                // 생성할 파일의 위치와 이름을 알려줍니다.
                ObjectOutputStream oss =
                        new ObjectOutputStream(new FileOutputStream("c:/data/bus.png"));
                // 객체를 출력
                oss.writeObject(dp.list);
                // 파일의 사용이 끝나면 닫아줌
                oss.close();
                System.out.println("파일을 생성했습니다.");
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        });
        // 선 그리기
        draw_line.addActionListener(e -> {
            System.out.println("선 그리기");
            dp.drawType = 0;
        });
        draw_rect.addActionListener(e -> {
            System.out.println("사각형 그리기");
            dp.drawType = 1;
        });
        draw_over.addActionListener(e -> {
            System.out.println("원 그리기");
            dp.drawType = 2;
        });
        // 색깔
        color_red.addActionListener(e -> {
            System.out.println("빨강색");
            dp.color = Color.RED;
        });
        color_blue.addActionListener(e -> {
            System.out.println("파랑색");
            dp.color = Color.BLUE;
        });
        color_green.addActionListener(e -> {
            System.out.println("초록색");
            dp.color = Color.GREEN;
        });
    }
}

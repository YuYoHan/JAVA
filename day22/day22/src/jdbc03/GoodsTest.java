package jdbc03;

import jdbc03.dao.ItemDAO;
import jdbc03.dto.GoodsDTO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GoodsTest extends JFrame {
    JTextField jtf01;
    JTextField jtf02;
    JTextField jtf03;
    JTextField jtf04;

    public GoodsTest(String title) {
        super(title);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));
        panel.add(new JLabel("상품 번호 :"));
        jtf01 = new JTextField();
        panel.add(jtf01);
        panel.add(new JLabel("상품명 : "));
        jtf02 = new JTextField();
        panel.add(jtf02);
        panel.add(new JLabel("수량 : "));
        jtf03 = new JTextField();
        panel.add(jtf03);
        panel.add(new JLabel("가격 : "));
        jtf04 = new JTextField();
        panel.add(jtf04);

        JButton button = new JButton("등록");
        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.add(button);

        // 패널을 프레임에 추가
        add(panel, BorderLayout.CENTER);
        add(panel2, BorderLayout.SOUTH);

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numId = Integer.parseInt(jtf01.getText());
                String item = jtf02.getText();
                int qty = Integer.parseInt(jtf03.getText());
                int price = Integer.parseInt(jtf04.getText());
                GoodsDTO goodsDTO = new GoodsDTO();
                goodsDTO.setNumId(numId);
                goodsDTO.setItem(item);
                goodsDTO.setQty(qty);
                goodsDTO.setPrice(price);
                System.out.println(goodsDTO);
                int insert = ItemDAO.insert(goodsDTO);
                System.out.println("등록한 개수 : " + insert);
            }
        });
    }


    public static void main(String[] args) {
        new GoodsTest("상품관리");
    }
}

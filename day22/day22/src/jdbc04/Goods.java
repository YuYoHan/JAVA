package jdbc04;

import jdbc03.dao.ItemDAO;
import jdbc03.dto.GoodsDTO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

public class Goods extends JFrame {
    JTextField jtf01;
    JTextField jtf02;
    JTextField jtf03;
    JTextField jtf04;
    Index mainFrame;
    GoodsDTO goodsDTO;
    Vector<String> colNames;
    Vector<Vector<String>> rowData;
    JTable table;

    public Goods(Index mainFrame) {
        this.mainFrame = mainFrame;

        colNames = new Vector<>();
        colNames.add("상품번호");
        colNames.add("상품이름");
        colNames.add("상품수량");
        colNames.add("상품가격");

        rowData = new Vector<>();
        table = new JTable(rowData, colNames);
        JScrollPane jsp = new JScrollPane(table);

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

        JPanel p_north = new JPanel();
        p_north.setLayout(new BorderLayout());
        p_north.add(panel, BorderLayout.CENTER);
        p_north.add(panel2, BorderLayout.SOUTH);

        // 패널을 프레임에 추가
        add(p_north, BorderLayout.NORTH);
        add(jsp, BorderLayout.CENTER);
        addVector();
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
                goodsDTO = new GoodsDTO();
                goodsDTO.setNumId(numId);
                goodsDTO.setItem(item);
                goodsDTO.setQty(qty);
                goodsDTO.setPrice(price);
                System.out.println(goodsDTO);
                int insert = ItemDAO.insert(goodsDTO);
                System.out.println("등록한 개수 : " + insert);
                mainFrame.showBoard();
                addVector();
            }
        });
    }

    public void addVector() {
        ArrayList<GoodsDTO> select = ItemDAO.select(goodsDTO);
        Vector<String> v = new Vector<>();
        for (GoodsDTO goodsDTO : select) {
            v.add(goodsDTO.getNumId() + "");
            v.add(goodsDTO.getItem());
            v.add(goodsDTO.getQty() + "");
            v.add(goodsDTO.getPrice() + "");
        }
        System.out.println("등록 성공");
        rowData.add(v);
    }
}

package ex01;


import ex01.dao.GoodsDAO;
import ex01.dto.GoodsDTO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
    int numId;
    String item;
    int qty;
    int price;

    public Goods() {
//        this.mainFrame = mainFrame;

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
        JButton button_update = new JButton("수정");
        JButton button_delete = new JButton("삭제");
        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.add(button);
        panel2.add(button_update);
        panel2.add(button_delete);

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

        table.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                int index = table.getSelectedRow();
                Vector<String> row = rowData.get(index);
                System.out.println(row.get(0));
                jtf01.setText(row.get(0));
                jtf02.setText(row.get(1));
                jtf03.setText(row.get(2));
                jtf04.setText(row.get(3));
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        // 등록
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setData();
                goodsDTO = new GoodsDTO();
                goodsDTO.setNumId(numId);
                goodsDTO.setItem(item);
                goodsDTO.setQty(qty);
                goodsDTO.setPrice(price);
                System.out.println(goodsDTO);
                int insert = GoodsDAO.insert(goodsDTO);
                System.out.println("등록한 개수 : " + insert);
                if (insert > 0) {
                    JOptionPane.showMessageDialog(null, "상품 정보 등록 성공");
                    addVector();
                    mainFrame.showBoard();
                } else {
                    JOptionPane.showMessageDialog(null, "상품 정보 등록 실패");
                }
            }
        });

        // 수정
        button_update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setData();
                GoodsDTO goods = new GoodsDTO();
                goods.setItem(item);
                goods.setQty(qty);
                goods.setPrice(price);
                System.out.println(goods);
                int update = GoodsDAO.update(goods);
                if (update > 0) {
                    JOptionPane.showMessageDialog(null, "상품 정보 수정 성공");
                    addVector();
                    mainFrame.showBoard();
                } else {
                    JOptionPane.showMessageDialog(null, "상품 정보 수정 실패");
                }
            }
        });

        // 삭제
        button_delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setData();
                int delete = GoodsDAO.delete(numId);
                if (delete > 0) {
                    JOptionPane.showMessageDialog(null, "상품 삭제 성공");
                    addVector();
                    mainFrame.showBoard();
                } else {
                    JOptionPane.showMessageDialog(null, "상품 삭제 실패");
                }
            }
        });
    }

    // 텍스트 필드의 입력값을 읽어와서 각각의 변수에 저장하는 메서드
    public void setData() {
        numId = Integer.parseInt(jtf01.getText());
        item = jtf02.getText();
        qty = Integer.parseInt(jtf03.getText());
        price = Integer.parseInt(jtf04.getText());
    }

    // 모든 상품목록을 읽어와서 JTable에 출력하는 메서드
    public void addVector() {
        rowData.clear();
        ArrayList<GoodsDTO> select = GoodsDAO.select();
        System.out.println(select);
        Vector<String> v = new Vector<>();
        for (GoodsDTO goodsDTO : select) {
            v.add(goodsDTO.getNumId() + "");
            v.add(goodsDTO.getItem());
            v.add(goodsDTO.getQty() + "");
            v.add(goodsDTO.getPrice() + "");
            rowData.add(v);

        }
        System.out.println("등록 성공");
        table.updateUI();
    }

    public static void main(String[] args) {
        new Goods();
    }
}

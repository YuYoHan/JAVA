package jdbc02;

import jdbc02.dao.StudentDAO;
import jdbc02.vo.StudentVO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

public class StudentTest extends JFrame {
    JTextField jtf_name;
    JTextField jtf_kor;
    JTextField jtf_eng;
    JTextField jtf_math;

    Vector<String> colNames;
    Vector<Vector<String>> rowData;
    JTable table;
    String selectedName;


    public StudentTest() {
        jtf_name = new JTextField(10);
        jtf_kor = new JTextField(5);
        jtf_eng = new JTextField(5);
        jtf_math = new JTextField(5);

        JPanel p = new JPanel();

        p.add(new JLabel("이름"));
        p.add(jtf_name);
        p.add(new JLabel("국어"));
        p.add(jtf_kor);
        p.add(new JLabel("영어"));
        p.add(jtf_eng);
        p.add(new JLabel("수학"));
        p.add(jtf_math);

        JButton btnAdd = new JButton("등록");
        JButton btnUpdate = new JButton("수정");
        JButton btnDelete = new JButton("삭제");
        p.add(btnAdd);
        p.add(btnUpdate);
        p.add(btnDelete);

        colNames = new Vector<>();
        colNames.add("이름");
        colNames.add("국어");
        colNames.add("영어");
        colNames.add("수학");
        rowData = new Vector<>();
        table = new JTable(rowData, colNames);
        JScrollPane jsp = new JScrollPane(table);

        add(p, BorderLayout.NORTH);
        add(jsp, BorderLayout.CENTER);
        loadStudent();

        // 등록 버튼 클릭 이벤트
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = jtf_name.getText();
                String kor = jtf_kor.getText();
                String eng = jtf_eng.getText();
                String math = jtf_math.getText();
                StudentVO studentVO = new StudentVO();
                studentVO.setName(name);
                studentVO.setKor(Integer.parseInt(kor));
                studentVO.setEng(Integer.parseInt(eng));
                studentVO.setMath(Integer.parseInt(math));
                System.out.println(studentVO);


                int insert = StudentDAO.insert(studentVO);
                System.out.println("등록 개수 : " + insert);
                loadStudent();
            }
        });
        // 수정 버튼 클릭 이벤트
        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = selectedName;
                String kor = jtf_kor.getText();
                String eng = jtf_eng.getText();
                String math = jtf_math.getText();
                StudentVO studentVO = new StudentVO();
                studentVO.setName(name);
                studentVO.setKor(Integer.parseInt(kor));
                studentVO.setEng(Integer.parseInt(eng));
                studentVO.setMath(Integer.parseInt(math));
                System.out.println(studentVO);

                int update = StudentDAO.update(studentVO);
                System.out.println("수정 개수 : " + update);
                loadStudent();
            }
        });
        // 삭제 버튼 클릭 이벤트
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (selectedName.equals("")) {
                    JOptionPane.showMessageDialog(
                            null, "삭제할 학생을 선택하세요");
                    return;
                }
                // 삭제는 위험한 작업이니
                // 무조건 삭제보다는 한번더 물어보고 삭제
                int r = JOptionPane.showConfirmDialog(
                        null,
                        "정말로 삭제할까요?",
                        "회원 삭제",
                        JOptionPane.YES_NO_OPTION
                );
                if (r != 0) {
                    return;
                }
                int delete = StudentDAO.delete(selectedName);
                System.out.println("삭제한 개수 : " + delete);
                loadStudent();
            }
        });
        // 마우스 클릭시 이벤트
        table.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // JTable의 데이터를 갖고 있는 rowData로 부터 선택한 행의 정보를 가지고 온다.
                int idx = table.getSelectedRow();
                // 가지고 온 정보를 찾아서 Vector에 넣어준다.
                Vector<String> row = rowData.get(idx);
                // 갖고온 벡터로 부터 이름을 뽑아온다.
                selectedName = row.get(0);
                System.out.println("클릭한 이름 : " + selectedName);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        loadStudent();
        setSize(650, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //데이터 베이스 student의 모든 학생의 정보를 조회하여
    //JTable에 출력하는 메소드
    public void loadStudent() {
        rowData.clear();
        StudentDAO studentDAO = new StudentDAO();
        ArrayList<StudentVO> studentList = studentDAO.studentList();
        System.out.println(studentList);
        for (StudentVO studentVO : studentList) {
            Vector<String> row = new Vector<>();
            row.add(studentVO.getName());
            row.add(studentVO.getKor() + "");
            row.add(studentVO.getEng() + "");
            row.add(studentVO.getMath() + "");
            rowData.add(row);
        }
        table.updateUI();
    }

    public static void main(String[] args) {
        new StudentTest();
    }
}

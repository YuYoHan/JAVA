package jdbc01;

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
import java.util.Vector;

public class StudentGUI extends JFrame {
    JTextField jtf_name;
    JTextField jtf_kor;
    JTextField jtf_eng;
    JTextField jtf_math;

    Vector<String> colNames;
    Vector<Vector<String>> rowData;
    JTable table;
    String selectedName;

    public static final String driver = "oracle.jdbc.driver.OracleDriver";
    public static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
    public static final String userName = "c##madang";
    public static final String password = "madang";


    public StudentGUI() {

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

        colNames = new Vector<String>();
        colNames.add("이름");
        colNames.add("국어");
        colNames.add("영어");
        colNames.add("수학");
        rowData = new Vector<Vector<String>>();
        table = new JTable(rowData, colNames);
        JScrollPane jsp = new JScrollPane(table);

        add(p, BorderLayout.NORTH);
        add(jsp, BorderLayout.CENTER);
        loadStudent();

        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Connection conn = null;
                Statement stmt = null;
                int kor = Integer.parseInt(jtf_kor.getText());
                int eng = Integer.parseInt(jtf_eng.getText());
                int math = Integer.parseInt(jtf_math.getText());

                try {
                    String sql = "update student " +
                            "set KOR = '" + kor + "', ENG ='" + eng + "', MATH = '" + math + "'" +
                            "where NAME = '" + selectedName + "'";

                    //1. jdbc드라이버를 메모리로 로드한다.
                    Class.forName(driver);

                    //2. DB서버에 연결한다.
                    conn = DriverManager.getConnection(
                            url,
                            userName,
                            password);

                    //3. 데이터베이스 명령어 실행 담당 객체를 생성
                    stmt = conn.createStatement();

                    //4. 데이터베이스 명령어를 실행한다.
                    int re = stmt.executeUpdate(sql);

                    if (re > 0) {
                        System.out.println("학생의 정보를 수정하였습니다.");
                        JOptionPane.showMessageDialog(null, "학생의 정보를 수정했습니다.");
                        loadStudent();
                    } else {
                        System.out.println("학생의 정보를 수정하는데 실패하였습니다.");
                        JOptionPane.showMessageDialog(null, "학생의 정보를 수정하는데 실패했습니다.");
                    }
                } catch (Exception ex) {
                    System.out.println("예외발생:" + ex.getMessage());
                } finally {
                    try {
                        if (stmt != null) {
                            stmt.close();
                        }
                        if (conn != null) {
                            conn.close();
                        }
                    } catch (Exception ex) {
                        ex.getMessage();
                    }
                }
                loadStudent();
            }
        });

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = jtf_name.getText();
                if(name.equals("")) {
                    JOptionPane.showMessageDialog(
                            null, "삭제할 학생을 선택하세요");
                    return;
                }

                Connection conn = null;
                Statement stmt = null;
                int kor = Integer.parseInt(jtf_kor.getText());
                int eng = Integer.parseInt(jtf_eng.getText());
                int math = Integer.parseInt(jtf_math.getText());

                try {
                    String sql = "insert into student values('" + name + "'," + kor + "," + eng + "," + math + ")";

                    //1. jdbc드라이버를 메모리로 로드한다.
                    Class.forName(driver);

                    //2. DB서버에 연결한다.
                    conn = DriverManager.getConnection(
                            url,
                            userName,
                            password);

                    //3. 데이터베이스 명령어 실행 담당 객체를 생성
                    stmt = conn.createStatement();

                    //4. 데이터베이스 명령어를 실행한다.
                    int re = stmt.executeUpdate(sql);

                    if (re == 1) {
                        System.out.println("학생의 정보를 추가 하였습니다.");
                        loadStudent();
                    } else {
                        System.out.println("학생의 정보 추가에 실패하였습니다.");
                    }

                } catch (Exception ex) {
                    System.out.println("예외발생:" + ex.getMessage());
                } finally {
                    try {
                        if (stmt != null) {
                            stmt.close();
                        }
                        if (conn != null) {
                            conn.close();
                        }
                    } catch (Exception ex) {
                        ex.getMessage();
                    }
                }
                loadStudent();
            }
        });

        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 삭제는 위험한 작업이니
                // 무조건 삭제보다는 한번더 물어보고 삭제
                int r = JOptionPane.showConfirmDialog(
                        null,
                        "정말로 삭제할까요?",
                        "회원 삭제",
                        JOptionPane.YES_NO_OPTION
                );

                if(r != 0) {
                    return;
                }


                String name = jtf_name.getText();
                Connection conn = null;
                Statement stmt = null;
                String sql =
                        "delete student where name = '" + name + "'";

                try {
                    //1. jdbc드라이버를 메모리로 로드한다.
                    Class.forName(driver);

                    //2. DB서버에 연결한다.
                    conn = DriverManager.getConnection(
                            url,
                            userName,
                            password);

                    //3. 데이터베이스 명령어 실행 담당 객체를 생성
                    stmt = conn.createStatement();

                    //4. 데이터베이스 명령어를 실행한다.
                    int re = stmt.executeUpdate(sql);
                    if (re > 0) {
                        System.out.println("학생의 정보를 삭제 하였습니다.");
                        System.out.println("삭제된 행의 수: " + re);
                        JOptionPane.showMessageDialog(null,
                                "학생의 정보를 삭제 하였습니다.");
                        loadStudent();
                    } else {
                        System.out.println("학생의 정보 삭제하는데 실패하였습니다.");
                        JOptionPane.showMessageDialog(null,
                                "학생의 정보를 삭제 실패했습니다.");
                    }

                } catch (Exception ex) {
                    System.out.println("에러 발생 : " + ex.getMessage());
                } finally {
                    try {
                        if (stmt != null) {
                            stmt.close();
                        }
                        if (conn != null) {
                            conn.close();
                        }
                    } catch (Exception ex) {
                        ex.getMessage();
                    }
                }
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
        // 벡터를 초기화 시켜준다.
        rowData.clear();

        String sql = "select * from student";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            //1. jdbc드라이버를 메모리로 로드한다.
            Class.forName(driver);

            //2. DB서버에 연결한다.
            conn = DriverManager.getConnection(
                    url,
                    userName,
                    password);

            //3. 데이터베이스 명령어 실행 담당 객체를 생성
            stmt = conn.createStatement();

            //4. 데이터베이스 명령어를 실행한다.
            int re = stmt.executeUpdate(sql);
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String name = rs.getString("name");
                int kor = rs.getInt("kor");
                int eng = rs.getInt("eng");
                int math = rs.getInt("math");
                Vector<String> vt = new Vector<String>();
                vt.add(name);
                vt.add(kor + "");
                vt.add(eng + "");
                vt.add(math + "");
                rowData.add(vt);
            }

            table.updateUI();
        } catch (Exception e1) {
            System.out.println("예외발생 :" + e1.getMessage());
        } finally {

            try {
                if (stmt != null) {
                    stmt.close();
                }

                if (conn != null) {
                    stmt.close();
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }

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
                String name = row.get(0);

                // 받아온 name으로 JDBC를 이용해서 DB에 조회
                String sql = "select * from student where NAME = '" + name + "'";
                Connection conn = null;
                Statement stmt = null;
                ResultSet rs = null;

                try {
                    //1. JDBC 드라이버를 메모리로 로드한다.
                    Class.forName(driver);
                    //2. DB서버에 연결한다.
                    conn = DriverManager.getConnection(
                            url,
                            userName,
                            password);
                    // 3. 데이터베이스 명령어 실행 담당자 객체를 생성
                    stmt = conn.createStatement();
                    // 4. 명령어 실행 담당자를 통해서 데이터베이스 명령을 실행
                    rs = stmt.executeQuery(sql);

                    // 학생의 이름이 중복되지 않는다면 검색 결과가 1건이니
                    // while문 보다는 if문을 사용하자
                    if (rs.next()) {
                        name = rs.getString(1);
                        int kor = rs.getInt(2);
                        int eng = rs.getInt(3);
                        int math = rs.getInt(4);
                        System.out.println(name + " : " + kor + ", " + eng + ", " + math);
                        selectedName = name;
                    }

                } catch (Exception ex) {
                    System.out.println("예외 발생 : " + ex.getMessage());
                } finally {
                    try {
                        if (rs != null) {
                            rs.close();
                        }
                        if (stmt != null) {
                            stmt.close();
                        }
                        if (conn != null) {
                            conn.close();
                        }
                    } catch (Exception ex) {
                        System.out.println("예외 발생 : " + ex.getMessage());
                    }
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        new StudentGUI();
    }
}

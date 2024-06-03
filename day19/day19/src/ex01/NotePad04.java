package ex01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class NotePad04 extends JFrame {
    JTextArea jta;
    JFileChooser jfc;
    File file;
    // 열어오거나 저장한 후에 변경된 내용이 있는지
    // 판별할 변수
    boolean isNew;

    public void saveFile() {
        System.out.println("저장");
        String data = jta.getText();
        System.out.println(data);

        int re = 0;
        // 저장할 다이얼로그에서 "저장","취소"를 눌렀는지 판별할 변수
        // 이미 파일이 있는경우를 대비하여 초기값 0을 설정

        if (file == null) {  // 열린파일이 없거나 저장한 파일이 없다면
            re = jfc.showSaveDialog(null);    //어떤 파일로 저장할 것인지 다이어로그를 띄워
            if (re == 0) { // 저장하기 다이얼로그에서 "저장"를 눌렀다면
                file = jfc.getSelectedFile();
                //다이얼로그에서 선택한 파일을 file변수에 저장
            }
        }

        //이미 열린 파일이 있거나 저장한 파일이 있거나
        //저장하기 다이얼로그에 "저장"을 눌렀으면 저장한다.
        if (re == 0) {
            try {
                FileWriter fw = new FileWriter(file);
                fw.write(data);
                fw.close();
                JOptionPane.showMessageDialog(null, "파일을 생성하였습니다.");
                setTitle(file.getName());
                // 파일을 저장한 다음 isNew에 변경된 내용이 없음을 설정하기 위해 false
                isNew = false;
            } catch (Exception ex) {
                System.out.println("예외발생:" + ex.getMessage());
            }//end catch
        }// end if

    }


    public NotePad04() {
        //		setTitle("메모장");
        super("제목없음");

        jfc = new JFileChooser("c:/data");

        jta = new JTextArea();
        JScrollPane jsp = new JScrollPane(jta);
        add(jsp);

        JMenuBar jmb = new JMenuBar();
        JMenu mn_file = new JMenu("파일");
        JMenuItem file_new = new JMenuItem("새파일");
        JMenuItem file_open = new JMenuItem("열기");
        JMenuItem file_save = new JMenuItem("저장");

        mn_file.add(file_new);
        mn_file.add(file_open);
        mn_file.add(file_save);

        jmb.add(mn_file);

        setJMenuBar(jmb);

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        jta.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                isNew = true;
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        file_new.addActionListener(e -> {
            // 변경된 내용이 있으면 "저장하시겠습니까?"라고 물어본다.
            if(isNew) {
                int re = JOptionPane.showConfirmDialog(
                        null,"변경된 내용을 저장하시겠습니까?");
                System.out.println(re);
                // 예(0) : 변경된 내용 저장            → 새파일
                // 아니요(1) : 변경된 내용 저장 안함    → 새파일
                // 취소(2) : 새파일을 취소
                if(re == 2) return;
                if(re == 0) saveFile();
            }
            jta.setText("");
        });

        file_open.addActionListener(e -> {
            System.out.println("열기");
            int re = jfc.showOpenDialog(null);
            if (re == 0) {
                try {
                    file = jfc.getSelectedFile();
                    FileReader fr = new FileReader(file);
                    int ch;
                    String data = "";
                    while ((ch = fr.read()) != -1) {
                        data += (char) ch;
                    }
                    jta.setText(data);
                    setTitle(file.getName());
                    // 파일을 열어온 다음 변경된 내용이 없음을 설정하기 위해 false
                    isNew = false;
                } catch (Exception ex) {
                    System.out.println("예외발생:" + ex.getMessage());
                }
            }
        });

        file_save.addActionListener(e -> saveFile());

    }

    public static void main(String[] args) {
        new NotePad04();
    }
}

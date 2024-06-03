package ex02;

import javax.swing.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class NotePad extends JFrame {
    JTextArea jta;

    // 파일 열거나 저장할 때 파일을 선택하기 위한 대화상자를 위한 변수를 멤버로 선언
    JFileChooser jfc;
    // 현재 작업하고 있는 파일을 참조할 변수를 선언
    File file;
    // 파일에 변경된 내용이 있는지 판별하기 위한 변수
    // 파일을 저장하거나 열어온 즉시 isNew에 false 저장
    // 그 이유는 그때는 변경된 내용이 없으니
    boolean isNew;
    // 생성자
    public NotePad() {
        // JFileChooser 객체 생성
        // 매개변수로 작업 디렉토리를 전달
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
        file_new.addActionListener(e -> {
            // 열어올 파일을 선택하기 위한 대화상자를 연다.
            // 열기 : 0, 취소 : 1
            int re = jfc.showOpenDialog(null);
            // 열기를 눌렀으면 열어올 동작을 하도록 합니다.
            if (re == 0) {
                // 파일열기 대화상자에서 선택한 파일의 정보를 file 변수에 저장
                file = jfc.getSelectedFile();
                try {
                    // 문자 단위의 파일 내용을 컴퓨터 메모리로 일기 위해서
                    // 객체를 생성하고 파일 열기 대화상자에서 선택한 파일을 매개변수로 전달
                    FileReader fr = new FileReader(file);

                    // 파일로 부터 한글자씩 읽기 위한 변수 선언
                    int ch;
                    // 파일의 전체 내용을 저장하기 위한 변수 선언
                    String text = "";
                    // 파일의 끝이 아닐 때까지 읽어들여 text에 저장
                    while ((ch = fr.read()) != -1) {
                        text += (char) ch + "";
                    }
                    // 파일로 부터 읽어들인 전체문자열 text를 텍스트아리아에 설정
                    jta.setText(text);
                    // 파일을 닫아준다.
                    fr.close();

                    // 열어온 파일명을 타이틀바에 설정
                    setTitle(file.getName());

                } catch (Exception ex) {
                    System.out.println("예외발생 : " + ex.getMessage());
                }
            }
        });
        file_open.addActionListener(e -> {

        });
        file_save.addActionListener(e -> saveFile());
    }

    // 파일을 저장하기 위한 메서드
    public void saveFile() {
        // 파일로 저장할 문자열을 갖고 온다.
        String text = jta.getText();
        // 어떤 이름으로 저장할지 대화상자를 연다.
        // 저장 : 0, 취소 : 1
        int re = jfc.showSaveDialog(null);
        // 대화상자에서 저장을 누르면 저장
        if (re == 0) {
            // 대화상자에 입력한 파일정보를 갖고와서 file에 저장
            // 사용자가 파일명을 적으면 그것을 가지고 오는 것이다.
            file = jfc.getSelectedFile();
            try {
                // 문자단위의 파일 출력을 위한 객체를 생성
                // 매개변수로 대화상자에서 입력한 파일의 정보를 전달
                FileWriter fr = new FileWriter(file);
                // 파일로 내용을 출력
                fr.write(text);
                // 파일출력 작업이 끝나면 파일을 닫아준다.
                fr.close();

                // 파일이 성공적으로 생성되었다는 메시지 출력
                JOptionPane.showMessageDialog(
                        null, "파일에 저장하였습니다.");
                // 저장한 파일명을 타이블바에 설정
                setTitle(file.getName());
            } catch (Exception ex) {
                System.out.println("예외발생 : " + ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new NotePad();
    }
}

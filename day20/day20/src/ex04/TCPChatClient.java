package ex04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class TCPChatClient extends JFrame {
    JTextArea jta;
    JTextField jtf;
    Socket socket;
    InputStream inputStream;
    OutputStream outputStream;
    byte[] data = new byte[100];

    public TCPChatClient() {
        // 1. 서버와 통신하기 위한 소켓 생성
        try {
            socket = new Socket("172.30.1.55", 9003);

            // 2. 생성된 소켓을 통해서 Stream을 생성
            inputStream = socket.getInputStream();
            outputStream = socket.getOutputStream();


        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

        jta = new JTextArea();
        jtf = new JTextField(50);
        JScrollPane jsp = new JScrollPane(jta);
        JButton button = new JButton("전송");
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.add(jtf, BorderLayout.CENTER);
        p.add(button, BorderLayout.EAST);
        add(jsp, BorderLayout.CENTER);
        add(p, BorderLayout.SOUTH);

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // 서버로 부터 수신된 데이터를 계속하여 받기 위한 쓰레드를 만든다.
        class ClientThread extends Thread {
            @Override
            public void run() {
                while (true) {
                    try {
                        inputStream.read(data);
                        jta.append(new String(data));
                        jta.append("\n");
                        Arrays.fill(data, (byte) 0);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        ClientThread ct = new ClientThread();
        ct.start();

        // 전송 버튼에 이벤트 연결
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 텍스트 필드에 작성한 것을 스트림에 담아주기 위해 가져온다.
                String text = jtf.getText();
                try {
                    // 보낼 데이터를 바이트 배열로 보낸다.
                    data = text.getBytes();
                    outputStream.write(data);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

    public static void main(String[] args) {
        new TCPChatClient();
    }
}

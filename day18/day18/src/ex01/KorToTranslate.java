package ex01;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class KorToTranslate extends JFrame {
    JTextArea txt01;
    JTextArea txt02;
//    String targetLanguage = "en";
    // 여러개의 나라언어를 담아줌
    JComboBox<String> languageComboBox;


    public KorToTranslate() {
        txt01 = new JTextArea(10, 50);
        txt02 = new JTextArea(10, 50);
        // 박스 형식에 영어, 중국어, 일본어를 보여주기 위해 담아준다.
        languageComboBox = new JComboBox<>(new String[]{"영어", "중국어", "일본어"});

        // 버튼 생성
        JButton change = new JButton("변환");
        JButton cancel = new JButton("취소");

        // 패널 생성
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        // 패널 레이아웃 설정
        p1.setLayout(new GridLayout(1, 2, 10, 10));
        p2.setLayout(new FlowLayout(FlowLayout.CENTER));
        p3.setLayout(new FlowLayout(FlowLayout.CENTER));

        JScrollPane jsp01 = new JScrollPane(txt01);
        JScrollPane jsp02 = new JScrollPane(txt02);

        // 패널에 글 넣기
        p1.add(jsp01);
        p1.add(jsp02);
        // 패널에 버튼 추가
        p2.add(change);
        p2.add(cancel);
        // 패널에 콤보박스 추가
        // 문구를 보여준다.
        p3.add(new JLabel("번역할 언어 선택: "));
        // 위에서 담아준 박스들을 보여준다.
        p3.add(languageComboBox);

        setLayout(new BorderLayout());
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);
        add(p3, BorderLayout.NORTH);

        // 변환
        change.addActionListener(e -> {
            String text = txt01.getText();
            // 박스에서 언어를 선택하면 그 선택한 뽑아온다.
            String selectedLanguage = (String) languageComboBox.getSelectedItem();
            // 뽑아온 언어가 어디 나라 언어인지 구별하기 위해 메서드에 보내줌
            String targetLanguage = getTargetLanguage(selectedLanguage);
            try {
                // 위에서 뽑아온 언어를 메서드에 보내줌
                String translate = translate(text, targetLanguage);
                System.out.println(translate);

                txt02.setText(translate);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        // 취소
        cancel.addActionListener(e -> {
            txt01.setText("");
            txt02.setText("");
        });

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    // 뽑아온 언어들이 어디 나라 언어인지 구별
    private String getTargetLanguage(String selectedLanguage) {
        switch (selectedLanguage) {
            case "영어":
                return "en";
            case "중국어":
                return "zh-CN";
            case "일본어":
                return "ja";
            default:
                throw new IllegalArgumentException("지원하지 않는 언어입니다.");
        }
    }

    public static String translate(String text, String targetLanguage) throws IOException {
        String urlStr =
                "https://translate.googleapis.com/translate_a/single?client=gtx&sl=auto&tl=" +
                        targetLanguage + "&dt=t&q=" + URLEncoder.encode(text, "UTF-8");
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuffer response = new StringBuffer();

        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();
        String translatedText = extractTranslatedText(response.toString());
        System.out.println(translatedText);
        return translatedText;
    }

    private static String extractTranslatedText(String jsonResponse) {
        // 응답은 JSON 형식입니다.
        // 번역된 텍스트는 JSON 배열의 첫 번째 요소의 첫 번째 요소에 있습니다.
        // JSON 파싱을 통해 추출합니다.
        String translatedText = "";

        // JSON 배열의 첫 번째 요소의 첫 번째 요소가 번역된 텍스트입니다.
        // JSON 형식이 [["번역된텍스트","원본텍스트",null,null,확신정도]] 이므로,
        // 첫 번째 요소의 첫 번째 요소를 추출합니다.
        // 응답이 유효한 JSON 형식이 아닌 경우를 고려하여 예외처리를 추가하는 것이 좋습니다.
        String[] parts = jsonResponse.split("\"");
        if (parts.length >= 2) {
            translatedText = parts[1];
            // 개행 문자(\n)를 공백으로 대체합니다.
            translatedText = translatedText.replaceAll("\\\\n", " ");
        }

        return translatedText;
    }

    public static void main(String[] args) {
        new KorToTranslate();
    }
}

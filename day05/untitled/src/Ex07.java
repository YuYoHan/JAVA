import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[26];

        System.out.println("문자열을 입력하세요 ==> ");
        // 공백문자도 입력 받을 수 있다.
        String buffer = sc.nextLine();

        // 각 문자가 등장하는 회수를 계산한다.
        for (int i = 0; i < buffer.length(); i++) {
            char ch = buffer.charAt(i);
            // 만약 사용자가 a를 보내주면 a-a니 97-97니 0이다.
            // 그래서 count의 0번째에 1개를 증가해준다.
            // b를 받으면 b-a, 98-97이니 1번째 배열을 증가시켜준다.
            count[ch - 'a']++;
        }

        // 배열에 저장된 횟수를 출력하는 반복 루프
        for (int i = 0; i < count.length; i++) {
            // (char)('a'+i) : 어떤 문자인지 표시하기 위해서 적어줌 ex) 0번째면 a
            // count[i] : 배열에 있는 갯수를 가져옴
            System.out.printf("%c ==> %d\n", (char)('a'+i), count[i]);
        }
    }
}

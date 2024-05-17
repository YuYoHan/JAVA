public class Ex03 {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            numbers[i] = i + 1;

            // for each는 1번 부터 시작한다.
            for (int number : numbers) {
                System.out.println("i : " + i);
                // 근데 배열은 0번부터 시작하니 배열과 for each가 맞지 않는다.
                // Index 5 out of bounds for length 5 에러 발생
                System.out.print(numbers[number]);
            }
        }
    }
}

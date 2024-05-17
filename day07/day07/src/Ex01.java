public class Ex01 {
    public static void main(String[] args) {
        String[] name = {"김xx", "이xx","박xx"};
        int[] score = {80, 90, 77};

        String getName = getFirstName(name, score);
        System.out.println(getName);
    }
    public static String getFirstName(String[] name, int[] score) {
        int max = score[0];
        int index = 0;
        for (int i = 0; i < score.length; i++) {
            if(score[i] > max) {
                max = score[i];
                index = i;
            }
        }
        return name[index] + " 학생은 " + max + "으로 최고점수 기록자입니다.";
    }
}

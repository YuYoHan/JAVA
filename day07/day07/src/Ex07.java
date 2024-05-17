class Student {
    String name;
    int kor;
    int eng;
    int math;
    int tot;
    double avg;
}

public class Ex07 {
    public static void main(String[] args) {
        int year;
        year = 2024;
        Student data = new Student();
        data.name = "홍길동";
        data.kor = 100;
        data.eng = 80;
        data.math = 70;
        data.tot = data.kor + data.eng + data.math;
        data.avg = (double) data.tot / 3;

        System.out.printf("%s 학생은 \n국어 : %d\n수학 : %d\n" +
                        "영어 : %d\n총점 : %d\n평균 : %.1f\n",
                data.name, data.kor, data.math, data.eng, data.tot, data.avg);
    }
}

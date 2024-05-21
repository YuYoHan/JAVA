package ex03;

import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] data = new Shape[1000];
        Scanner sc = new Scanner(System.in);
        int menu;
        int n = 0;
        double width, length, height, radius;
        int x, y;

        while (true) {
            do {
                System.out.println("1. 사각형 2. 삼각형 3. 직육면체 4. 원기둥 0. 종료");
                System.out.println("도형의 종류를 선택하세요 : ");
                menu = sc.nextInt();
            } while (menu < 0 || menu > 4);
            if (menu == 0) {
                break;
            }
            System.out.println("도형의 x의 위치 : ");
            x = sc.nextInt();
            System.out.println("도형의 y의 위치 : ");
            y = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("사각형의 가로 :");
                    width = sc.nextDouble();
                    System.out.print("사각형의 세로 : ");
                    length = sc.nextDouble();
                    data[n] = new Rectangle(x, y, width, length);
                    break;
                case 2:
                    System.out.print("삼각형의 밑변 :");
                    width = sc.nextDouble();
                    System.out.print("삼각형의 높이 : ");
                    height = sc.nextDouble();
                    data[n] = new Rectangle(x, y, width, height);
                    break;
                case 3:
                    System.out.print("직육면체 가로 :");
                    width = sc.nextDouble();
                    System.out.print("직육면체 세로 : ");
                    length = sc.nextDouble();
                    System.out.print("직육면체 높이 : ");
                    height = sc.nextDouble();
                    data[n] = new Cube(x, y, width, length, height);
                    break;
                case 4:
                    System.out.print("원기둥의 반지름 :");
                    radius = sc.nextDouble();
                    System.out.print("원기둥의 높이 : ");
                    height = sc.nextDouble();
                    data[n] = new Cylinder(x,y,radius, height);
                    break;

            }
            n++;
        }
        for (int i = 0; i < n; i++) {
            Shape s = data[i];
            if(s instanceof TwoDimShape) {
                TwoDimShape two = (TwoDimShape) data[i];
                two.calcArea();
            }
            if (s instanceof ThrDimShape) {
                ThrDimShape thr = (ThrDimShape) data[i];
                thr.calcVolume();
            }

            System.out.println(s);
        }
    }
}

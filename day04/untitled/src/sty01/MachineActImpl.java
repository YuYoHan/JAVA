package sty01;

import java.util.ArrayList;
import java.util.Scanner;

public class MachineActImpl implements MachineAct{
    Scanner sc = new Scanner(System.in);
    ArrayList<Machine> list = new ArrayList<Machine>();
    private int remainMoney = 0;

    @Override
    public void insertCoin() {
        int ch;
        System.out.println("5000원");
        System.out.println("1000원");
        System.out.println("500원");
        System.out.println("100원");

        System.out.print("돈을 넣어주세요 : ");
        ch = sc.nextInt();

        switch (ch) {
            case 1 :
                remainMoney = remainMoney + 5000;
                System.out.println("투입금액 5000원");
                break;
            case 2 :
                remainMoney = remainMoney + 1000;
                System.out.println("투입금액 1000원");
                break;
            case 3 :
                remainMoney = remainMoney + 500;
                System.out.println("투입금액 500원");
                break;
            case 4 :
                remainMoney = remainMoney + 100;
                System.out.println("투입금액 100원");
                break;
        }
        System.out.println("사용 가능한 금액 : " + remainMoney);
    }

    @Override
    public void returnCoin() {
        if(remainMoney == 0) {
            System.out.println("반환할 돈이 없습니다.");
        } else {
            remainMoney = 0;
            System.out.println();
        }

    }

    @Override
    public void enterMenu() {

    }

    @Override
    public void deleteMenu() {

    }

    @Override
    public void updateMenu() {

    }

    @Override
    public void enterStock() {

    }

    @Override
    public void printMenu() {

    }

    @Override
    public void choiceMenu() {

    }
}

package ch05.advanced;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        int select = 0;
        int total = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-----------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("-----------------------------------");
            System.out.print("선택 > ");
            select = sc.nextInt();

            if (select == 1) {
                System.out.print("예금액 > ");
                int price = sc.nextInt();
                total += price;
            }
            else if (select == 2) {
                System.out.print("출금액 > ");
                int price = sc.nextInt();
                total -= price;
            }
            else if (select == 3) {
                System.out.println("잔고 > " + total);
            }
            else break;

        }
        System.out.println("프로그램 종료");
    }
}

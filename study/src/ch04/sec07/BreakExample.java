package ch04.sec07;

import java.io.IOException;

public class BreakExample {
    public static void main(String[] args) throws IOException {
        int rand;
        while (true) {
            rand = (int)((Math.random() * 6) + 1);
            System.out.println(rand);
            if (rand == 6) break;
        }
        System.out.println("프로그램 종료");
    }
}

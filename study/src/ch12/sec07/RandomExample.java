package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        int[] select = new int[6];
        int[] answer = new int[6];
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            select[i] = random.nextInt(45) + 1;
        }
        for (int i = 0; i < 6; i++) {
            answer[i] = random.nextInt(45) + 1;
        }

        System.out.println("선택한 번호: " + Arrays.toString(select));
        System.out.println("당첨 번호: " + Arrays.toString(answer));
        Arrays.sort(select);
        Arrays.sort(answer);

        if (Arrays.equals(select, answer)) {
            System.out.println("1등 당첨입니다. 축하드립니다!");
        } else {
            System.out.println("1등 당첨이 아닙니다.");
        }
    }
}

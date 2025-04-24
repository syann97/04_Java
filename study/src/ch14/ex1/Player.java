package ch14.ex1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;

// 눈치 게임
@Data
@AllArgsConstructor
public class Player implements Runnable {
    private String name;

    // 랜덤 객체 생성
    private final Random random = new Random(3);


    // ctrl + o
    @Override
    public void run() {
        try {
            int curr = Main.count;   // 현재 숫자를 지역 변수에 복사
            Thread.sleep(random.nextInt(5) * 200 + 1000); // 1~2초 대기


            // sleep 전 후 숫자를 비교
            // -> 달라짐 -> 다른 Player가 Main.count를 증가 시켰다!
            while(curr != Main.count) {
                curr = Main.count;
                Thread.sleep(random.nextInt(5) * 200 + 1000); // 1~2초 대기
            }

            synchronized (Main.class) {
                int callNumber = ++Main.count;
                System.out.printf("%-10s : %2d \n", name, callNumber);


                if (callNumber == Main.finalNumber) {
                    System.out.println(name + " 벌칙 당첨!!");
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

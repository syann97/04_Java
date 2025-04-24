package ch14.ex2;

public class ThreadRaceGame {

    public static final int RACE_DISTANCE = 20; // 경주 거리
    public static boolean gameFinished = false;  // 게임 종료 여부

    public static void main(String[] args) {
        System.out.println(" 경주 시작!");

        // 레이서 객체 3개 생성
        Thread racer1 = new Thread(new Racer("토끼"), "[토끼 스레드]");
        Thread racer2 = new Thread(new Racer("사자"), "[사자 스레드]");
        Thread racer3 = new Thread(new Racer("공룡"), "[공룡 스레드]");

        // 각 스레드 시작
        racer1.start();
        racer2.start();
        racer3.start();

        try {
            // 다른 스레드가 종료될 때까지 기다리기
            racer1.join();
            racer2.join();
            racer3.join();

            System.out.println("### 경기 종료 ###");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 경주 진행 상황 시각화
    public static synchronized void printRaceProgress(String name, int position) {
        int adjustedPosition = Math.min(position, RACE_DISTANCE);
        System.out.print(name + ": ");

        String icon = null;
        switch (name){
            case "[사자 스레드]" : icon = "🦁"; break;
            case "[토끼 스레드]" : icon = "🐰"; break;
            case "[공룡 스레드]" : icon = "🦖"; break;
        }

        for (int i = 0; i < RACE_DISTANCE; i++) {
            if (i <= adjustedPosition) {
                System.out.print(icon);  // 이동한 거리
            } else {
                System.out.print("⬜");  // 남은 거리
            }
        }

        System.out.println(" " + adjustedPosition + "/" + RACE_DISTANCE);
    }
}

package ch04.sec02;

public class IfDiceExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int num = (int)(Math.random()*6) + 1;

        if (num == 1) sb.append(1);
        else if (num == 2) sb.append(2);
        else if (num == 3) sb.append(3);
        else if (num == 4) sb.append(4);
        else if (num == 5) sb.append(5);
        else sb.append(6);

        sb.append("번이 나왔습니다.");
        System.out.println(sb);
    }
}
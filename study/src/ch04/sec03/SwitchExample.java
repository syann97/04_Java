package ch04.sec03;

public class SwitchExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int num = (int)(Math.random() * 6) + 1;

        switch (num) {
            case 1:
                sb.append(1);
                break;
            case 2:
                sb.append(2);
                break;
            case 3:
                sb.append(3);
                break;
            case 4:
                sb.append(4);
                break;
            case 5:
                sb.append(5);
                break;
            default:
                sb.append(6);
                break;
        }
        sb.append("번이 나왔습니다.");
        System.out.println(sb);
    }
}

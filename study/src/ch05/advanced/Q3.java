package ch05.advanced;

public class Q3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int cal = 4 * i + 5 * j;
                if(cal == 60) {
                    System.out.println("(x, y) = (" + i + ", " + j + ")");
                }
            }
        }
    }
}

package ch05.advanced;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        int select = 0;
        int total = 0;
        int[] scores = new int[0];
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("----------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("----------------------------------------------------");
            System.out.print("선택 > ");
            select = sc.nextInt();

            if (select == 1) {
                System.out.print("학생수 > ");
                int N = sc.nextInt();
                scores = new int[N];
            }

            else if (select == 2) {
                if (scores.length == 0) {
                    System.out.println("학생 수를 입력해주세요.");
                }
                else {
                    for (int i = 0; i < scores.length; i++) {
                        System.out.print("scores[" + i + "] > ");
                        scores[i] = sc.nextInt();
                    }
                }
            }

            else if (select == 3) {
                if (scores.length == 0) {
                    System.out.println("학생 수를 입력해주세요.");
                }
                else {
                    for (int i = 0; i < scores.length; i++) {
                        System.out.println("scores[" + i + "] > " + scores[i]);
                    }
                }
            }
            else if (select == 4) {
                if (scores.length == 0) {
                    System.out.println("학생 수를 입력해주세요.");
                }
                else {
                    int sum = 0;
                    int max = 0;
                    for (int i = 0; i < scores.length; i++) {
                        sum += scores[i];
                        max = Math.max(max, scores[i]);
                    }
                    System.out.println("최고 점수: " + max);
                    System.out.println("평균 점수: " + (double)sum/scores.length);
                }
            }

            else if (select == 5) break;
            else {
                System.out.println("다시 입력해주세요.");
            }

        }
        System.out.println("프로그램 종료");
    }
}

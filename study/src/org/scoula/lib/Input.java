package org.scoula.lib;

import java.util.Scanner;

public class Input {
    static Scanner sc = new Scanner(System.in);

    public Input() {
    }

    static String read(String title) {
        System.out.print(title);
        return sc.nextLine().trim();
    }

    static String read(String title, String defaultValue) {
        System.out.print(title);
        String userInput = sc.nextLine();
        return userInput.isEmpty() ? defaultValue : userInput;
    }

    static int readInt(String title) {
        System.out.print(title);
        int value = sc.nextInt();
        sc.nextLine();
        return value;
    }

    static boolean confirm(String title, boolean defaultValue) {
        System.out.print(title);
        if (defaultValue) System.out.print("(Y/n): ");
        else System.out.print("(y/N): ");

        String userInput = sc.nextLine();
        return userInput.isEmpty() ? defaultValue : userInput.equalsIgnoreCase("y");
    }
    static boolean confirm(String title) {
        return confirm(title, false);
    }
}

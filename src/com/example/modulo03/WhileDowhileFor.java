package com.example.modulo03;

public class WhileDowhileFor {
    public static void main(String[] args) {

        int x = 0;

        while (x <= 10) {
            System.out.println(x);
            x++;
        }

        int x2 = 0;

        while (true) {
            System.out.println(x2);

            if (x2 == 10) {
                break;
            }
            x2++;
        }

        int x3 = 0;

        while (x3 < 10) {
            x3++;

            if (x3 == 5) {
                continue;
            }

            System.out.println(x3);
        }

        int y = 0;

        do {
            System.out.println(y);
            y++;
        } while (y <= 10);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int i = 0;
        for (; ;) {
            System.out.println(i);
            i++;
            if (i == 10) {
                break;
            }
        }
    }
}

package com.company;

public class LeftTriangle {
    void leftTriangle() {
        int i, j;
        for (i = 0; i < 4; i++) {
            for (j = 2 * (5 - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

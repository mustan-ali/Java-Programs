package com.company;

public class PyramidTriangle {
    void pyramidTriangle() {
        int i, j;
        for (i = 0; i < 4; i++) {
            for (j = 4 - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

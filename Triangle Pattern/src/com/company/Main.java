package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        RightTriangle RT = new RightTriangle();
        RT.rightTriangle();

        System.out.println("-------------------------------------");

        LeftTriangle LT = new LeftTriangle();
        LT.leftTriangle();

        System.out.println("-------------------------------------");

        PyramidTriangle PT = new PyramidTriangle();
        PT.pyramidTriangle();

        System.out.println("-------------------------------------");
    }
}

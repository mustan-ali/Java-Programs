package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter 1st Number: ");
        float a = s.nextInt();

        System.out.println("Enter 2nd Number: ");
        float b = s.nextInt();

        CalculatorInput ci = new CalculatorInput();
        Calculation c = new Calculation();

        ci.FirstNumber(a);
        ci.SecondNumber(b);

        System.out.println("Enter Operator [ + - / * ]: ");
        char operator = s.next().charAt(0);

        if (operator == '+') {
            float r = c.add(a, b);
            System.out.println("Addition " + ci.getNumber1() + " + " + ci.getNumber2() + " = " + r);
        }

        else if (operator == '-') {
            float r = c.subtract(ci.getNumber1(), ci.getNumber2());
            System.out.println("Subtraction: " + ci.getNumber1() + " - " + ci.getNumber2() + " = " + r);
        }

        else if (operator == '*') {
            float r = c.multiply(ci.getNumber1(), ci.getNumber2());
            System.out.println("Multiplication " + ci.getNumber1() + " * " + ci.getNumber2() + " = " + r);
        }

        else if (operator == '/') {
            float r = c.divide(ci.getNumber1(), ci.getNumber2());
            System.out.println("Division " + ci.getNumber1() + " / " + ci.getNumber2() + " = " + r);
        }

    }
}

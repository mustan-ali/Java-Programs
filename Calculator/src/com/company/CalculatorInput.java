package com.company;

public class CalculatorInput {
    private float number1, number2;

    public void FirstNumber(float n1) {
        this.number1 = n1;
    }

    public void SecondNumber(float n2) {
        this.number2 = n2;
    }

    public float getNumber1() {
        return number1;
    }

    public float getNumber2() {
        return number2;
    }
}

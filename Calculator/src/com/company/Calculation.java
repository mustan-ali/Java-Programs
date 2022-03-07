package com.company;

public class Calculation {
    float result;

    //Method for addition
    public float add(float num1, float num2) {
        result = num1 + num2;
        return result;
    }

    //Method for subtraction
    public float subtract(float num1, float num2) {
        result = num1 - num2;
        return result;
    }

    //Method for multiplication
    public float multiply(float num1, float num2) {
        result = num1 * num2;
        return result;
    }

    //Method for division
    public float divide(float num1, float num2) {
        result = num1 / num2;
        return result;
    }
}

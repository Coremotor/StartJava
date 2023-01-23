package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public double calculate(double a, double b, char action) {
        return switch (action) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '^' -> pow(a, b);
            case '%' -> a % b;
            default -> throw new IllegalStateException("Неопознанное действие: " + action);
        };
    }

    private int pow(double a, double b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }
}

package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public double calculate(double a, char action, double b) {
        return switch (action) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '^' -> Math.pow(a, b);
            case '%' -> a % b;
            default -> throw new IllegalStateException("Неопознанное действие: " + action);
        };
    }
}

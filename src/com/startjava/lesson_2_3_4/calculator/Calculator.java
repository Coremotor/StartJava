package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    static public double calculate(String expression) {
        String[] partsExpression = expression.split(" ");

        double a = validNumber(partsExpression[0]);
        char action = partsExpression[1].charAt(0);
        double b = validNumber(partsExpression[2]);

        if (a < 1 || b < 1) {
            throw new IllegalArgumentException("Операнды должны быть положительным");
        }

        return switch (action) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '^' -> Math.pow(a, b);
            case '%' -> a % b;
            default -> throw new IllegalArgumentException("Неопознанное действие: " + action);
        };
    }

    private static double validNumber(String number) {
        double result;

        try {
            result = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Вводимые операнды должны быть целыми числами");
        }

        return result;
    }
}

package com.startjava.lesson_1.final_pkg;

public class Calculator {

    public static void main(String[] args) {
        char action = '/';

        double a = 5, b = 2;

        double result = switch (action) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '^' -> pow(a, b);
            case '%' -> a % b;
            default -> throw new IllegalStateException("Неопознанное действие: " + action);
        };

        System.out.print(a + " " + action + " " + b + " = ");
        if (result % 1 == 0) {
            System.out.println((int) result);
        } else {
            System.out.println(result);
        }
    }

    private static int pow(double a, double b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }
}

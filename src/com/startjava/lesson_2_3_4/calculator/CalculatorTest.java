package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer = "yes";

        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                System.out.println("Введите математическое выражение через пробел:");
                String expression = scanner.nextLine();

                try {
                    double result = Calculator.calculate(expression);
                    printResult(expression, result);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            answer = scanner.nextLine();
        }
    }

    private static void printResult(String expression, double result) {
        System.out.print(expression + "=");
        if (result % 1 == 0) {
            System.out.println((int) result);
        } else {
            System.out.println(result);
        }
    }
}

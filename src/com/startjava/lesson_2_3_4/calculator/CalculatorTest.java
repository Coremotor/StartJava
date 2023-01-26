package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        String answer = "yes";

        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                System.out.println("Введите математическое выражение:");
                String expression = scanner.next();
                String[] expressionArray = expression.split("");

                int a = Integer.parseInt(expressionArray[0]);
                char action = expressionArray[1].charAt(0);
                int b = Integer.parseInt(expressionArray[2]);

                double result = calculator.calculate(a, action, b);
                printResult(expression, result);
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            answer = scanner.next();
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

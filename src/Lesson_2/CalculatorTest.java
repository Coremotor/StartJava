package Lesson_2;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        String answer = "yes";

        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                System.out.println("Введите первое число:");
                double a = scanner.nextDouble();

                System.out.println("Введите знак математической операции:");
                char action = scanner.next().charAt(0);

                System.out.println("Введите второе число:");
                double b = scanner.nextDouble();

                double result = calculator.calculate(a, b, action);
                printResult(a, action, b, result);
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            answer = scanner.next();
        }
    }

    private static void printResult(double a, char action, double b, double result) {
        System.out.print(a + " " + action + " " + b + " = ");
        if (result % 1 == 0) {
            System.out.println((int) result);
        } else {
            System.out.println(result);
        }
    }
}

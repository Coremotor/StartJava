package Lesson_2;

public class Calculator {
    public void calculate(double a, double b, char action) {
        double result = switch (action) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '^' -> pow(a, b);
            case '%' -> a % b;
            default -> throw new IllegalStateException("Неопознанное действие: " + action);
        };

        printResult(a, action, b, result);
    }

    public static void printResult(double a, char action, double b, double result) {
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

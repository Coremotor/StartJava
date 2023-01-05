package Lesson_1;

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

        System.out.println(a + " " + action + " " + b + " = "
                + (result % 1 == 0 ? (int) result : result));
    }

    private static int pow(double a, double b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }
}

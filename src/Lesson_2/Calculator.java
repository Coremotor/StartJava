package Lesson_2;

public class Calculator {
    public double calculate(double a, double b, char action) {
        double result = switch (action) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '^' -> pow(a, b);
            case '%' -> a % b;
            default -> throw new IllegalStateException("Неопознанное действие: " + action);
        };

        return result;
    }

    private int pow(double a, double b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }
}

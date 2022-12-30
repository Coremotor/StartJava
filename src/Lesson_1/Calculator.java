package Lesson_1;

public class Calculator {

    public static void main(String[] args) {
        char action = '^';

        int a = 5, b = 2, result = 0;
        double resultDivision = 0;

        switch (action) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> resultDivision = (double) a / (double) b;
            case '^' -> result = exponentiation(a, b);
            case '%' -> result = a % b;
        }

        System.out.println(a + " " + action + " " + b + " = " + (action == '/' ? resultDivision : result));
    }

    private static int exponentiation(int a, int b) {
        int temp = 1;
        for (int i = 1; i <= b; i++) {
            temp = temp * a;
        }
        return temp;
    }
}

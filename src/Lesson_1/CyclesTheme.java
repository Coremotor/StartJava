package Lesson_1;

import Utils.PrintTitle;

public class CyclesTheme {

    public static void main(String[] args) {
        //1
        PrintTitle.printTitle("1. Подсчет суммы четных и нечетных чисел");

        int sumEven = 0;
        int sumOdd = 0;
        byte startOfSegment = -10;

        do {
            if (startOfSegment % 2 == 0) {
                sumEven += startOfSegment;
            } else {
                sumOdd += startOfSegment;
            }
            startOfSegment++;
        } while (startOfSegment < 22);

        System.out.println("В промежутке [-10, 21] сумма четных чисел = "
                + sumEven + ", а нечетных = " + sumOdd);

        //2
        PrintTitle.printTitle("2. Вывод чисел в интервале (min и max) в порядке убывания");

        byte num1 = 10;
        byte num2 = 5;
        byte num3 = -1;
        byte max;
        byte min;

        if (num1 > num2) {
            max = num1 > num3 ? num1 : num3;
        } else {
            max = num2 > num3 ? num2 : num3;
        }

        if (num1 < num2) {
            min = num1;
        } else {
            min = num2;
        }

        if (min > num3) {
            min = num3;
        }

        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        //3
        PrintTitle.printTitle("3. Вывод реверсивного числа и суммы его цифр");

        int initialNumber = 1234, sum = 0, remainder;
        int number = initialNumber;

        System.out.print("Число в обратном порядке: ");

        while (number > 0) {
            remainder = number % 10;
            System.out.print(remainder);
            sum += remainder;
            number /= 10;
        }

        System.out.println("\nСумма цифр: " + sum);

        //4
        PrintTitle.printTitle("4. Вывод чисел на консоль в несколько строк");

        int count = 0, numberIntPerLine = 5;

        for (int i = 1; i < 24; i += 2) {
            count++;
            System.out.printf("%3d", i);

            if (count % numberIntPerLine == 0) {
                System.out.println();
            }
         }

        int numberOfMissingCharacters = numberIntPerLine - count % numberIntPerLine;
        for (int i = 0; i < numberOfMissingCharacters; i++) {
            System.out.printf("%3d", 0);
        }

        //5
        PrintTitle.printTitle("5. Проверка количества двоек на четность/нечетность");

        initialNumber = 324259;
        number = initialNumber;

        int countTwos = 0;

        while (number > 0) {
            if (number % 10 == 2) {
                countTwos++;
            }
            number /= 10;
        }

        System.out.println("Число: " + initialNumber + " содержит: " + countTwos
                + (countTwos % 2 == 0 ? " (четное)" : " (не четное)") + " число двоек");

        //6
        PrintTitle.printTitle("6. Отображение фигур в консоли");

        //6.1
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //6.2
        int i = 5;
        while (i > 0) {
            int j = i;
            while (j > 0) {
                System.out.print("#");
                j--;
            }
            i--;
            System.out.print("\n");
        }

        //6.3
        max = 3;
        i = 1;

        do {
            int j = max;
            do {
                j--;
            } while (j >= i);

            int k = i;
            do {
                System.out.print("$");
                k--;
            } while (k > 0);

            i++;
            System.out.print("\n");
        } while (i <= max);


        int s = max - 1;

        do {
            int j = max;
            do {
                j--;
            } while (j >= s);

            int k = s + 1;
            do {
                k--;
                System.out.print("$");
            } while (k > 1);

            s--;
            System.out.print("\n");
        } while (s >= 1);

        //7
        PrintTitle.printTitle("7. Отображение ASCII-символов");

        System.out.printf("%5s", "Dec");
        System.out.printf("%10s", "Char\n");

        for (int j = 1; j < 48; j++) {
            if (!(j % 2 == 0)) {
                System.out.printf("%5s", j);
                System.out.printf("%10s", (char) j + "\n");
            }
        }

        for (int j = 97; j < 123; j++) {
            if (j % 2 == 0) {
                System.out.printf("%5s", j);
                System.out.printf("%10s", (char) j + "\n");
            }
        }

        //8
        PrintTitle.printTitle("8. Проверка, является ли число палиндромом");

        int num = 1234321, reversedNum = 0;

        int originalNum = num;

        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        if (originalNum == reversedNum) {
            System.out.println("Число " + originalNum + " является палиндромом.");
        }

        //9
        PrintTitle.printTitle("9. Определение, является ли число счастливым");

        int initNum = 123123, sumFirstHalf = 0, sumSecondHalf = 0;
        number = initNum;

        String numToString = Integer.toString(initNum);

        System.out.print("Сумма цифр ");
        for (int j = 0; j < 3; j++) {
            sumFirstHalf += number % 10;
            number = number / 10;
        }
        System.out.println(numToString.substring(0, 3) + " = " + sumFirstHalf);

        System.out.print("Сумма цифр ");
        for (int j = 3; j < 6; j++) {
            sumSecondHalf += number % 10;
            number = number / 10;
        }
        System.out.println(numToString.substring(3) + " = " + sumSecondHalf);

        System.out.println("Число " + initNum + " является " +
                (sumFirstHalf == sumSecondHalf ? "счастливым" : "не счастливым"));

        //10
        PrintTitle.printTitle("10. Вывод таблицы умножения Пифагора");

        System.out.print("  |");
        for (int j = 2; j < 10; j++) {
            System.out.printf("%4d", j);
        }

        System.out.println();

        for (int j = 2; j < 38; j++) {
            System.out.print("-");
        }

        System.out.println();

        for (int j = 2; j < 10; j++) {
            System.out.print(j + " |");
            for (int k = 2; k < 10; k++) {
                System.out.printf("%4d", (k * j));
            }
            System.out.println();
        }
    }
}

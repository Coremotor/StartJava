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
        byte num2 = 2;
        byte num3 = -1;
        byte min = num2;
        byte max = num1;

        if(num1 < num2) {
            max = num2;
            min = num1;
        }
        if(min > num3) {
            min = num3;
        }
        if(max < num3) {
            max = num3;
        }

        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        //3
        PrintTitle.printTitle("3. Вывод реверсивного числа и суммы его цифр");

        int initialNumber = 1234, sum = 0;
        int number = initialNumber;

        System.out.print("Число в обратном порядке: ");

        while (number > 0) {
            int remainder = number % 10;
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
        int copyInitialNumber = initialNumber;

        int countTwos = 0;

        while (copyInitialNumber > 0) {
            if (copyInitialNumber % 10 == 2) {
                countTwos++;
            }
            copyInitialNumber /= 10;
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
            System.out.println();
        }

        //6.2
        int numberOfLines = 5;
        while (numberOfLines > 0) {
            int numberOfCharactersPerLine = numberOfLines;
            while (numberOfCharactersPerLine > 0) {
                System.out.print("#");
                numberOfCharactersPerLine--;
            }
            numberOfLines--;
            System.out.println();
        }

        //6.3
        max = 3;
        numberOfLines = 1;

        do {
            int numberOfCharactersPerLine = numberOfLines;
            do {
                System.out.print("$");
                numberOfCharactersPerLine--;
            } while (numberOfCharactersPerLine > 0);

            numberOfLines++;
            System.out.println();
        } while (numberOfLines <= max);


        numberOfLines = max - 1;

        do {
            int numberOfCharactersPerLine = numberOfLines + 1;
            do {
                numberOfCharactersPerLine--;
                System.out.print("$");
            } while (numberOfCharactersPerLine > 1);

            numberOfLines--;
            System.out.println();
        } while (numberOfLines >= 1);

        //7
        PrintTitle.printTitle("7. Отображение ASCII-символов");

        System.out.printf("%5s", "Dec");
        System.out.printf("%12s", "Char\n");

        for (int j = 1; j < 48; j++) {
            if (j % 2 != 0) {
                System.out.printf("%5s %10c", j, j);
                System.out.println();
            }
        }

        for (int j = 97; j < 123; j++) {
            if (j % 2 == 0) {
                System.out.printf("%5s %10c", j, j);
                System.out.println();
            }
        }

        //8
        PrintTitle.printTitle("8. Проверка, является ли число палиндромом");

        initialNumber = 1234321;
        int reversedNum = 0;
        copyInitialNumber = initialNumber;

        while (copyInitialNumber != 0) {
            int remainder = copyInitialNumber % 10;
            reversedNum = reversedNum * 10 + remainder;
            copyInitialNumber /= 10;
        }

        if (initialNumber == reversedNum) {
            System.out.println("Число " + initialNumber + " является палиндромом.");
        }

        //9
        PrintTitle.printTitle("9. Определение, является ли число счастливым");

        initialNumber = 123123;
        int sumLeftHalf = 0, sumRightHalf = 0;
        copyInitialNumber = initialNumber;

        int reversedNumber = 0;
        while (copyInitialNumber != 0) {
            reversedNumber = reversedNumber * 10 + copyInitialNumber % 10;
            copyInitialNumber /= 10;
        }

        System.out.print("Сумма цифр ");
        for (int j = 0; j < 3; j++) {
            int remainder = reversedNumber % 10;
            sumLeftHalf += remainder;
            System.out.print(remainder);
            reversedNumber = reversedNumber / 10;
        }
        System.out.println(" = " + sumLeftHalf);

        System.out.print("Сумма цифр ");
        for (int j = 3; j < 6; j++) {
            int remainder = reversedNumber % 10;
            sumRightHalf += remainder;
            System.out.print(remainder);
            reversedNumber = reversedNumber / 10;
        }
        System.out.println(" = " + sumRightHalf);

        System.out.println("Число " + initialNumber + " является " +
                (sumLeftHalf == sumRightHalf ? "счастливым" : "не счастливым"));

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

package com.startjava.lesson_2_3_4.array;

import com.startjava.utils.PrintArray;
import com.startjava.utils.PrintTitle;

public class ArrayTheme {
    public static void main(String[] args) {

        PrintTitle.printTitle("1. Реверс значений массива");

        int[] numbers = {2, 1, 4, 3, 7, 6, 5};
        int len = numbers.length;

        System.out.println("Init array: ");
        PrintArray.printIntArray(numbers);

        for (int i = 0; i < len / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[len - 1 - i];
            numbers[len - 1 - i] = temp;
        }

        System.out.println("Reverse array: ");
        PrintArray.printIntArray(numbers);

        PrintTitle.printTitle("2. Вывод произведения элементов массива");

        int[] numbers2 = new int[10];
        len = numbers2.length;
        for (int i = 0; i < len; i++) {
            numbers2[i] = i;
        }

        int result = 1;
        for (int i = 1; i < len - 1; i++) {
            result *= numbers2[i];
            System.out.print(numbers2[i] + ((i < len - 2) ? " * " : " = " + result));
        }
        System.out.println();
        System.out.println("First element = " + numbers2[0] + ". Last element = " + numbers2[9]);

        PrintTitle.printTitle("3. Удаление элементов массива");

        double[] number3 = new double[15];
        len = number3.length;

        System.out.println("Init array:");
        for (int i = 0; i < len; i++) {
            number3[i] = Math.random();
        }
        PrintArray.printDoubleArray(number3);

        System.out.println("Changed array:");
        int zeroCount = 0;
        double middle = number3[len / 2];
        for (int i = 0; i < len; i++) {
            if (number3[i] > middle) {
                number3[i] = 0;
                zeroCount++;
            }
        }
        PrintArray.printDoubleArray(number3);
        System.out.println("Number of zeroed elements: " + zeroCount);

        PrintTitle.printTitle("4. Вывод элементов массива лесенкой в обратном порядке");

        char[] alphabet = new char[26];
        len = alphabet.length;

        for (int i = 0; i < len; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        for (int i = len - 1; i >= 0; i--) {
            for (int j = len - 1; j >= i; j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }

        PrintTitle.printTitle("5. Генерация уникальных чисел");

        int[] numbers4 = new int[30];
        len = numbers4.length;

        for (int i = 0; i < len; i++) {
            int randomNumber;
            boolean isUnique;
            do {
                randomNumber = (int) (Math.random() * 40 + 60);
                isUnique = false;
                for (int j = 0; j < i; j++) {
                    if (randomNumber == numbers4[j]) {
                        isUnique = true;
                        break;
                    }
                }
            } while (isUnique);
            numbers4[i] = randomNumber;
        }

        for (int i = len - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers4[j] > numbers4[j + 1]) {
                    int temp = numbers4[j];
                    numbers4[j] = numbers4[j + 1];
                    numbers4[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < len; i++) {
            System.out.printf("%3d", numbers4[i]);
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

    }
}

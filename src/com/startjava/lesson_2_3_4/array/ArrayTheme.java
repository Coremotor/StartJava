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

        for (int i = len - 1, j = 0; i >= len / 2; i--, j++) {
            int temp = numbers[j];
            numbers[j] = numbers[i];
            numbers[i] = temp;
        }

        System.out.println("Reverse array: ");
        PrintArray.printIntArray(numbers);

        PrintTitle.printTitle("2. Вывод произведения элементов массива");

        int[] numbers2 = new int[10];
        len = numbers2.length;
        for (int i = 0; i < len; i++) {
            numbers2[i] = i;
        }

        int product = 1;
        for (int i = 1; i < len - 1; i++) {
            product *= numbers2[i];
            System.out.print(numbers2[i] + ((i < len - 2) ? " * " : " = " + product));
        }
        System.out.println("\nFirst element = " + numbers2[0] + ". Last element = " + numbers2[9]);

        PrintTitle.printTitle("3. Удаление элементов массива");

        double[] randomNumbers = new double[15];
        len = randomNumbers.length;

        System.out.println("Init array:");
        for (int i = 0; i < len; i++) {
            randomNumbers[i] = Math.random();
        }
        PrintArray.printDoubleArray(randomNumbers);

        System.out.println("Changed array:");
        int zeroCount = 0;
        double middleNumber = randomNumbers[len / 2];
        for (int i = 0; i < len; i++) {
            if (randomNumbers[i] > middleNumber) {
                randomNumbers[i] = 0;
                zeroCount++;
            }
        }
        PrintArray.printDoubleArray(randomNumbers);
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

        int[] uniqueNumbers = new int[30];
        len = uniqueNumbers.length;

        for (int i = 0; i < len; i++) {
            int randomNumber;
            boolean unique;
            do {
                randomNumber = (int) (Math.random() * 40 + 60);
                unique = false;
                for (int j = 0; j < i; j++) {
                    if (randomNumber == uniqueNumbers[j]) {
                        unique = true;
                        break;
                    }
                }
            } while (unique);
            uniqueNumbers[i] = randomNumber;
        }

        for (int i = len - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (uniqueNumbers[j] > uniqueNumbers[j + 1]) {
                    int temp = uniqueNumbers[j];
                    uniqueNumbers[j] = uniqueNumbers[j + 1];
                    uniqueNumbers[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < len; i++) {
            System.out.printf("%3d", uniqueNumbers[i]);
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        PrintTitle.printTitle("6. Сдвиг элементов массива");

        String[] initArray = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        len = 0;
        for (String string : initArray) {
            if (!string.isBlank()) {
                len++;
            }
        }

        String[] changedArray = new String[len];
        len = initArray.length;
        for (int i = 0, j = 0; i < len; i++) {
            int position = 0;
            while ((!initArray[i].isBlank()) && (i < len - 1)) {
                position++;
                i++;
            }
            System.arraycopy(initArray, i - position, changedArray, j, position);
            j += position;
        }

        PrintArray.printStringArray(initArray);
        PrintArray.printStringArray(changedArray);
    }
}

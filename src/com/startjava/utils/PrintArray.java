package com.startjava.utils;

public class PrintArray {
    public static void printIntArray(int[] array) {
        for (int number :
                array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void printDoubleArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.5s %s", array[i], " ");
            if (i == 7) {
                System.out.println();
            }
        }
        System.out.println();
    }
}

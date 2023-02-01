package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private final int[] numbers = new int[10];
    private int countAttempts;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addNumber(int number) {
        numbers[countAttempts] = number;
        countAttempts++;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, countAttempts);
    }

    public int getAnswerCount() {
        return countAttempts;
    }

    public void clearAttempts() {
        Arrays.fill(numbers, 0, countAttempts, 0);
        countAttempts = 0;
    }
}
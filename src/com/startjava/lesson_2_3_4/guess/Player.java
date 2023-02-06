package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private final int[] numbers = new int[10];
    private int countAttempts;
    private int winCount;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addNumber(int number) {
        if (number <= 0 || number > 100) {
            throw new IllegalArgumentException("Число должно быть в интервале от 1 до 100 включительно. Введите еще раз");
        }
        numbers[countAttempts] = number;
        countAttempts++;
    }

    public int getNumber() {
        return numbers[countAttempts - 1];
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

    public int getWinCount() {
        return winCount;
    }

    public void setWinCount() {
        winCount += 1;
    }

    public void clearWinCount() {
        winCount = 0;
    }
}
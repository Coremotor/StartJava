package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private final int[] numbers = new int[10];
    private int answerCount = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void saveNumber(int number) {
        numbers[answerCount] = number;
        answerCount++;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, answerCount);
    }

    public int getAnswerCount() {
        return answerCount;
    }

    public void reset() {
        Arrays.fill(numbers, 0, answerCount, 0);
        answerCount = 0;
    }
}
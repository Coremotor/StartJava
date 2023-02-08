package com.startjava.lesson_2_3_4.guess;

import com.startjava.utils.PrintTitle;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private final Player[] players;
    private int rounds = 1;
    private final int ATTEMPTS_COUNT = 3;

    public GuessNumber(Player... players) {
        this.players = players;
    }

    public void start() {
        Random random = new Random();
        castLots();

        do {
            PrintTitle.printTitle("Раунд №" + rounds + ". У каждого игрока по 10 попыток");

            int secretNumber = random.nextInt(1, 10);

            for (Player player : players) {
                player.clearAttempts();
            }

            boolean roundIsPLaying = true;
            do {
                for (Player player : players) {
                    if (hasAttempts(player)) {
                        roundIsPLaying = false;
                        printPlayerNumbers();
                        break;
                    }

                    while (true) {
                        try {
                            inputNumber(player);
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Внимание: " + e.getMessage());
                        }
                    }

                    if (isGuessed(player, secretNumber)) {
                        roundIsPLaying = false;
                        printPlayerNumbers();
                        break;
                    }
                }
            } while (roundIsPLaying);
            rounds++;
        } while (rounds < 4);

        identifyWinner();
        for (Player player : players) {
            player.clearWinCount();
        }
        rounds = 1;
        System.out.println("\nGame over\n");
    }


    private void castLots() {
        for (int i = players.length - 1; i > 1; i--) {
            int j = (int) (Math.random() * i);
            Player temp = players[j];
            players[j] = players[i];
            players[i] = temp;
        }
    }

    private boolean hasAttempts(Player player) {
        if (player.getAnswerCount() == ATTEMPTS_COUNT) {
            System.out.println("У " + player.getName() + " закончились попытки");
            return true;
        }
        return false;
    }

    private void printPlayerNumbers() {
        for (Player player : players) {
            System.out.print("Названные числа игроком " + player.getName() + ": ");
            for (int number : player.getNumbers()) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    private void inputNumber(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(player.getName() + " введите число:");
        player.addNumber(scanner.nextInt());
    }

    private boolean isGuessed(Player player, int secretNumber) {
        if (secretNumber == player.getNumber()) {
            player.incrementWinCount();
            System.out.println("Игрок " + player.getName() + " угадал число "
                    + player.getNumber() + " с " + player.getAnswerCount() + " попытки\n");
            return true;
        }

        String moreLess = secretNumber < player.getNumber() ? "больше" : "меньше";
        System.out.println("Число " + player.getNumber() + " от игрока "
                + player.getName() + " " + moreLess + " , чем загадал компьютер");

        return false;
    }

    private void identifyWinner() {
        int maxScore = 0;
        int countWinner = 0;
        for (Player player : players) {
            int score = player.getWinCount();
            if (score > maxScore) {
                maxScore = score;
                countWinner = 1;
            } else if (score == maxScore) {
                countWinner++;
            }
        }
        if (countWinner == 1) {
            System.out.print("\nПобедитель: ");
        } else {
            System.out.print("\nПобедители: ");
        }
        for (Player player : players) {
            if (player.getWinCount() == maxScore) {
                System.out.print(player.getName() + " ");
            }
        }
        System.out.println();
    }
}
package com.startjava.lesson_2_3_4.guess;

import com.startjava.utils.PrintTitle;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private final Player[] players;

    public GuessNumber(Player[] players) {
        this.players = players;
    }

    public void start() {
        Random random = new Random();

        PrintTitle.printTitle("У каждого игрока по 10 попыток");

        int secretNumber = random.nextInt(1, 100);

        for (Player player : players) {
            player.clearAttempts();
        }

        boolean loop = true;
        do {
            for (Player player : players) {
                if (isAttemptsEnds(player)) {
                    loop = false;
                    printPlayerNumbers(players);
                    break;
                }

                sayNumber(player);

                if (isGuessed(player, secretNumber)) {
                    loop = false;
                    printPlayerNumbers(players);
                    break;
                }
            }
        } while (loop);
    }

    private boolean isGuessed(Player player, int secretNumber) {
        if (secretNumber == player.getNumber()) {
            System.out.println("Игрок " + player.getName() + " угадал число "
                    + player.getNumber() + " с " + player.getAnswerCount() + " попытки");
            return true;
        }

        String moreLess = secretNumber < player.getNumber() ? "больше" : "меньше";
        System.out.println("Число " + player.getNumber() + " от игрока "
                + player.getName() + " " + moreLess + " , чем загадал компьютер");

        return false;
    }

    private void printPlayerNumbers(Player[] players) {
        for (Player player : players) {
            System.out.print(player.getName() + ": ");
            for (int number : player.getNumbers()) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    private boolean isAttemptsEnds(Player player) {
        int ATTEMPTS_COUNT = 10;
        if (player.getAnswerCount() == ATTEMPTS_COUNT) {
            System.out.println("У " + player.getName() + " закончились попытки");
            return true;
        }
        return false;
    }

    private void sayNumber(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(player.getName() + " введите число:");
        player.addNumber(scanner.nextInt());
    }
}
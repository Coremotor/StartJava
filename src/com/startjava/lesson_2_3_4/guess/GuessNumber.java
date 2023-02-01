package com.startjava.lesson_2_3_4.guess;

import com.startjava.utils.PrintTitle;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private final Player player1;
    private final Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        PrintTitle.printTitle("У каждого игрока по 10 попыток");

        int secretNumber = random.nextInt(1, 10);

        player1.clearAttempts();
        player2.clearAttempts();

        do {
            System.out.println(player1.getName() + " введите число:");
            int playerNumber = scanner.nextInt();
            player1.addNumber(playerNumber);

            if (isGuessedRight(player1, playerNumber, secretNumber)) {
                printPlayerNumbers(player1);
                printPlayerNumbers(player2);
                break;
            }

            System.out.println(player2.getName() + " введите число:");
            playerNumber = scanner.nextInt();
            player2.addNumber(playerNumber);

            if (isGuessedRight(player2, playerNumber, secretNumber)) {
                printPlayerNumbers(player1);
                printPlayerNumbers(player2);
                break;
            }

            if (isAnswersCountEnds(player1) || isAnswersCountEnds(player2)) {
                printPlayerNumbers(player1);
                printPlayerNumbers(player2);
                break;
            }
        } while (true);
    }

    private boolean isGuessedRight(Player player, int playerNumber, int secretNumber) {
        boolean result = false;
        if (secretNumber == playerNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число "
                    + playerNumber + " с " + player.getAnswerCount() + " попытки");
            result = true;
        } else if (secretNumber < playerNumber) {
            System.out.println("Число " + playerNumber + " от игрока "
                    + player.getName() + " больше, чем загадал компьютер");
        } else {
            System.out.println("Число " + playerNumber + " от игрока "
                    + player.getName() + " меньше, чем загадал компьютер");
        }
        return result;
    }

    private void printPlayerNumbers(Player player) {
        System.out.print(player.getName() + ": ");
        for (int number :
                player.getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private boolean isAnswersCountEnds(Player player) {
        boolean result = false;
        if (player.getAnswerCount() == 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
            result = true;
        }
        return result;
    }
}
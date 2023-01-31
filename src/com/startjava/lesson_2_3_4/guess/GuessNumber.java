package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private final Player player1;
    private final Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(1, 100);

        player1.reset();
        player2.reset();

        do {
            System.out.println(player1.getName() + " введите число:");
            int playerNumber = scanner.nextInt();
            player1.saveNumber(playerNumber);

            if (secretNumber == playerNumber) {
                printWinMgs(player1, playerNumber);
                printPlayersNumbers(player1, player2);
                break;
            }
            if (secretNumber < playerNumber) {
                printNumberMoreMgs(playerNumber, player1);
            } else {
                printNumberLessMgs(playerNumber, player1);
            }

            System.out.println(player2.getName() + " введите число:");
            playerNumber = scanner.nextInt();
            player2.saveNumber(playerNumber);

            if (secretNumber == playerNumber) {
                printWinMgs(player2, playerNumber);
                printPlayersNumbers(player1, player2);
                break;
            }
            if (secretNumber < playerNumber) {
                printNumberMoreMgs(playerNumber, player2);
            } else {
                printNumberLessMgs(playerNumber, player2);
            }

            if (isAnswersCountEnds(player1) || isAnswersCountEnds(player2)) {
                printPlayersNumbers(player1, player2);
                break;
            }
        } while (true);
    }

    private void printNumberMoreMgs(int playerNumber, Player player) {
        System.out.println("Число " + playerNumber + " от игрока "
                + player.getName() + " больше, чем загадал компьютер");
    }

    private void printNumberLessMgs(int playerNumber, Player player) {
        System.out.println("Число " + playerNumber + " от игрока "
                + player.getName() + " меньше, чем загадал компьютер");
    }

    private void printWinMgs(Player player, int winNumber) {
        System.out.println("Игрок " + player.getName() + " угадал число "
                + winNumber + " с " + player.getAnswerCount() + " попытки");
    }

    private void printPlayersNumbers(Player player1, Player player2) {
        System.out.println(player1.getName() + ": " + Arrays.toString(player1.getNumbers()));
        System.out.println(player2.getName() + ": " + Arrays.toString(player2.getNumbers()));
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
package com.startjava.lesson_2_3.guess;

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

        int secretNumber = random.nextInt(1, 10);
        String player1Name = player1.getName();
        String player2Name = player2.getName();

        do {
            System.out.println(player1Name + " введите число:");
            int playerNumber = scanner.nextInt();
            if (secretNumber == playerNumber) {
                printWinMgs(player1Name);
                break;
            }
            if (secretNumber < playerNumber) {
                printNumberMoreMgs(playerNumber, player1Name);
            } else {
                printNumberLessMgs(playerNumber, player1Name);
            }

            System.out.println(player2Name + " введите число:");
            playerNumber = scanner.nextInt();
            if (secretNumber == playerNumber) {
                printWinMgs(player2Name);
                break;
            }
            if (secretNumber < playerNumber) {
                printNumberMoreMgs(playerNumber, player2Name);
            } else {
                printNumberLessMgs(playerNumber, player2Name);
            }
        } while (true);
    }

    private void printNumberMoreMgs(int playerNumber, String playerName) {
        System.out.println("Число " + playerNumber + " от игрока "
                + playerName + " больше, чем загадал компьютер");
    }

    private void printNumberLessMgs(int playerNumber, String playerName) {
        System.out.println("Число " + playerNumber + " от игрока "
                + playerName + " меньше, чем загадал компьютер");
    }

    private void printWinMgs(String playerName) {
        System.out.println("Игрок " + playerName + " победил!!!");
    }
}
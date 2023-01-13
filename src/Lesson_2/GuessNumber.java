package Lesson_2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    private final Player player1;
    private final Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        int secretNumber = random.nextInt(1, 100);
        int player1Number, player2Number;
        String player1Name = player1.getName();
        String player2Name = player2.getName();

        do {
            System.out.println(player1Name + "Введите число:");
            player1Number = scanner.nextInt();
            if (secretNumber != player1Number) {
                if (secretNumber < player1Number) {
                    printNumberMoreMgs(player1Number, player1Name);
                } else {
                    printNumberLessMgs(player1Number, player1Name);
                }

                System.out.println(player2Name + "Введите число:");
                player2Number = scanner.nextInt();
                if (secretNumber == player2Number) {
                    printWinMgs(player2Name);
                    return;
                } else if (secretNumber < player2Number) {
                    printNumberMoreMgs(player2Number, player2Name);
                } else {
                    printNumberLessMgs(player2Number, player2Name);
                }
            } else {
                printWinMgs(player1Name);
                return;
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
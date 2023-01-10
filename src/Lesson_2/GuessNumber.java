package Lesson_2;

import java.util.Random;

public class GuessNumber {
    private final Random random;
    private final Player player1;
    private final Player player2;

    public GuessNumber(Random random, Player player1, Player player2) {
        this.random = random;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        int computerNumber = random.nextInt(1, 100);
        int player1Number, player2Number = 0;
        String player1Name = player1.getName();
        String player2Name = player2.getName();

        do {
            player1Number = player1.sayNumber();
            if (computerNumber != player1Number) {
                if (computerNumber < player1Number) {
                    printNumberMoreMgs(player1Number, player1Name);
                } else {
                    printNumberLessMgs(player1Number, player1Name);
                }

                player2Number = player2.sayNumber();
                if (computerNumber == player2Number) {
                    printWinMgs(player2Name);
                } else if (computerNumber < player2Number) {
                    printNumberMoreMgs(player2Number, player2Name);
                } else {
                    printNumberLessMgs(player2Number, player2Name);
                }
            } else {
                printWinMgs(player1Name);
            }
        } while (computerNumber != player1Number && computerNumber != player2Number);
    }

    private static void printNumberMoreMgs(int playerNumber, String playerName) {
        System.out.println("Число " + playerNumber + " от игрока "
                + playerName + " больше, чем загадал компьютер");
    }

    private static void printNumberLessMgs(int playerNumber, String playerName) {
        System.out.println("Число " + playerNumber + " от игрока "
                + playerName + " меньше, чем загадал компьютер");
    }

    private static void printWinMgs(String playerName) {
        System.out.println("Игрок " + playerName + " победил!!!");
    }
}

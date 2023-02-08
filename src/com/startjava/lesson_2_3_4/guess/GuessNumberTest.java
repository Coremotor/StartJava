package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String answer = "yes";
        GuessNumber game = new GuessNumber(createPlayers(3));

        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                game.start();
            }
            System.out.println("Хотите продолжить игру? [yes/no]:");
            answer = scanner.nextLine();
        }
    }

    private static Player[] createPlayers(int countPlayers) {
        Player[] players = new Player[countPlayers];
        for (int i = 0; i < players.length; i++) {
            System.out.print("Игрок №" + (i + 1) + " введите имя: ");
            players[i] = new Player(scanner.nextLine());
        }
        return players;
    }
}
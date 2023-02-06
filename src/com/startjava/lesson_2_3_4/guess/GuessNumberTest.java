package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer = "yes";

        GuessNumber game = new GuessNumber(initPlayers());

        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                game.start();
            }
            System.out.println("Хотите продолжить игру? [yes/no]:");
            answer = scanner.nextLine();
        }
    }

    private static Player[] initPlayers() {
        Player[] players = new Player[3];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < players.length; i++) {
            System.out.print("Игрок №" + (i + 1) + " введите имя: ");
            players[i] = new Player(scan.nextLine());
        }
        return players;
    }
}
package com.startjava.lesson_2_3_4.guess;

import com.startjava.utils.PrintTitle;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer = "yes";

        PrintTitle.printTitle("У каждого игрока по 10 попыток");

        System.out.println("Введите имя первого игрока:");
        String name = scanner.nextLine();
        Player player1 = new Player(name);

        System.out.println("Введите имя второго игрока:");
        name = scanner.nextLine();
        Player player2 = new Player(name);

        GuessNumber guessNumber = new GuessNumber(player1, player2);

        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                guessNumber.startGame();
            }
            System.out.println("Хотите продолжить игру? [yes/no]:");
            answer = scanner.nextLine();
        }
    }
}
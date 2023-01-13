package Lesson_2;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer = "yes";

        System.out.println("Введите имя первого игрока:");
        String name = scanner.next();
        Player player1 = new Player(name);

        System.out.println("Введите имя второго игрока:");
        name = scanner.next();
        Player player2 = new Player(name);

        GuessNumber guessNumber = new GuessNumber(player1, player2);

        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                guessNumber.startGame();
            }
            System.out.println("Хотите продолжить игру? [yes/no]:");
            answer = scanner.next();
        }
    }
}
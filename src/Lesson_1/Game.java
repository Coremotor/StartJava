package Lesson_1;

import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int computerNumber = random.nextInt(1, 100), humanNumber;

        do {
            humanNumber = random.nextInt(1, 100);
            if (computerNumber < humanNumber) {
                System.out.println("Число " + humanNumber + " больше, чем загадал компьютер");
            } else {
                System.out.println("Число " + humanNumber + " меньше, чем загадал компьютер");
            }
        } while (computerNumber != humanNumber);

        System.out.println("Вы победили!!!");
    }
}

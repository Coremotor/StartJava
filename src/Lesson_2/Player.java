package Lesson_2;

import java.util.Random;

public class Player {
    private final String name;
    private final Random random;

    public Player(String name, Random random) {
        this.name = name;
        this.random = random;
    }

    public int sayNumber() {
        return random.nextInt(1, 100);
    }

    public String getName() {
        return name;
    }
}

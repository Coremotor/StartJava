package Lesson_2;

public class WolfTest {

    //    4. Инкапсуляция: геттеры/сеттеры
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.setGender("male");
        wolf.setName("Bob");
        wolf.setColor("Red");
        wolf.setWeight(120);
        wolf.setAge(14);

        System.out.println("Gender = " + wolf.getGender());
        System.out.println("Name = " + wolf.getName());
        System.out.println("Color = " + wolf.getColor());
        System.out.println("Weight = " + wolf.getWeight());
        System.out.println("Age = " + wolf.getAge());

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}

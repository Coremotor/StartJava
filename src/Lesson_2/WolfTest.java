package Lesson_2;

public class WolfTest {

//    3. Что такое объект
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.gender = "male";
        wolf.name = "Bob";
        wolf.weight = 120;
        wolf.age = 14;

        System.out.println("Gender = " + wolf.gender);
        System.out.println("Name = " + wolf.name);
        System.out.println("Weight = " + wolf.weight);
        System.out.println("Age = " + wolf.age);

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}

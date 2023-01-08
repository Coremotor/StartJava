package Lesson_2;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jagger1 = new Jaeger();
        jagger1.setName("Gypsy Danger");
        System.out.println(jagger1.getName());
        System.out.println("Height = " + jagger1.getHeight());
        System.out.println("Weight = " + jagger1.getWeight());
        System.out.println(jagger1.getName() + " killed Kaiju count = " + jagger1.getCountKilledKaiju());

        jagger1.killKaiju();
        jagger1.setCountKilledKaiju(jagger1.getCountKilledKaiju() + 1);
        System.out.println(jagger1.getName() + " killed Kaiju count = " + jagger1.getCountKilledKaiju());
        System.out.println();

        Jaeger jagger2 = new Jaeger("Striker Eureka", 150, 200);
        System.out.println(jagger2.getName());
        System.out.println("Height = " + jagger2.getHeight());
        System.out.println("Weight = " + jagger2.getWeight());

        jagger2.killKaiju();
        jagger2.killKaiju();
        jagger2.killKaiju();
        jagger2.setCountKilledKaiju(jagger2.getCountKilledKaiju() + 3);
        System.out.println(jagger2.getName() + " killed Kaiju count = " + jagger2.getCountKilledKaiju());
    }
}

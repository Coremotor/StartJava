package Lesson_2;

public class Jaeger {
    private String name;
    private int height;
    private int weight;
    private int countKilledKaiju;

    public Jaeger() {
        this.name = "Robot";
        this.height = 100;
        this.weight = 20;
        this.countKilledKaiju = 0;
    }

    public Jaeger(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void killKaiju() {
        System.out.println(name + " kill Kaiju !!!");
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getCountKilledKaiju() {
        return countKilledKaiju;
    }

    public void setCountKilledKaiju(int countKilledKaiju) {
        this.countKilledKaiju = countKilledKaiju;
    }
}

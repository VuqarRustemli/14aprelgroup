package demo;

public abstract class Animall {

    String name;
    int age;

    public Animall(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeNoise();
}
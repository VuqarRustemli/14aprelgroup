package demo;

public class Catt extends Animall {

    public Catt(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " deyir: Meow");
    }
}
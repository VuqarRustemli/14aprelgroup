package demo;

public class Lion extends Animall {

    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " deyir: Roar");
    }
}
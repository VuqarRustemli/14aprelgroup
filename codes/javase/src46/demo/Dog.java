package demo;

public class Dog extends Animall {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " deyir: Woof");
    }
}
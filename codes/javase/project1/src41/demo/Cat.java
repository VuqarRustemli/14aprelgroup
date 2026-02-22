package demo;

public class Cat extends Animall {

    private String breed;

    public Cat(String name, int age, String color, String breed) {
        super(name, age, color);
        this.breed = breed;
    }

    @Override
    public void showAll() {
        super.showAll();
        System.out.println("Breed: " + breed);
    }
}

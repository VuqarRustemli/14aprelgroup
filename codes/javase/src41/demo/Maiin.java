package demo;

public class Maiin {
    public static void main(String[] args) {

        Animal animal = new Animal("Unknown", 5, "Brown");
        System.out.println("Animal info:");
        animal.showAll();

        System.out.println("--------------------");

        Cat cat = new Cat("Mestan", 3, "White", "British Shorthair");
        System.out.println("Cat info:");
        cat.showAll();
    }
}

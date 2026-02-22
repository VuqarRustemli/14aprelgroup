package demo;

public class Maiin {
    public static void main(String[] args) {

        Animall animal = new Animall("Unknown", 5, "Brown");
        System.out.println("Animal info:");
        animal.showAll();

        System.out.println("--------------------");

        Catt cat = new Catt("Mestan", 3, "White", "British Shorthair");
        System.out.println("Cat info:");
        cat.showAll();
    }
}

package demo;

public class MainnClass {
    public static void main(String[] args) {

        Catt cat = new Catt("Mestan", 2);
        Dog dog = new Dog("Toplan", 4);
        Lion lion = new Lion("Simba", 6);

        cat.makeNoise();
        dog.makeNoise();
        lion.makeNoise();
    }
}
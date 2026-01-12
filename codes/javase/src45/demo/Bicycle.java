package demo;

public class Bicycle implements Transport {

    @Override
    public void move() {
        System.out.println("Bicycle is a transport which people can ride it with their foot.");
    }
}

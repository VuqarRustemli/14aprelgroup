package main2;

public class SlowRun implements RunStrategy {

    @Override
    public void run() {
        System.out.println("Personaj yavaş qaçır!");
    }
}
package demo;

public class Bus implements Transport {

    @Override
    public void move() {
        System.out.println("Buses is not that fast.");
    }
}

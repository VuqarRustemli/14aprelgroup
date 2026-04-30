package main3;

public class Mainn {
    public static void main(String[] args) {

        Car car = new Car.Builder()
                .setBrand("BMW")
                .setModel("M5")
                .setYear(2022)
                .setColor("Black")
                .build();

        System.out.println(car.getBrand() + " " + car.getModel());
    }
}
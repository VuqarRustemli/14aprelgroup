package demo;

public class Electronic extends Product {

    public Electronic(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateDiscount() {
        double discountedPrice = price * 0.8;
        System.out.println(name + " ucun endirimli qiymet (20%): " + discountedPrice);
        return discountedPrice;
    }
}
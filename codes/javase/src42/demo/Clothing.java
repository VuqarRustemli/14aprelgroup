package demo;

public class Clothing extends Product {

    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateDiscount() {
        double discountedPrice = price * 0.85;
        System.out.println(name + " ucun endirimli qiymet (15%): " + discountedPrice);
        return discountedPrice;
    }
}

package demo;

public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double calculateDiscount() {
        double discountedPrice = price * 0.9;
        System.out.println(name + " ucun endirimli qiymet (10%): " + discountedPrice);
        return discountedPrice;
    }
}
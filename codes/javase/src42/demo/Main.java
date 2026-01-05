package demo;

public class Main {
    public static void main(String[] args) {

        Product product = new Product("Kitab", 10);
        product.calculateDiscount();

        Electronic electronic = new Electronic("Laptop", 2000);
        electronic.calculateDiscount();

        Clothing clothing = new Clothing("Koynek", 150);
        clothing.calculateDiscount();
    }
}
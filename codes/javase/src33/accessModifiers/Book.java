package accessModifiers;

public class Book {

    public String title;
    protected String author;
    String genre;
    private double price;

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }
}
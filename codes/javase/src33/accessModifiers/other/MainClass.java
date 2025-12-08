package accessModifiers.other;

import accessModifiers.Book;

public class MainClass {
    public static void main(String[] args) {

        Book book = new Book();

        book.title = "Java Programming";
        
        book.setPrice(20.5);

        System.out.println("Book title: " + book.title);
        System.out.println("Book price: " + book.getPrice());
    }
}
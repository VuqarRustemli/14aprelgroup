package main3;

import java.util.ArrayList;
import java.util.List;

public class Mainclass {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Telefon", 1200));
        products.add(new Product("Monitor", 300));
        products.add(new Product("Mouse", 40));
        products.add(new Product("Noutbuk", 2500));
        products.add(new Product("Klaviatura", 50));

        String result = products.stream()
                .filter(p -> p.getPrice() > 60)    
                .map(Product::getName)                
                .sorted()                             
                .reduce("", (a, b) -> a + b + " ");   

        System.out.println(result.trim());
    }
}
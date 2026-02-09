package main;

import java.util.ArrayList;
import java.util.List;

public class HomeTask2 {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Python");
        words.add("C++");
        words.add("JavaScript");

        System.out.println("Original list: " + words);

        List<String> reversedList = new ArrayList<>();

        for (int i = words.size() - 1; i >= 0; i--) {
            reversedList.add(words.get(i));
        }

        System.out.println("Reversed list: " + reversedList);
    }
}
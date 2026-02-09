package main;

import java.util.ArrayList;
import java.util.List;

public class HomeTask1 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        int value = 10;

        while (numbers.size() < 40) {
            if (value % 2 == 0) {
                numbers.add(value);
            }
            value++;
        }

        System.out.println(numbers);
    }
}
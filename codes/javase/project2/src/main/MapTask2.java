package main;

import java.util.*;

public class MapTask2 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Math", 90);
        map.put("Physics", 80);
        map.put("Chemistry", 70);

        int sum = 0;

        for (int value : map.values()) {
            sum += value;
        }

        double average = (double) sum / map.size();

        System.out.println("Ortalama: " + average);
    }
}
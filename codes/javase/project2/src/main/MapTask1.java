package main;

import java.util.*;

public class MapTask1 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Ad", "Vüqar");
        map.put("Şəhər", "Bakı");
        map.put("Dövlət", "Azərbaycan");

        String longestKey = "";

        for (String key : map.keySet()) {
            if (key.length() > longestKey.length()) {
                longestKey = key;
            }
        }

        System.out.println("Ən uzun açar: " + longestKey);
    }
}
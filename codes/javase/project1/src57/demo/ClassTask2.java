package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class ClassTask2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(80);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(100);
        list.add(50);

        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (Integer num : list) {
            if (!unique.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Təkrarlanan elementlər: " + duplicates);
    }

}

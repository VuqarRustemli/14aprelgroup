package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Ali", 28));
        persons.add(new Person("Veli", 18));
        persons.add(new Person("Aysel", 35));
        persons.add(new Person("Murad", 22));

        System.out.println("Sıralanmamış siyahı:");
        for (Person p : persons) {
            System.out.println(p);
        }
    }
}
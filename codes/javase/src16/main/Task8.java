package main;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Həftənin gününü daxil edin: ");
        String gun = sc.nextLine();

        if (gun.equalsIgnoreCase("Şənbə") || gun.equalsIgnoreCase("Bazar")) {
            System.out.println("Həftə sonu");
        } else if (gun.equalsIgnoreCase("Bazar ertəsi") || gun.equalsIgnoreCase("Cümə")) {
            System.out.println("Həftənin başlanğıcı və ya sonu");
        } else {
            System.out.println("Həftə içi");
        }
    }
}

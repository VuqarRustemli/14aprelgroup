package main;

import java.util.Scanner;

public class Switchcasetask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Məhsul seçin:");
        System.out.println("1. Alma - 1.5 AZN");
        System.out.println("2. Portağal - 2.0 AZN");
        System.out.println("3. Banan - 1.8 AZN");
        System.out.println("4. Üzüm - 3.0 AZN");

        System.out.print("Seçiminizi daxil edin: ");
        int secim = sc.nextInt();

        switch (secim) {
            case 1 -> System.out.println("Alma - 1.5 AZN");
            case 2 -> System.out.println("Portağal - 2.0 AZN");
            case 3 -> System.out.println("Banan - 1.8 AZN");
            case 4 -> System.out.println("Üzüm - 3.0 AZN");
            default -> System.out.println("Yanlış məhsul seçimi!");
        }
    }
}
package main;

import java.util.Scanner;

public class Switchcasetask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ay nömrəsini daxil edin (1-12): ");
        int ay = sc.nextInt();

        switch (ay) {
            case 1 -> System.out.println("Yanvar");
            case 2 -> System.out.println("Fevral");
            case 3 -> System.out.println("Mart");
            case 4 -> System.out.println("Aprel");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("İyun");
            case 7 -> System.out.println("İyul");
            case 8 -> System.out.println("Avqust");
            case 9 -> System.out.println("Sentyabr");
            case 10 -> System.out.println("Oktyabr");
            case 11 -> System.out.println("Noyabr");
            case 12 -> System.out.println("Dekabr");
            default -> System.out.println("Yanlış ay nömrəsi!");
        }
    }
}


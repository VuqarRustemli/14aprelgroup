package main;

import java.util.Scanner;

public class Switchcasetask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ay nömrəsini daxil edin (1-12): ");
        int ay = sc.nextInt();

        switch (ay) {
            case 12, 1, 2 -> System.out.println("Qış");
            case 3, 4, 5 -> System.out.println("Yaz");
            case 6, 7, 8 -> System.out.println("Yay");
            case 9, 10, 11 -> System.out.println("Payız");
            default -> System.out.println("Yanlış ay nömrəsi!");
        }
    }
}

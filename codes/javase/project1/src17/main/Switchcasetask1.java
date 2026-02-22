package main;

import java.util.Scanner;

public class Switchcasetask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Gün nömrəsini daxil edin (1-7): ");
        int gun = sc.nextInt();

        switch (gun) {
            case 1 -> System.out.println("Bazar ertəsi");
            case 2 -> System.out.println("Çərşənbə axşamı");
            case 3 -> System.out.println("Çərşənbə");
            case 4 -> System.out.println("Cümə axşamı");
            case 5 -> System.out.println("Cümə");
            case 6 -> System.out.println("Şənbə");
            case 7 -> System.out.println("Bazar");
            default -> System.out.println("Yanlış gün nömrəsi!");
        }
    }
}

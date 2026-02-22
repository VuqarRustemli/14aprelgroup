package main;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Yaşınızı daxil edin: ");
        int yas = sc.nextInt();

        if (yas >= 18) {
            System.out.println("Yetişkinsən");
        } else {
            System.out.println("Uşaqsan");
        }
    }
}